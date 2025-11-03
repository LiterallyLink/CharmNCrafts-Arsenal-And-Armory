package chamncraft.modules.justhammers.items;

import chamncraft.core.CharmNCraftsMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * JustHammersSmithingTemplates - Manages all smithing template items for hammer upgrades.
 */
public class JustHammersSmithingTemplates {

    // Smithing templates for hammer upgrades
    public static final Item BLANK_SMITHING_TEMPLATE = new Item(new Item.Settings());
    public static final Item BLANK_NETHERITE_SMITHING_TEMPLATE = new Item(new Item.Settings());
    public static final Item IRON_SMITHING_TEMPLATE = new Item(new Item.Settings());
    public static final Item GOLD_SMITHING_TEMPLATE = new Item(new Item.Settings());
    public static final Item NETHERITE_SMITHING_TEMPLATE = new Item(new Item.Settings());

    /**
     * Register all smithing template items.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[JustHammers] Registering smithing templates...");

        registerItem("blank_smithing_template", BLANK_SMITHING_TEMPLATE);
        registerItem("blank_netherite_smithing_template", BLANK_NETHERITE_SMITHING_TEMPLATE);
        registerItem("iron_smithing_template", IRON_SMITHING_TEMPLATE);
        registerItem("gold_smithing_template", GOLD_SMITHING_TEMPLATE);
        registerItem("netherite_smithing_template", NETHERITE_SMITHING_TEMPLATE);

        CharmNCraftsMod.LOGGER.info("[JustHammers] Smithing templates registered!");
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM,
            new Identifier(CharmNCraftsMod.MOD_ID, name), item);
    }
}
