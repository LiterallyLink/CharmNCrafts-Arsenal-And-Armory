package chamncraft.modules.smithingtemplates;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.smithingtemplates.items.SmithingTemplateItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * SmithingTemplateCreativeTabs - Manages creative tabs for the Smithing Template Expansion module.
 */
public class SmithingTemplateCreativeTabs {

    /**
     * Smithing Template Expansion creative tab containing all smithing templates.
     */
    public static final ItemGroup SMITHINGTEMPLATES_TAB = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(CharmNCraftsMod.MOD_ID, "smithingtemplates"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.charmncrafts.smithingtemplates"))
            .icon(() -> new ItemStack(SmithingTemplateItems.BLANK_SMITHING_TEMPLATE))
            .entries((displayContext, entries) -> {
                // Add all smithing templates
                entries.add(SmithingTemplateItems.BLANK_SMITHING_TEMPLATE);
                entries.add(SmithingTemplateItems.IRON_SMITHING_TEMPLATE);
                entries.add(SmithingTemplateItems.GOLD_SMITHING_TEMPLATE);
                entries.add(SmithingTemplateItems.BLANK_NETHERITE_SMITHING_TEMPLATE);
                entries.add(SmithingTemplateItems.NETHERITE_SMITHING_TEMPLATE);
            })
            .build()
    );

    /**
     * Register all creative tabs for the Smithing Template Expansion module.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[SmithingTemplates] Registering creative tabs...");
        // Tab is registered during static initialization
        CharmNCraftsMod.LOGGER.info("[SmithingTemplates] Creative tabs registered!");
    }
}
