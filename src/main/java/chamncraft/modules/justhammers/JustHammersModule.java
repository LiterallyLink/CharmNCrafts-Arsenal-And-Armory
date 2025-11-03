package chamncraft.modules.justhammers;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.core.IModule;
import chamncraft.modules.justhammers.items.JustHammersItems;
import chamncraft.modules.justhammers.items.JustHammersSmithingTemplates;

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

        // Register all items FIRST (items must be registered before adding to creative tabs)
        JustHammersSmithingTemplates.register();
        JustHammersItems.register();

        // Register creative tabs second (after items are registered)
        JustHammersCreativeTabs.register();

        CharmNCraftsMod.LOGGER.info("[JustHammers] Just Hammers module initialized!");
    }

    @Override
    public int getPriority() {
        return 15; // Load after Arsenal but relatively early
    }
}
