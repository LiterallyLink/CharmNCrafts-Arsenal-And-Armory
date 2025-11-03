package chamncraft.modules.bedrocktools;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.core.IModule;
import chamncraft.modules.bedrocktools.items.BedrockToolsItems;

/**
 * Bedrock Tools Module - Unbreakable Bedrock-tier Tools
 * Contains all bedrock-tier tools and weapons.
 */
public class BedrockToolsModule implements IModule {
    public static final String MODULE_ID = "bedrocktools";

    @Override
    public String getModuleId() {
        return MODULE_ID;
    }

    @Override
    public String getModuleName() {
        return "Bedrock Tools";
    }

    @Override
    public void initialize() {
        CharmNCraftsMod.LOGGER.info("[BedrockTools] Initializing Bedrock Tools module...");

        // Register all items first (items must be registered before adding to creative tabs)
        BedrockToolsItems.register();

        // Register creative tabs
        BedrockToolsCreativeTabs.register();

        CharmNCraftsMod.LOGGER.info("[BedrockTools] Bedrock Tools module initialized!");
    }

    @Override
    public int getPriority() {
        return 10; // Load early (tools are fundamental)
    }
}
