package chamncraft.modules.gearsgadgets;

import chamncraft.core.CharmNCraftsMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * GearsGadgetsCreativeTabs - Manages creative tabs for the Gears & Gadgets module.
 */
public class GearsGadgetsCreativeTabs {

    /**
     * Gears & Gadgets creative tab containing all utility items and mechanical devices.
     */
    public static final ItemGroup GEARSGADGETS_TAB = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(CharmNCraftsMod.MOD_ID, "gearsgadgets"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.charmncrafts.gearsgadgets"))
            .icon(() -> new ItemStack(Items.REDSTONE)) // Temporary icon - replace when items are added
            .entries((displayContext, entries) -> {
                // Add all Gears & Gadgets items to the tab
                // Example:
                // entries.add(GearsGadgetsItems.GRAPPLING_HOOK);
                // entries.add(GearsGadgetsItems.JETPACK);
            })
            .build()
    );

    /**
     * Register all creative tabs for the Gears & Gadgets module.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[GearsGadgets] Registering creative tabs...");
        // Tab is registered during static initialization
        CharmNCraftsMod.LOGGER.info("[GearsGadgets] Creative tabs registered!");
    }
}
