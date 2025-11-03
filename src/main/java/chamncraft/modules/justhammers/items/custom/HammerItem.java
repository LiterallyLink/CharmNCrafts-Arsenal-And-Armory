package chamncraft.modules.justhammers.items.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Hammer Item - Mines in a 3x3 area
 */
public class HammerItem extends PickaxeItem {

    public HammerItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient && state.getHardness(world, pos) != 0.0f) {
            // Mine 3x3 area around the broken block
            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    for (int z = -1; z <= 1; z++) {
                        if (x == 0 && y == 0 && z == 0) continue; // Skip center block (already mined)

                        BlockPos targetPos = pos.add(x, y, z);
                        BlockState targetState = world.getBlockState(targetPos);

                        // Check if the tool can mine this block
                        if (this.isSuitableFor(targetState)) {
                            // Break the block
                            world.breakBlock(targetPos, true, miner);
                            // Damage the tool
                            stack.damage(1, miner, (e) -> e.sendToolBreakStatus(miner.getActiveHand()));
                        }
                    }
                }
            }
        }

        return super.postMine(stack, world, state, pos, miner);
    }
}
