package chamncraft.modules.stackedblocks;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.core.IModule;
import chamncraft.modules.stackedblocks.blocks.StackedBlocks;

/**
 * Stacked Blocks Module - Space-saving decorative blocks
 * Compress 8 blocks into 1 stacked block for efficient storage.
 */
public class StackedBlocksModule implements IModule {
    public static final String MODULE_ID = "stackedblocks";

    @Override
    public String getModuleId() {
        return MODULE_ID;
    }

    @Override
    public String getModuleName() {
        return "Stacked Blocks";
    }

    @Override
    public void initialize() {
        CharmNCraftsMod.LOGGER.info("[StackedBlocks] Initializing Stacked Blocks module...");

        // Register all blocks FIRST (blocks must be registered before adding to creative tabs)
        StackedBlocks.register();

        // Register creative tabs second (after blocks are registered)
        StackedBlocksCreativeTabs.register();

        CharmNCraftsMod.LOGGER.info("[StackedBlocks] Stacked Blocks module initialized!");
    }

    @Override
    public int getPriority() {
        return 30; // Load after other modules
    }
}
