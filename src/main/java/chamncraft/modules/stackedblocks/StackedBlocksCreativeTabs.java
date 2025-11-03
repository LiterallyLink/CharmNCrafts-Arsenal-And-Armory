package chamncraft.modules.stackedblocks;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.stackedblocks.blocks.StackedBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * StackedBlocksCreativeTabs - Manages creative tabs for the Stacked Blocks module.
 */
public class StackedBlocksCreativeTabs {

    /**
     * Stacked Blocks creative tab containing all stacked blocks.
     */
    public static final ItemGroup STACKED_BLOCKS_TAB = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(CharmNCraftsMod.MOD_ID, "stackedblocks"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.charmncrafts.stackedblocks"))
            .icon(() -> new ItemStack(StackedBlocks.STACKED_OAK_LOGS))
            .entries((displayContext, entries) -> {
                // Building Blocks
                entries.add(StackedBlocks.STACKED_STONE_BLOCKS);
                entries.add(StackedBlocks.STACKED_COBBLESTONE_BLOCKS);
                entries.add(StackedBlocks.STACKED_NETHERRACK_BLOCKS);
                entries.add(StackedBlocks.STACKED_BRICKS);
                entries.add(StackedBlocks.STACKED_QUARTZ_BLOCKS);

                // Natural Blocks
                entries.add(StackedBlocks.STACKED_MELONS);
                entries.add(StackedBlocks.STACKED_PUMPKINS);

                // Overworld Wood Logs
                entries.add(StackedBlocks.STACKED_OAK_LOGS);
                entries.add(StackedBlocks.STACKED_SPRUCE_LOGS);
                entries.add(StackedBlocks.STACKED_BIRCH_LOGS);
                entries.add(StackedBlocks.STACKED_JUNGLE_LOGS);
                entries.add(StackedBlocks.STACKED_ACACIA_LOGS);
                entries.add(StackedBlocks.STACKED_DARK_OAK_LOGS);
                entries.add(StackedBlocks.STACKED_MANGROVE_LOGS);
                entries.add(StackedBlocks.STACKED_CHERRY_LOGS);
                entries.add(StackedBlocks.STACKED_BAMBOO_BLOCKS);

                // Stripped Wood Logs
                entries.add(StackedBlocks.STACKED_STRIPPED_OAK_LOGS);
                entries.add(StackedBlocks.STACKED_STRIPPED_SPRUCE_LOGS);
                entries.add(StackedBlocks.STACKED_STRIPPED_BIRCH_LOGS);
                entries.add(StackedBlocks.STACKED_STRIPPED_JUNGLE_LOGS);
                entries.add(StackedBlocks.STACKED_STRIPPED_ACACIA_LOGS);
                entries.add(StackedBlocks.STACKED_STRIPPED_DARK_OAK_LOGS);
                entries.add(StackedBlocks.STACKED_STRIPPED_MANGROVE_LOGS);
                entries.add(StackedBlocks.STACKED_STRIPPED_CHERRY_LOGS);
                entries.add(StackedBlocks.STACKED_STRIPPED_BAMBOO_BLOCKS);

                // Nether Stems
                entries.add(StackedBlocks.STACKED_CRIMSON_STEMS);
                entries.add(StackedBlocks.STACKED_WARPED_STEMS);
                entries.add(StackedBlocks.STACKED_STRIPPED_CRIMSON_STEMS);
                entries.add(StackedBlocks.STACKED_STRIPPED_WARPED_STEMS);

                // Wood Planks
                entries.add(StackedBlocks.STACKED_OAK_PLANKS);
                entries.add(StackedBlocks.STACKED_SPRUCE_PLANKS);
                entries.add(StackedBlocks.STACKED_BIRCH_PLANKS);
                entries.add(StackedBlocks.STACKED_JUNGLE_PLANKS);
                entries.add(StackedBlocks.STACKED_ACACIA_PLANKS);
                entries.add(StackedBlocks.STACKED_DARK_OAK_PLANKS);
                entries.add(StackedBlocks.STACKED_MANGROVE_PLANKS);
                entries.add(StackedBlocks.STACKED_CHERRY_PLANKS);
                entries.add(StackedBlocks.STACKED_BAMBOO_PLANKS);
                entries.add(StackedBlocks.STACKED_CRIMSON_PLANKS);
                entries.add(StackedBlocks.STACKED_WARPED_PLANKS);

                // Mineral Blocks
                entries.add(StackedBlocks.STACKED_LAPIS_BLOCKS);
                entries.add(StackedBlocks.STACKED_REDSTONE_BLOCKS);
                entries.add(StackedBlocks.STACKED_COAL_BLOCKS);
                entries.add(StackedBlocks.STACKED_IRON_BLOCKS);
                entries.add(StackedBlocks.STACKED_GOLD_BLOCKS);
                entries.add(StackedBlocks.STACKED_EMERALD_BLOCKS);
                entries.add(StackedBlocks.STACKED_DIAMOND_BLOCKS);
                entries.add(StackedBlocks.STACKED_NETHERITE_BLOCKS);

                // Raw Ore Blocks
                entries.add(StackedBlocks.STACKED_RAW_IRON_BLOCKS);
                entries.add(StackedBlocks.STACKED_RAW_GOLD_BLOCKS);
                entries.add(StackedBlocks.STACKED_RAW_COPPER_BLOCKS);
            })
            .build()
    );

    /**
     * Register all creative tabs for the Stacked Blocks module.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[StackedBlocks] Registering creative tabs...");
        // Tab is registered during static initialization
        CharmNCraftsMod.LOGGER.info("[StackedBlocks] Creative tabs registered!");
    }
}
