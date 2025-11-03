package chamncraft.modules.arsenal;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.core.IModule;
import chamncraft.modules.arsenal.items.ArsenalItems;

/**
 * Arsenal Module - Weapons, Tools, and Combat Equipment
 * Contains all combat-related items including tools, weapons, and projectiles.
 */
public class ArsenalModule implements IModule {
    public static final String MODULE_ID = "arsenal";

    @Override
    public String getModuleId() {
        return MODULE_ID;
    }

    @Override
    public String getModuleName() {
        return "Arsenal & Armory";
    }

    @Override
    public void initialize() {
        CharmNCraftsMod.LOGGER.info("[Arsenal] Initializing Arsenal & Armory module...");

        // Register creative tabs first
        ArsenalCreativeTabs.register();

        // Register all items
        ArsenalItems.register();

        CharmNCraftsMod.LOGGER.info("[Arsenal] Arsenal & Armory module initialized!");
    }

    @Override
    public int getPriority() {
        return 10; // Load early (weapons and tools are fundamental)
    }
}
