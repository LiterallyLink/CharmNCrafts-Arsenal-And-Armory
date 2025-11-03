package chamncraft.modules.stackedblocks.blocks;

import chamncraft.core.CharmNCraftsMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

/**
 * StackedBlocks - Manages all stacked block registrations.
 * Stacked blocks are space-saving decorative variants that compress 8 blocks into 1.
 */
public class StackedBlocks {

    // Building Blocks
    public static final Block STACKED_STONE_BLOCKS = createStoneBlock();
    public static final Block STACKED_COBBLESTONE_BLOCKS = createStoneBlock();
    public static final Block STACKED_NETHERRACK_BLOCKS = createNetherBlock();
    public static final Block STACKED_BRICKS = createStoneBlock();
    public static final Block STACKED_QUARTZ_BLOCKS = createStoneBlock();

    // Natural Blocks
    public static final Block STACKED_MELONS = createPlantBlock();
    public static final Block STACKED_PUMPKINS = createPlantBlock();

    // Overworld Wood Logs
    public static final Block STACKED_OAK_LOGS = createWoodBlock();
    public static final Block STACKED_SPRUCE_LOGS = createWoodBlock();
    public static final Block STACKED_BIRCH_LOGS = createWoodBlock();
    public static final Block STACKED_JUNGLE_LOGS = createWoodBlock();
    public static final Block STACKED_ACACIA_LOGS = createWoodBlock();
    public static final Block STACKED_DARK_OAK_LOGS = createWoodBlock();
    public static final Block STACKED_MANGROVE_LOGS = createWoodBlock();
    public static final Block STACKED_CHERRY_LOGS = createWoodBlock();
    public static final Block STACKED_BAMBOO_BLOCKS = createWoodBlock();

    // Stripped Wood Logs
    public static final Block STACKED_STRIPPED_OAK_LOGS = createWoodBlock();
    public static final Block STACKED_STRIPPED_SPRUCE_LOGS = createWoodBlock();
    public static final Block STACKED_STRIPPED_BIRCH_LOGS = createWoodBlock();
    public static final Block STACKED_STRIPPED_JUNGLE_LOGS = createWoodBlock();
    public static final Block STACKED_STRIPPED_ACACIA_LOGS = createWoodBlock();
    public static final Block STACKED_STRIPPED_DARK_OAK_LOGS = createWoodBlock();
    public static final Block STACKED_STRIPPED_MANGROVE_LOGS = createWoodBlock();
    public static final Block STACKED_STRIPPED_CHERRY_LOGS = createWoodBlock();
    public static final Block STACKED_STRIPPED_BAMBOO_BLOCKS = createWoodBlock();

    // Nether Stems
    public static final Block STACKED_CRIMSON_STEMS = createNetherWoodBlock();
    public static final Block STACKED_WARPED_STEMS = createNetherWoodBlock();
    public static final Block STACKED_STRIPPED_CRIMSON_STEMS = createNetherWoodBlock();
    public static final Block STACKED_STRIPPED_WARPED_STEMS = createNetherWoodBlock();

    // Wood Planks
    public static final Block STACKED_OAK_PLANKS = createWoodBlock();
    public static final Block STACKED_SPRUCE_PLANKS = createWoodBlock();
    public static final Block STACKED_BIRCH_PLANKS = createWoodBlock();
    public static final Block STACKED_JUNGLE_PLANKS = createWoodBlock();
    public static final Block STACKED_ACACIA_PLANKS = createWoodBlock();
    public static final Block STACKED_DARK_OAK_PLANKS = createWoodBlock();
    public static final Block STACKED_MANGROVE_PLANKS = createWoodBlock();
    public static final Block STACKED_CHERRY_PLANKS = createWoodBlock();
    public static final Block STACKED_BAMBOO_PLANKS = createWoodBlock();
    public static final Block STACKED_CRIMSON_PLANKS = createNetherWoodBlock();
    public static final Block STACKED_WARPED_PLANKS = createNetherWoodBlock();

    // Mineral Blocks
    public static final Block STACKED_LAPIS_BLOCKS = createMetalBlock();
    public static final Block STACKED_REDSTONE_BLOCKS = createMetalBlock();
    public static final Block STACKED_COAL_BLOCKS = createStoneBlock();
    public static final Block STACKED_IRON_BLOCKS = createMetalBlock();
    public static final Block STACKED_GOLD_BLOCKS = createMetalBlock();
    public static final Block STACKED_EMERALD_BLOCKS = createMetalBlock();
    public static final Block STACKED_DIAMOND_BLOCKS = createMetalBlock();
    public static final Block STACKED_NETHERITE_BLOCKS = createNetheriteBlock();

    // Raw Ore Blocks
    public static final Block STACKED_RAW_IRON_BLOCKS = createRawOreBlock();
    public static final Block STACKED_RAW_GOLD_BLOCKS = createRawOreBlock();
    public static final Block STACKED_RAW_COPPER_BLOCKS = createRawOreBlock();

    /**
     * Creates a stone-type stacked block
     */
    private static Block createStoneBlock() {
        return new Block(AbstractBlock.Settings.create()
            .strength(2.0F, 6.0F)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE));
    }

    /**
     * Creates a nether stone-type stacked block
     */
    private static Block createNetherBlock() {
        return new Block(AbstractBlock.Settings.create()
            .strength(0.4F)
            .sounds(BlockSoundGroup.NETHERRACK));
    }

    /**
     * Creates a wood-type stacked block
     */
    private static Block createWoodBlock() {
        return new Block(AbstractBlock.Settings.create()
            .strength(2.0F)
            .sounds(BlockSoundGroup.WOOD));
    }

    /**
     * Creates a nether wood-type stacked block
     */
    private static Block createNetherWoodBlock() {
        return new Block(AbstractBlock.Settings.create()
            .strength(2.0F)
            .sounds(BlockSoundGroup.NETHER_WOOD));
    }

    /**
     * Creates a plant-type stacked block (melons, pumpkins)
     */
    private static Block createPlantBlock() {
        return new Block(AbstractBlock.Settings.create()
            .strength(1.0F)
            .sounds(BlockSoundGroup.WOOD));
    }

    /**
     * Creates a metal-type stacked block
     */
    private static Block createMetalBlock() {
        return new Block(AbstractBlock.Settings.create()
            .strength(5.0F, 6.0F)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL));
    }

    /**
     * Creates a netherite-type stacked block
     */
    private static Block createNetheriteBlock() {
        return new Block(AbstractBlock.Settings.create()
            .strength(50.0F, 1200.0F)
            .requiresTool()
            .sounds(BlockSoundGroup.NETHERITE));
    }

    /**
     * Creates a raw ore-type stacked block
     */
    private static Block createRawOreBlock() {
        return new Block(AbstractBlock.Settings.create()
            .strength(5.0F, 6.0F)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE));
    }

    /**
     * Register all stacked blocks.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[StackedBlocks] Registering stacked blocks...");

        // Building Blocks
        registerBlock("stacked_stone_blocks", STACKED_STONE_BLOCKS);
        registerBlock("stacked_cobblestone_blocks", STACKED_COBBLESTONE_BLOCKS);
        registerBlock("stacked_netherrack_blocks", STACKED_NETHERRACK_BLOCKS);
        registerBlock("stacked_bricks", STACKED_BRICKS);
        registerBlock("stacked_quartz_blocks", STACKED_QUARTZ_BLOCKS);

        // Natural Blocks
        registerBlock("stacked_melons", STACKED_MELONS);
        registerBlock("stacked_pumpkins", STACKED_PUMPKINS);

        // Overworld Wood Logs
        registerBlock("stacked_oak_logs", STACKED_OAK_LOGS);
        registerBlock("stacked_spruce_logs", STACKED_SPRUCE_LOGS);
        registerBlock("stacked_birch_logs", STACKED_BIRCH_LOGS);
        registerBlock("stacked_jungle_logs", STACKED_JUNGLE_LOGS);
        registerBlock("stacked_acacia_logs", STACKED_ACACIA_LOGS);
        registerBlock("stacked_dark_oak_logs", STACKED_DARK_OAK_LOGS);
        registerBlock("stacked_mangrove_logs", STACKED_MANGROVE_LOGS);
        registerBlock("stacked_cherry_logs", STACKED_CHERRY_LOGS);
        registerBlock("stacked_bamboo_blocks", STACKED_BAMBOO_BLOCKS);

        // Stripped Wood Logs
        registerBlock("stacked_stripped_oak_logs", STACKED_STRIPPED_OAK_LOGS);
        registerBlock("stacked_stripped_spruce_logs", STACKED_STRIPPED_SPRUCE_LOGS);
        registerBlock("stacked_stripped_birch_logs", STACKED_STRIPPED_BIRCH_LOGS);
        registerBlock("stacked_stripped_jungle_logs", STACKED_STRIPPED_JUNGLE_LOGS);
        registerBlock("stacked_stripped_acacia_logs", STACKED_STRIPPED_ACACIA_LOGS);
        registerBlock("stacked_stripped_dark_oak_logs", STACKED_STRIPPED_DARK_OAK_LOGS);
        registerBlock("stacked_stripped_mangrove_logs", STACKED_STRIPPED_MANGROVE_LOGS);
        registerBlock("stacked_stripped_cherry_logs", STACKED_STRIPPED_CHERRY_LOGS);
        registerBlock("stacked_stripped_bamboo_blocks", STACKED_STRIPPED_BAMBOO_BLOCKS);

        // Nether Stems
        registerBlock("stacked_crimson_stems", STACKED_CRIMSON_STEMS);
        registerBlock("stacked_warped_stems", STACKED_WARPED_STEMS);
        registerBlock("stacked_stripped_crimson_stems", STACKED_STRIPPED_CRIMSON_STEMS);
        registerBlock("stacked_stripped_warped_stems", STACKED_STRIPPED_WARPED_STEMS);

        // Wood Planks
        registerBlock("stacked_oak_planks", STACKED_OAK_PLANKS);
        registerBlock("stacked_spruce_planks", STACKED_SPRUCE_PLANKS);
        registerBlock("stacked_birch_planks", STACKED_BIRCH_PLANKS);
        registerBlock("stacked_jungle_planks", STACKED_JUNGLE_PLANKS);
        registerBlock("stacked_acacia_planks", STACKED_ACACIA_PLANKS);
        registerBlock("stacked_dark_oak_planks", STACKED_DARK_OAK_PLANKS);
        registerBlock("stacked_mangrove_planks", STACKED_MANGROVE_PLANKS);
        registerBlock("stacked_cherry_planks", STACKED_CHERRY_PLANKS);
        registerBlock("stacked_bamboo_planks", STACKED_BAMBOO_PLANKS);
        registerBlock("stacked_crimson_planks", STACKED_CRIMSON_PLANKS);
        registerBlock("stacked_warped_planks", STACKED_WARPED_PLANKS);

        // Mineral Blocks
        registerBlock("stacked_lapis_blocks", STACKED_LAPIS_BLOCKS);
        registerBlock("stacked_redstone_blocks", STACKED_REDSTONE_BLOCKS);
        registerBlock("stacked_coal_blocks", STACKED_COAL_BLOCKS);
        registerBlock("stacked_iron_blocks", STACKED_IRON_BLOCKS);
        registerBlock("stacked_gold_blocks", STACKED_GOLD_BLOCKS);
        registerBlock("stacked_emerald_blocks", STACKED_EMERALD_BLOCKS);
        registerBlock("stacked_diamond_blocks", STACKED_DIAMOND_BLOCKS);
        registerBlock("stacked_netherite_blocks", STACKED_NETHERITE_BLOCKS);

        // Raw Ore Blocks
        registerBlock("stacked_raw_iron_blocks", STACKED_RAW_IRON_BLOCKS);
        registerBlock("stacked_raw_gold_blocks", STACKED_RAW_GOLD_BLOCKS);
        registerBlock("stacked_raw_copper_blocks", STACKED_RAW_COPPER_BLOCKS);

        CharmNCraftsMod.LOGGER.info("[StackedBlocks] Stacked blocks registered! Total: 51 blocks");
    }

    /**
     * Helper method to register both a block and its corresponding block item.
     */
    private static void registerBlock(String name, Block block) {
        Identifier id = new Identifier(CharmNCraftsMod.MOD_ID, name);

        // Register the block
        Registry.register(Registries.BLOCK, id, block);

        // Register the block item
        Registry.register(Registries.ITEM, id, new BlockItem(block, new Item.Settings()));
    }
}
