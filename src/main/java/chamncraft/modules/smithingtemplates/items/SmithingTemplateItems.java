package chamncraft.modules.smithingtemplates.items;

import chamncraft.core.CharmNCraftsMod;
import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

/**
 * SmithingTemplateItems - Manages all smithing template items.
 */
public class SmithingTemplateItems {

    // Text formatting styles for smithing templates
    private static final Style TITLE_FORMATTING = Style.EMPTY.withColor(Formatting.GRAY).withItalic(false);
    private static final Style DESCRIPTION_FORMATTING = Style.EMPTY.withColor(Formatting.BLUE).withItalic(false);

    // Smithing templates for various upgrades
    public static final Item BLANK_SMITHING_TEMPLATE = new Item(new Item.Settings());
    public static final Item BLANK_NETHERITE_SMITHING_TEMPLATE = new Item(new Item.Settings());
    public static final Item IRON_SMITHING_TEMPLATE = createUpgradeTemplate();
    public static final Item GOLD_SMITHING_TEMPLATE = createUpgradeTemplate();
    public static final Item NETHERITE_SMITHING_TEMPLATE = createUpgradeTemplate();

    /**
     * Creates a smithing template item for upgrading equipment.
     * Similar to the netherite upgrade template.
     */
    private static SmithingTemplateItem createUpgradeTemplate() {
        return new SmithingTemplateItem(
            Text.translatable(Util.createTranslationKey("item", new Identifier("minecraft", "smithing_template.netherite_upgrade.applies_to"))).fillStyle(DESCRIPTION_FORMATTING),
            Text.translatable(Util.createTranslationKey("item", new Identifier("minecraft", "smithing_template.netherite_upgrade.ingredients"))).fillStyle(DESCRIPTION_FORMATTING),
            Text.translatable(Util.createTranslationKey("upgrade", new Identifier("minecraft", "netherite_upgrade"))).fillStyle(TITLE_FORMATTING),
            Text.translatable(Util.createTranslationKey("item", new Identifier("minecraft", "smithing_template.netherite_upgrade.base_slot_description"))),
            Text.translatable(Util.createTranslationKey("item", new Identifier("minecraft", "smithing_template.netherite_upgrade.additions_slot_description"))),
            createNetheriteUpgradeIconList(),
            createNetheriteUpgradeMaterialList(),
            new Item.Settings()
        );
    }

    /**
     * Creates the list of empty slot icons for the base slot.
     */
    private static List<Identifier> createNetheriteUpgradeIconList() {
        return List.of(
            new Identifier("item/empty_armor_slot_helmet"),
            new Identifier("item/empty_slot_sword"),
            new Identifier("item/empty_armor_slot_chestplate"),
            new Identifier("item/empty_slot_pickaxe"),
            new Identifier("item/empty_armor_slot_leggings"),
            new Identifier("item/empty_slot_axe"),
            new Identifier("item/empty_armor_slot_boots"),
            new Identifier("item/empty_slot_hoe"),
            new Identifier("item/empty_slot_shovel")
        );
    }

    /**
     * Creates the list of empty slot icons for the additions slot.
     */
    private static List<Identifier> createNetheriteUpgradeMaterialList() {
        return List.of(
            new Identifier("item/empty_slot_ingot")
        );
    }

    /**
     * Register all smithing template items.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[SmithingTemplates] Registering smithing templates...");

        registerItem("blank_smithing_template", BLANK_SMITHING_TEMPLATE);
        registerItem("blank_netherite_smithing_template", BLANK_NETHERITE_SMITHING_TEMPLATE);
        registerItem("iron_smithing_template", IRON_SMITHING_TEMPLATE);
        registerItem("gold_smithing_template", GOLD_SMITHING_TEMPLATE);
        registerItem("netherite_smithing_template", NETHERITE_SMITHING_TEMPLATE);

        CharmNCraftsMod.LOGGER.info("[SmithingTemplates] Smithing templates registered!");
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM,
            new Identifier(CharmNCraftsMod.MOD_ID, name), item);
    }
}
