package chamncraft.modules.gearsgadgets;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.core.IModule;
import chamncraft.modules.gearsgadgets.items.GearsGadgetsItems;

/**
 * Gears & Gadgets Module - Utility Items and Mechanisms
 * Contains utility items, gadgets, and mechanical devices.
 */
public class GearsGadgetsModule implements IModule {
    public static final String MODULE_ID = "gearsgadgets";

    @Override
    public String getModuleId() {
        return MODULE_ID;
    }

    @Override
    public String getModuleName() {
        return "Gears & Gadgets";
    }

    @Override
    public void initialize() {
        CharmNCraftsMod.LOGGER.info("[GearsGadgets] Initializing Gears & Gadgets module...");

        // Register creative tabs first
        GearsGadgetsCreativeTabs.register();

        // Register all items
        GearsGadgetsItems.register();

        CharmNCraftsMod.LOGGER.info("[GearsGadgets] Gears & Gadgets module initialized!");
    }

    @Override
    public int getPriority() {
        return 20; // Load after Arsenal
    }
}
