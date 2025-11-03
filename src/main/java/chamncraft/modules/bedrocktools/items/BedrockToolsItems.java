package chamncraft.modules.bedrocktools.items;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.bedrocktools.items.custom.*;
import chamncraft.modules.bedrocktools.items.materials.BedrockToolMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * BedrockToolsItems - Manages all items in the Bedrock Tools module.
 * This includes all bedrock-tier tools and weapons.
 */
public class BedrockToolsItems {

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
     * Register all Bedrock Tools items.
     * Called during module initialization.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[BedrockTools] Registering items...");

        // Register items
        registerItem("bedrock_pickaxe", BEDROCK_PICKAXE);
        registerItem("bedrock_axe", BEDROCK_AXE);
        registerItem("bedrock_shovel", BEDROCK_SHOVEL);
        registerItem("bedrock_sword", BEDROCK_SWORD);
        registerItem("bedrock_hoe", BEDROCK_HOE);

        CharmNCraftsMod.LOGGER.info("[BedrockTools] Items registered successfully!");
    }

    /**
     * Helper method to register an item.
     */
    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM,
            new Identifier(CharmNCraftsMod.MOD_ID, name), item);
    }
}
