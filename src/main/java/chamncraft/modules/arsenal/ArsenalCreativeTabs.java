package chamncraft.modules.arsenal;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.arsenal.items.ArsenalItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * ArsenalCreativeTabs - Manages creative tabs for the Arsenal module.
 */
public class ArsenalCreativeTabs {

    /**
     * Arsenal & Armory creative tab containing all weapons, tools, and combat equipment.
     */
    public static final ItemGroup ARSENAL_TAB = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(CharmNCraftsMod.MOD_ID, "arsenal"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.charmncrafts.arsenal"))
            .icon(() -> new ItemStack(ArsenalItems.BEDROCK_SWORD))
            .entries((displayContext, entries) -> {
                // Add all Arsenal items to the tab
                entries.add(ArsenalItems.BEDROCK_SWORD);
                entries.add(ArsenalItems.BEDROCK_PICKAXE);
                entries.add(ArsenalItems.BEDROCK_AXE);
                entries.add(ArsenalItems.BEDROCK_SHOVEL);
                entries.add(ArsenalItems.BEDROCK_HOE);
            })
            .build()
    );

    /**
     * Register all creative tabs for the Arsenal module.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[Arsenal] Registering creative tabs...");
        // Tab is registered during static initialization
        CharmNCraftsMod.LOGGER.info("[Arsenal] Creative tabs registered!");
    }
}
