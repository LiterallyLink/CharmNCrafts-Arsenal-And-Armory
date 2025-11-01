package chamncraft.arsenal.item;

import chamncraft.arsenal.CharmncraftsarsenalAndArmory;
import chamncraft.arsenal.item.custom.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    
    // Material instance
    public static final ToolMaterial BEDROCK_MATERIAL = BedrockToolMaterial.INSTANCE;
    
    // ===== BEDROCK TOOLS =====
    public static final Item BEDROCK_PICKAXE = registerItem("bedrock_pickaxe",
            new CustomBedrockPickaxeItem(BEDROCK_MATERIAL, 1, -2.8F, 
                    new Item.Settings()));
    
    public static final Item BEDROCK_AXE = registerItem("bedrock_axe",
            new CustomBedrockAxeItem(BEDROCK_MATERIAL, 7.0F, -3.2F, 
                    new Item.Settings()));
    
    public static final Item BEDROCK_SHOVEL = registerItem("bedrock_shovel",
            new ShovelItem(BEDROCK_MATERIAL, 1.5F, -3.0F, 
                    new Item.Settings()));
    
    public static final Item BEDROCK_SWORD = registerItem("bedrock_sword",
            new SwordItem(BEDROCK_MATERIAL, 3, -2.4F, 
                    new Item.Settings()));
    
    public static final Item BEDROCK_HOE = registerItem("bedrock_hoe",
            new CustomBedrockHoeItem(BEDROCK_MATERIAL, -2, -1.0F, 
                    new Item.Settings()));
    
    // Registration helper method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, 
                new Identifier(CharmncraftsarsenalAndArmory.MOD_ID, name), item);
    }
    
    // Initialize method (must be called in mod initializer)
    public static void registerModItems() {
        CharmncraftsarsenalAndArmory.LOGGER.info("Registering Bedrock Tools for " + CharmncraftsarsenalAndArmory.MOD_ID);
        
        // Add bedrock tools to Tools tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ModItems.BEDROCK_PICKAXE);
            entries.add(ModItems.BEDROCK_AXE);
            entries.add(ModItems.BEDROCK_SHOVEL);
            entries.add(ModItems.BEDROCK_HOE);
        });
        
        // Add bedrock sword to Combat tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ModItems.BEDROCK_SWORD);
        });
    }
}
