package chamncraft.modules.gearsgadgets.items;

import chamncraft.core.CharmNCraftsMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * GearsGadgetsItems - Manages all items in the Gears & Gadgets module.
 * This includes utility items, gadgets, and mechanical devices.
 */
public class GearsGadgetsItems {

    // ===== ITEMS =====
    // Add your gears and gadgets items here
    // Example:
    // public static final Item GRAPPLING_HOOK = new GrapplingHookItem(new Item.Settings());
    // public static final Item JETPACK = new JetpackItem(new Item.Settings());

    /**
     * Register all Gears & Gadgets items.
     * Called during module initialization.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[GearsGadgets] Registering items...");

        // Register items here
        // Example:
        // registerItem("grappling_hook", GRAPPLING_HOOK);

        // Add to creative tabs
        addToCreativeTabs();

        CharmNCraftsMod.LOGGER.info("[GearsGadgets] Items registered successfully!");
    }

    /**
     * Helper method to register an item.
     */
    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM,
            new Identifier(CharmNCraftsMod.MOD_ID, name), item);
    }

    /**
     * Add items to creative mode tabs.
     */
    private static void addToCreativeTabs() {
        // Add items to creative tabs here
        // Example:
        // ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
        //     entries.add(GRAPPLING_HOOK);
        // });
    }
}
