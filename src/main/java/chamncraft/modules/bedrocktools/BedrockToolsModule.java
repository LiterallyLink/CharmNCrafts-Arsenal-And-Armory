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

        // Register creative tabs first
        BedrockToolsCreativeTabs.register();

        // Register all items
        BedrockToolsItems.register();

        CharmNCraftsMod.LOGGER.info("[BedrockTools] Bedrock Tools module initialized!");
    }

    @Override
    public int getPriority() {
        return 10; // Load early (tools are fundamental)
    }
}
