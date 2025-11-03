package chamncraft.modules.arsenal.items;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.arsenal.items.custom.*;
import chamncraft.modules.arsenal.items.materials.BedrockToolMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * ArsenalItems - Manages all items in the Arsenal module.
 * This includes weapons, tools, and combat equipment.
 */
public class ArsenalItems {

    // ===== MATERIALS =====
    public static final ToolMaterial BEDROCK_MATERIAL = BedrockToolMaterial.INSTANCE;

    // ===== BEDROCK TOOLS =====
    public static final Item BEDROCK_PICKAXE = new CustomBedrockPickaxeItem(
            BEDROCK_MATERIAL, 1, -2.8F, new Item.Settings());

    public static final Item BEDROCK_AXE = new CustomBedrockAxeItem(
            BEDROCK_MATERIAL, 7.0F, -3.2F, new Item.Settings());

    public static final Item BEDROCK_SHOVEL = new ShovelItem(
            BEDROCK_MATERIAL, 1.5F, -3.0F, new Item.Settings());

    public static final Item BEDROCK_SWORD = new SwordItem(
            BEDROCK_MATERIAL, 3, -2.4F, new Item.Settings());

    public static final Item BEDROCK_HOE = new CustomBedrockHoeItem(
            BEDROCK_MATERIAL, -2, -1.0F, new Item.Settings());

    /**
     * Register all Arsenal items.
     * Called during module initialization.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[Arsenal] Registering items...");

        // Register items
        registerItem("bedrock_pickaxe", BEDROCK_PICKAXE);
        registerItem("bedrock_axe", BEDROCK_AXE);
        registerItem("bedrock_shovel", BEDROCK_SHOVEL);
        registerItem("bedrock_sword", BEDROCK_SWORD);
        registerItem("bedrock_hoe", BEDROCK_HOE);

        // Add to creative tabs
        addToCreativeTabs();

        CharmNCraftsMod.LOGGER.info("[Arsenal] Items registered successfully!");
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
     * Items are automatically added to the Arsenal creative tab via ArsenalCreativeTabs.
     * This method can be used to add items to vanilla tabs if desired.
     */
    private static void addToCreativeTabs() {
        // Items are automatically added to the Arsenal creative tab
        // You can optionally add items to vanilla tabs here
        // Example:
        // ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
        //     entries.add(BEDROCK_PICKAXE);
        // });
    }
}
