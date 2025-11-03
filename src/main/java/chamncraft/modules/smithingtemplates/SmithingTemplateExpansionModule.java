package chamncraft.modules.smithingtemplates;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.core.IModule;
import chamncraft.modules.smithingtemplates.items.SmithingTemplateItems;

/**
 * Smithing Template Expansion Module - Additional smithing templates for upgrades
 */
public class SmithingTemplateExpansionModule implements IModule {
    public static final String MODULE_ID = "smithingtemplates";

    @Override
    public String getModuleId() {
        return MODULE_ID;
    }

    @Override
    public String getModuleName() {
        return "Smithing Template Expansion";
    }

    @Override
    public void initialize() {
        CharmNCraftsMod.LOGGER.info("[SmithingTemplates] Initializing Smithing Template Expansion module...");

        // Register all items FIRST (items must be registered before adding to creative tabs)
        SmithingTemplateItems.register();

        // Register creative tabs second (after items are registered)
        SmithingTemplateCreativeTabs.register();

        CharmNCraftsMod.LOGGER.info("[SmithingTemplates] Smithing Template Expansion module initialized!");
    }

    @Override
    public int getPriority() {
        return 20; // Load after Arsenal and Just Hammers
    }
}
