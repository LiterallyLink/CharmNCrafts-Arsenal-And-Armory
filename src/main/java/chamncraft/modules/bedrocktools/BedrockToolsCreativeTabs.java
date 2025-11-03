package chamncraft.modules.bedrocktools;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.bedrocktools.items.BedrockToolsItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * BedrockToolsCreativeTabs - Manages creative tabs for the Bedrock Tools module.
 */
public class BedrockToolsCreativeTabs {

    /**
     * Bedrock Tools creative tab containing all bedrock-tier tools and weapons.
     */
    public static final ItemGroup BEDROCK_TOOLS_TAB = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(CharmNCraftsMod.MOD_ID, "bedrocktools"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.charmncrafts.bedrocktools"))
            .icon(() -> new ItemStack(BedrockToolsItems.BEDROCK_PICKAXE))
            .entries((displayContext, entries) -> {
                // Add all Bedrock Tools items to the tab
                entries.add(BedrockToolsItems.BEDROCK_SWORD);
                entries.add(BedrockToolsItems.BEDROCK_PICKAXE);
                entries.add(BedrockToolsItems.BEDROCK_AXE);
                entries.add(BedrockToolsItems.BEDROCK_SHOVEL);
                entries.add(BedrockToolsItems.BEDROCK_HOE);
            })
            .build()
    );

    /**
     * Register all creative tabs for the Bedrock Tools module.
     */
    public static void register() {
        CharmNCraftsMod.LOGGER.info("[BedrockTools] Registering creative tabs...");
        // Tab is registered during static initialization
        CharmNCraftsMod.LOGGER.info("[BedrockTools] Creative tabs registered!");
    }
}
