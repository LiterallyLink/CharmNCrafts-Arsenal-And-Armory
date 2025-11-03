package chamncraft.modules.justhammers;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.justhammers.items.JustHammersItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * JustHammersCreativeTabs - Manages creative tabs for the Just Hammers module.
 */
public class JustHammersCreativeTabs {

    /**
     * Just Hammers creative tab containing all hammer tools.
     */
    public static final ItemGroup JUSTHAMMERS_TAB = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(CharmNCraftsMod.MOD_ID, "justhammers"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.charmncrafts.justhammers"))
            .icon(() -> new ItemStack(JustHammersItems.DIAMOND_HAMMER))
            .entries((displayContext, entries) -> {
                // Basic hammers
                entries.add(JustHammersItems.STONE_HAMMER);
                entries.add(JustHammersItems.IRON_HAMMER);
                entries.add(JustHammersItems.GOLDEN_HAMMER);
                entries.add(JustHammersItems.DIAMOND_HAMMER);
                entries.add(JustHammersItems.NETHERITE_HAMMER);

                // Refined hammers
                entries.add(JustHammersItems.REFINED_STONE_HAMMER);
                entries.add(JustHammersItems.REFINED_IRON_HAMMER);
                entries.add(JustHammersItems.REFINED_GOLD_HAMMER);
                entries.add(JustHammersItems.REFINED_DIAMOND_HAMMER);
                entries.add(JustHammersItems.REFINED_NETHERITE_HAMMER);

                // Reinforced hammers
                entries.add(JustHammersItems.REINFORCED_STONE_HAMMER);
                entries.add(JustHammersItems.REINFORCED_IRON_HAMMER);
                entries.add(JustHammersItems.REINFORCED_GOLD_HAMMER);
                entries.add(JustHammersItems.REINFORCED_DIAMOND_HAMMER);
                entries.add(JustHammersItems.REINFORCED_NETHERITE_HAMMER);

                // Fortified hammers
                entries.add(JustHammersItems.FORTIFIED_STONE_HAMMER);
                entries.add(JustHammersItems.FORTIFIED_IRON_HAMMER);
                entries.add(JustHammersItems.FORTIFIED_GOLD_HAMMER);
                entries.add(JustHammersItems.FORTIFIED_DIAMOND_HAMMER);
                entries.add(JustHammersItems.FORTIFIED_NETHERITE_HAMMER);

                // Fabled hammers
                entries.add(JustHammersItems.FABLED_STONE_HAMMER);
                entries.add(JustHammersItems.FABLED_IRON_HAMMER);
                entries.add(JustHammersItems.FABLED_GOLD_HAMMER);
                entries.add(JustHammersItems.FABLED_DIAMOND_HAMMER);
                entries.add(JustHammersItems.FABLED_NETHERITE_HAMMER);
            })
            .build()
    );

    /**
     * Register all creative tabs for the Just Hammers module.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[JustHammers] Registering creative tabs...");
        // Tab is registered during static initialization
        CharmNCraftsMod.LOGGER.info("[JustHammers] Creative tabs registered!");
    }
}
