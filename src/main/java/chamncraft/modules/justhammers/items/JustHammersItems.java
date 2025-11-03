package chamncraft.modules.justhammers.items;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.justhammers.items.custom.HammerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * JustHammersItems - Manages all items in the Just Hammers module.
 */
public class JustHammersItems {

    // ===== HAMMERS (3x3 Mining Tools) =====
    public static final Item WOODEN_HAMMER = new HammerItem(
            ToolMaterials.WOOD, 2, -3.0F, new Item.Settings());

    public static final Item STONE_HAMMER = new HammerItem(
            ToolMaterials.STONE, 3, -3.0F, new Item.Settings());

    public static final Item IRON_HAMMER = new HammerItem(
            ToolMaterials.IRON, 4, -3.0F, new Item.Settings());

    public static final Item GOLDEN_HAMMER = new HammerItem(
            ToolMaterials.GOLD, 2, -3.0F, new Item.Settings());

    public static final Item DIAMOND_HAMMER = new HammerItem(
            ToolMaterials.DIAMOND, 5, -3.0F, new Item.Settings());

    public static final Item NETHERITE_HAMMER = new HammerItem(
            ToolMaterials.NETHERITE, 6, -3.0F, new Item.Settings());

    /**
     * Register all Just Hammers items.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[JustHammers] Registering items...");

        // Register hammers
        registerItem("wooden_hammer", WOODEN_HAMMER);
        registerItem("stone_hammer", STONE_HAMMER);
        registerItem("iron_hammer", IRON_HAMMER);
        registerItem("golden_hammer", GOLDEN_HAMMER);
        registerItem("diamond_hammer", DIAMOND_HAMMER);
        registerItem("netherite_hammer", NETHERITE_HAMMER);

        CharmNCraftsMod.LOGGER.info("[JustHammers] Items registered successfully!");
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM,
            new Identifier(CharmNCraftsMod.MOD_ID, name), item);
    }
}
