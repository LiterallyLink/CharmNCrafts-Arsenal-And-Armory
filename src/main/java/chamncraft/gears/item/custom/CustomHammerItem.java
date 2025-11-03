package chamncraft.gears.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import java.util.List;

/**
 * Custom Hammer item that extends PickaxeItem
 * Mines in a configurable 3D area (width x height x depth)
 */
public class CustomHammerItem extends PickaxeItem {
    private final int mineWidth;
    private final int mineHeight;
    private final int mineDepth;
    
    public CustomHammerItem(ToolMaterial material, int attackDamage, 
                            float attackSpeed, Settings settings) {
        this(material, attackDamage, attackSpeed, settings, 3, 3, 1);
    }
    
    /**
     * Create a hammer with custom mining area
     * @param material Tool material
     * @param attackDamage Attack damage bonus
     * @param attackSpeed Attack speed
     * @param settings Item settings
     * @param width Mining width (left-right)
     * @param height Mining height (up-down)
     * @param depth Mining depth (away from player)
     */
    public CustomHammerItem(ToolMaterial material, int attackDamage, 
                            float attackSpeed, Settings settings,
                            int width, int height, int depth) {
        super(material, attackDamage, attackSpeed, settings);
        this.mineWidth = width;
        this.mineHeight = height;
        this.mineDepth = depth;
    }
    
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        // Add pattern tooltip
        String pattern = String.format("%dx%dx%d", mineWidth, mineHeight, mineDepth);
        tooltip.add(Text.translatable("tooltip.charmncrafts-gears-and-gadgets.hammer.pattern", pattern));
        super.appendTooltip(stack, world, tooltip, context);
    }
    
    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, 
                           BlockPos pos, LivingEntity miner) {
        // Call parent to handle normal mining
        if (super.postMine(stack, world, state, pos, miner)) {
            // Don't break blocks on client side
            if (!world.isClient) {
                breakBlocksInArea(world, pos, miner);
            }
            return true;
        }
        return false;
    }
    
    /**
     * Break all blocks in the mining area around the initial block
     * Based on player's facing direction (including up/down)
     */
    private void breakBlocksInArea(World world, BlockPos centerPos, LivingEntity miner) {
        int radiusWidth = mineWidth / 2;
        int radiusHeight = mineHeight / 2;
        
        // Get the direction the player is looking (includes vertical)
        Direction direction = getPlayerDirection(miner);
        
        // Iterate through all blocks in the area
        for (int width = -radiusWidth; width <= radiusWidth; width++) {
            for (int height = -radiusHeight; height <= radiusHeight; height++) {
                for (int depth = 0; depth < mineDepth; depth++) {
                    BlockPos targetPos = getOffsetPos(centerPos, direction, width, height, depth);
                    BlockState targetState = world.getBlockState(targetPos);
                    
                    // Don't break the center block twice, and skip air/bedrock
                    if (!targetPos.equals(centerPos) && !targetState.isAir() && targetState.getHardness(world, targetPos) >= 0) {
                        world.breakBlock(targetPos, true, miner);
                    }
                }
            }
        }
    }
    
    /**
     * Get the direction the player is facing, including vertical directions
     */
    private Direction getPlayerDirection(LivingEntity miner) {
        float pitch = miner.getPitch();
        float yaw = miner.getYaw();
        
        // If looking mostly up (pitch < -45), return UP
        if (pitch < -45) {
            return Direction.UP;
        }
        // If looking mostly down (pitch > 45), return DOWN
        else if (pitch > 45) {
            return Direction.DOWN;
        }
        // Otherwise use horizontal rotation
        else {
            return Direction.fromRotation(yaw);
        }
    }
    
    /**
     * Calculate block position based on player facing direction (including vertical)
     */
    private BlockPos getOffsetPos(BlockPos center, Direction facing, int width, int height, int depth) {
        switch (facing) {
            case UP: // Facing up (looking straight up)
                // Depth goes up, width is X (left-right), height is Z (forward-back)
                return center.add(width, depth, height);
                
            case DOWN: // Facing down (looking straight down)
                // Depth goes down, width is X (left-right), height is Z (forward-back)
                return center.add(width, -depth, height);
                
            case NORTH: // Facing north (negative Z)
                // Depth goes north, width is X (left-right), height is Y (up-down)
                return center.add(-width, height, -depth);
                
            case SOUTH: // Facing south (positive Z)
                // Depth goes south, width is X (left-right), height is Y (up-down)
                return center.add(width, height, depth);
                
            case EAST: // Facing east (positive X)
                // Depth goes east, width is Z (left-right), height is Y (up-down)
                return center.add(depth, height, -width);
                
            case WEST: // Facing west (negative X)
                // Depth goes west, width is Z (left-right), height is Y (up-down)
                return center.add(-depth, height, width);
                
            default:
                return center.add(width, height, depth);
        }
    }
}
