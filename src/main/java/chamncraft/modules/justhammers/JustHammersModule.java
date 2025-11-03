package chamncraft.modules.justhammers;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.core.IModule;
import chamncraft.modules.justhammers.items.JustHammersItems;

/**
 * Just Hammers Module - Powerful mining hammers
 * Contains various tier hammers for efficient mining.
 */
public class JustHammersModule implements IModule {
    public static final String MODULE_ID = "justhammers";

    @Override
    public String getModuleId() {
        return MODULE_ID;
    }

    @Override
    public String getModuleName() {
        return "Just Hammers";
    }

    @Override
    public void initialize() {
        CharmNCraftsMod.LOGGER.info("[JustHammers] Initializing Just Hammers module...");

        // Register creative tabs first
        JustHammersCreativeTabs.register();

        // Register all items
        JustHammersItems.register();

        CharmNCraftsMod.LOGGER.info("[JustHammers] Just Hammers module initialized!");
    }

    @Override
    public int getPriority() {
        return 15; // Load after Arsenal but relatively early
    }
}
