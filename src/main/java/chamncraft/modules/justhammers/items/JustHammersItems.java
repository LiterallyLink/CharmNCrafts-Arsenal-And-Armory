package chamncraft.modules.justhammers.items;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.justhammers.items.custom.HammerItem;
import chamncraft.modules.justhammers.items.materials.HammerMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * JustHammersItems - Manages all items in the Just Hammers module.
 */
public class JustHammersItems {

    // ===== BASIC HAMMERS (3x3 Mining Tools) =====
    public static final Item WOODEN_HAMMER = new HammerItem(
            ToolMaterials.WOOD, 2, -3.0F, new Item.Settings());

    public static final Item STONE_HAMMER = new HammerItem(
            ToolMaterials.STONE, 3, -3.0F, new Item.Settings());

    public static final Item IRON_HAMMER = new HammerItem(
            ToolMaterials.IRON, 4, -3.0F, new Item.Settings());

    public static final Item GOLDEN_HAMMER = new HammerItem(
            ToolMaterials.GOLD, 2, -3.0F, new Item.Settings());

    public static final Item GOLD_HAMMER = new HammerItem(
            ToolMaterials.GOLD, 2, -3.0F, new Item.Settings());

    public static final Item DIAMOND_HAMMER = new HammerItem(
            ToolMaterials.DIAMOND, 5, -3.0F, new Item.Settings());

    public static final Item NETHERITE_HAMMER = new HammerItem(
            ToolMaterials.NETHERITE, 6, -3.0F, new Item.Settings());

    // ===== REFINED HAMMERS =====
    public static final Item REFINED_STONE_HAMMER = new HammerItem(
            HammerMaterials.REFINED_STONE, 4, -3.0F, new Item.Settings());

    public static final Item REFINED_IRON_HAMMER = new HammerItem(
            HammerMaterials.REFINED_IRON, 5, -3.0F, new Item.Settings());

    public static final Item REFINED_GOLD_HAMMER = new HammerItem(
            HammerMaterials.REFINED_GOLD, 3, -3.0F, new Item.Settings());

    public static final Item REFINED_DIAMOND_HAMMER = new HammerItem(
            HammerMaterials.REFINED_DIAMOND, 6, -3.0F, new Item.Settings());

    public static final Item REFINED_NETHERITE_HAMMER = new HammerItem(
            HammerMaterials.REFINED_NETHERITE, 7, -3.0F, new Item.Settings());

    // ===== REINFORCED HAMMERS =====
    public static final Item REINFORCED_STONE_HAMMER = new HammerItem(
            HammerMaterials.REINFORCED_STONE, 5, -3.0F, new Item.Settings());

    public static final Item REINFORCED_IRON_HAMMER = new HammerItem(
            HammerMaterials.REINFORCED_IRON, 6, -3.0F, new Item.Settings());

    public static final Item REINFORCED_GOLD_HAMMER = new HammerItem(
            HammerMaterials.REINFORCED_GOLD, 4, -3.0F, new Item.Settings());

    public static final Item REINFORCED_DIAMOND_HAMMER = new HammerItem(
            HammerMaterials.REINFORCED_DIAMOND, 7, -3.0F, new Item.Settings());

    public static final Item REINFORCED_NETHERITE_HAMMER = new HammerItem(
            HammerMaterials.REINFORCED_NETHERITE, 8, -3.0F, new Item.Settings());

    // ===== FORTIFIED HAMMERS =====
    public static final Item FORTIFIED_STONE_HAMMER = new HammerItem(
            HammerMaterials.FORTIFIED_STONE, 6, -3.0F, new Item.Settings());

    public static final Item FORTIFIED_IRON_HAMMER = new HammerItem(
            HammerMaterials.FORTIFIED_IRON, 7, -3.0F, new Item.Settings());

    public static final Item FORTIFIED_GOLD_HAMMER = new HammerItem(
            HammerMaterials.FORTIFIED_GOLD, 5, -3.0F, new Item.Settings());

    public static final Item FORTIFIED_DIAMOND_HAMMER = new HammerItem(
            HammerMaterials.FORTIFIED_DIAMOND, 8, -3.0F, new Item.Settings());

    public static final Item FORTIFIED_NETHERITE_HAMMER = new HammerItem(
            HammerMaterials.FORTIFIED_NETHERITE, 9, -3.0F, new Item.Settings());

    // ===== FABLED HAMMERS =====
    public static final Item FABLED_STONE_HAMMER = new HammerItem(
            HammerMaterials.FABLED_STONE, 7, -3.0F, new Item.Settings());

    public static final Item FABLED_IRON_HAMMER = new HammerItem(
            HammerMaterials.FABLED_IRON, 8, -3.0F, new Item.Settings());

    public static final Item FABLED_GOLD_HAMMER = new HammerItem(
            HammerMaterials.FABLED_GOLD, 6, -3.0F, new Item.Settings());

    public static final Item FABLED_DIAMOND_HAMMER = new HammerItem(
            HammerMaterials.FABLED_DIAMOND, 9, -3.0F, new Item.Settings());

    public static final Item FABLED_NETHERITE_HAMMER = new HammerItem(
            HammerMaterials.FABLED_NETHERITE, 10, -3.0F, new Item.Settings());

    /**
     * Register all Just Hammers items.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[JustHammers] Registering items...");

        // Register basic hammers
        registerItem("wooden_hammer", WOODEN_HAMMER);
        registerItem("stone_hammer", STONE_HAMMER);
        registerItem("iron_hammer", IRON_HAMMER);
        registerItem("golden_hammer", GOLDEN_HAMMER);
        registerItem("gold_hammer", GOLD_HAMMER);
        registerItem("diamond_hammer", DIAMOND_HAMMER);
        registerItem("netherite_hammer", NETHERITE_HAMMER);

        // Register refined hammers
        registerItem("refined_stone_hammer", REFINED_STONE_HAMMER);
        registerItem("refined_iron_hammer", REFINED_IRON_HAMMER);
        registerItem("refined_gold_hammer", REFINED_GOLD_HAMMER);
        registerItem("refined_diamond_hammer", REFINED_DIAMOND_HAMMER);
        registerItem("refined_netherite_hammer", REFINED_NETHERITE_HAMMER);

        // Register reinforced hammers
        registerItem("reinforced_stone_hammer", REINFORCED_STONE_HAMMER);
        registerItem("reinforced_iron_hammer", REINFORCED_IRON_HAMMER);
        registerItem("reinforced_gold_hammer", REINFORCED_GOLD_HAMMER);
        registerItem("reinforced_diamond_hammer", REINFORCED_DIAMOND_HAMMER);
        registerItem("reinforced_netherite_hammer", REINFORCED_NETHERITE_HAMMER);

        // Register fortified hammers
        registerItem("fortified_stone_hammer", FORTIFIED_STONE_HAMMER);
        registerItem("fortified_iron_hammer", FORTIFIED_IRON_HAMMER);
        registerItem("fortified_gold_hammer", FORTIFIED_GOLD_HAMMER);
        registerItem("fortified_diamond_hammer", FORTIFIED_DIAMOND_HAMMER);
        registerItem("fortified_netherite_hammer", FORTIFIED_NETHERITE_HAMMER);

        // Register fabled hammers
        registerItem("fabled_stone_hammer", FABLED_STONE_HAMMER);
        registerItem("fabled_iron_hammer", FABLED_IRON_HAMMER);
        registerItem("fabled_gold_hammer", FABLED_GOLD_HAMMER);
        registerItem("fabled_diamond_hammer", FABLED_DIAMOND_HAMMER);
        registerItem("fabled_netherite_hammer", FABLED_NETHERITE_HAMMER);

        CharmNCraftsMod.LOGGER.info("[JustHammers] Items registered successfully!");
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM,
            new Identifier(CharmNCraftsMod.MOD_ID, name), item);
    }
}
