package chamncraft.gears.item;

import chamncraft.gears.CharmncraftsGearsAndGadgets;
import chamncraft.gears.item.custom.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    
    // Material instances - STONE
    public static final ToolMaterial STONE_HAMMER_MATERIAL = StoneToolMaterial.INSTANCE;
    public static final ToolMaterial REFINED_STONE_HAMMER_MATERIAL = RefinedStoneToolMaterial.INSTANCE;
    public static final ToolMaterial REINFORCED_STONE_HAMMER_MATERIAL = FortifiedStoneToolMaterial.INSTANCE;
    public static final ToolMaterial FORTIFIED_STONE_HAMMER_MATERIAL = FortifiedStoneToolMaterial.INSTANCE;
    public static final ToolMaterial FABLED_STONE_HAMMER_MATERIAL = FabledStoneToolMaterial.INSTANCE;
    
    // Material instances - GOLD
    public static final ToolMaterial GOLD_HAMMER_MATERIAL = GoldToolMaterial.INSTANCE;
    public static final ToolMaterial REFINED_GOLD_HAMMER_MATERIAL = RefinedGoldToolMaterial.INSTANCE;
    public static final ToolMaterial REINFORCED_GOLD_HAMMER_MATERIAL = FortifiedGoldToolMaterial.INSTANCE;
    public static final ToolMaterial FORTIFIED_GOLD_HAMMER_MATERIAL = FortifiedGoldToolMaterial.INSTANCE;
    public static final ToolMaterial FABLED_GOLD_HAMMER_MATERIAL = FabledGoldToolMaterial.INSTANCE;
    
    // Material instances - IRON
    public static final ToolMaterial IRON_HAMMER_MATERIAL = IronToolMaterial.INSTANCE;
    public static final ToolMaterial REFINED_IRON_HAMMER_MATERIAL = RefinedIronToolMaterial.INSTANCE;
    public static final ToolMaterial REINFORCED_IRON_HAMMER_MATERIAL = FortifiedIronToolMaterial.INSTANCE;
    public static final ToolMaterial FORTIFIED_IRON_HAMMER_MATERIAL = FortifiedIronToolMaterial.INSTANCE;
    public static final ToolMaterial FABLED_IRON_HAMMER_MATERIAL = FabledIronToolMaterial.INSTANCE;
    
    // Material instances - DIAMOND
    public static final ToolMaterial DIAMOND_HAMMER_MATERIAL = DiamondToolMaterial.INSTANCE;
    public static final ToolMaterial REFINED_DIAMOND_HAMMER_MATERIAL = RefinedDiamondToolMaterial.INSTANCE;
    public static final ToolMaterial REINFORCED_DIAMOND_HAMMER_MATERIAL = FortifiedDiamondToolMaterial.INSTANCE;
    public static final ToolMaterial FORTIFIED_DIAMOND_HAMMER_MATERIAL = FortifiedDiamondToolMaterial.INSTANCE;
    public static final ToolMaterial FABLED_DIAMOND_HAMMER_MATERIAL = FabledDiamondToolMaterial.INSTANCE;
    
    // Material instances - NETHERITE
    public static final ToolMaterial NETHERITE_HAMMER_MATERIAL = NetheriteToolMaterial.INSTANCE;
    public static final ToolMaterial REFINED_NETHERITE_HAMMER_MATERIAL = RefinedNetheriteToolMaterial.INSTANCE;
    public static final ToolMaterial REINFORCED_NETHERITE_HAMMER_MATERIAL = FortifiedNetheriteToolMaterial.INSTANCE;
    public static final ToolMaterial FORTIFIED_NETHERITE_HAMMER_MATERIAL = FortifiedNetheriteToolMaterial.INSTANCE;
    public static final ToolMaterial FABLED_NETHERITE_HAMMER_MATERIAL = FabledNetheriteToolMaterial.INSTANCE;
    
    // ===== SMITHING TEMPLATES =====
    public static final Item BLANK_SMITHING_TEMPLATE = registerItem("blank_smithing_template",
            new Item(new Item.Settings().maxCount(64)));
    
    public static final Item GOLD_SMITHING_TEMPLATE = registerItem("gold_smithing_template",
            new Item(new Item.Settings().maxCount(64)));
    
    public static final Item IRON_SMITHING_TEMPLATE = registerItem("iron_smithing_template",
            new Item(new Item.Settings().maxCount(64)));
    
    public static final Item BLANK_NETHERITE_SMITHING_TEMPLATE = registerItem("blank_netherite_smithing_template",
            new Item(new Item.Settings().maxCount(64)));
    
    public static final Item NETHERITE_SMITHING_TEMPLATE = registerItem("netherite_smithing_template",
            new Item(new Item.Settings().maxCount(64)));

    // ===== STONE HAMMERS =====
    public static final Item STONE_HAMMER = registerItem("stone_hammer",
            new CustomHammerItem(STONE_HAMMER_MATERIAL, 1, -2.8F, 
                    new Item.Settings(), 3, 3, 1));
    
    public static final Item REFINED_STONE_HAMMER = registerItem("refined_stone_hammer",
            new CustomHammerItem(REFINED_STONE_HAMMER_MATERIAL, 1, -2.8F, 
                    new Item.Settings(), 3, 3, 3));
    
    public static final Item REINFORCED_STONE_HAMMER = registerItem("reinforced_stone_hammer",
            new CustomHammerItem(REINFORCED_STONE_HAMMER_MATERIAL, 1, -2.8F, 
                    new Item.Settings(), 5, 5, 1));
    
    public static final Item FORTIFIED_STONE_HAMMER = registerItem("fortified_stone_hammer",
            new CustomHammerItem(FORTIFIED_STONE_HAMMER_MATERIAL, 1, -2.8F, 
                    new Item.Settings(), 5, 5, 3));
    
    public static final Item FABLED_STONE_HAMMER = registerItem("fabled_stone_hammer",
            new CustomHammerItem(FABLED_STONE_HAMMER_MATERIAL, 1, -2.8F, 
                    new Item.Settings(), 5, 5, 5));
    
    // ===== GOLD HAMMERS =====
    public static final Item GOLD_HAMMER = registerItem("gold_hammer",
            new CustomHammerItem(GOLD_HAMMER_MATERIAL, 0, -2.8F, 
                    new Item.Settings(), 3, 3, 1));
    
    public static final Item REFINED_GOLD_HAMMER = registerItem("refined_gold_hammer",
            new CustomHammerItem(REFINED_GOLD_HAMMER_MATERIAL, 0, -2.8F, 
                    new Item.Settings(), 3, 3, 3));
    
    public static final Item REINFORCED_GOLD_HAMMER = registerItem("reinforced_gold_hammer",
            new CustomHammerItem(REINFORCED_GOLD_HAMMER_MATERIAL, 0, -2.8F, 
                    new Item.Settings(), 5, 5, 1));
    
    public static final Item FORTIFIED_GOLD_HAMMER = registerItem("fortified_gold_hammer",
            new CustomHammerItem(FORTIFIED_GOLD_HAMMER_MATERIAL, 0, -2.8F, 
                    new Item.Settings(), 5, 5, 3));
    
    public static final Item FABLED_GOLD_HAMMER = registerItem("fabled_gold_hammer",
            new CustomHammerItem(FABLED_GOLD_HAMMER_MATERIAL, 0, -2.8F, 
                    new Item.Settings(), 5, 5, 5));
    
    // ===== IRON HAMMERS =====
    public static final Item IRON_HAMMER = registerItem("iron_hammer",
            new CustomHammerItem(IRON_HAMMER_MATERIAL, 2, -2.8F, 
                    new Item.Settings(), 3, 3, 1));
    
    public static final Item REFINED_IRON_HAMMER = registerItem("refined_iron_hammer",
            new CustomHammerItem(REFINED_IRON_HAMMER_MATERIAL, 2, -2.8F, 
                    new Item.Settings(), 3, 3, 3));
    
    public static final Item REINFORCED_IRON_HAMMER = registerItem("reinforced_iron_hammer",
            new CustomHammerItem(REINFORCED_IRON_HAMMER_MATERIAL, 2, -2.8F, 
                    new Item.Settings(), 5, 5, 1));
    
    public static final Item FORTIFIED_IRON_HAMMER = registerItem("fortified_iron_hammer",
            new CustomHammerItem(FORTIFIED_IRON_HAMMER_MATERIAL, 2, -2.8F, 
                    new Item.Settings(), 5, 5, 3));
    
    public static final Item FABLED_IRON_HAMMER = registerItem("fabled_iron_hammer",
            new CustomHammerItem(FABLED_IRON_HAMMER_MATERIAL, 2, -2.8F, 
                    new Item.Settings(), 5, 5, 5));
    
    // ===== DIAMOND HAMMERS =====
    public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
            new CustomHammerItem(DIAMOND_HAMMER_MATERIAL, 3, -2.8F, 
                    new Item.Settings(), 3, 3, 1));
    
    public static final Item REFINED_DIAMOND_HAMMER = registerItem("refined_diamond_hammer",
            new CustomHammerItem(REFINED_DIAMOND_HAMMER_MATERIAL, 3, -2.8F, 
                    new Item.Settings(), 3, 3, 3));
    
    public static final Item REINFORCED_DIAMOND_HAMMER = registerItem("reinforced_diamond_hammer",
            new CustomHammerItem(REINFORCED_DIAMOND_HAMMER_MATERIAL, 3, -2.8F, 
                    new Item.Settings(), 5, 5, 1));
    
    public static final Item FORTIFIED_DIAMOND_HAMMER = registerItem("fortified_diamond_hammer",
            new CustomHammerItem(FORTIFIED_DIAMOND_HAMMER_MATERIAL, 3, -2.8F, 
                    new Item.Settings(), 5, 5, 3));
    
    public static final Item FABLED_DIAMOND_HAMMER = registerItem("fabled_diamond_hammer",
            new CustomHammerItem(FABLED_DIAMOND_HAMMER_MATERIAL, 3, -2.8F, 
                    new Item.Settings(), 5, 5, 5));
    
    // ===== NETHERITE HAMMERS =====
    public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
            new CustomHammerItem(NETHERITE_HAMMER_MATERIAL, 4, -2.8F, 
                    new Item.Settings().fireproof(), 3, 3, 1));
    
    public static final Item REFINED_NETHERITE_HAMMER = registerItem("refined_netherite_hammer",
            new CustomHammerItem(REFINED_NETHERITE_HAMMER_MATERIAL, 4, -2.8F, 
                    new Item.Settings().fireproof(), 3, 3, 3));
    
    public static final Item REINFORCED_NETHERITE_HAMMER = registerItem("reinforced_netherite_hammer",
            new CustomHammerItem(REINFORCED_NETHERITE_HAMMER_MATERIAL, 4, -2.8F, 
                    new Item.Settings().fireproof(), 5, 5, 1));
    
    public static final Item FORTIFIED_NETHERITE_HAMMER = registerItem("fortified_netherite_hammer",
            new CustomHammerItem(FORTIFIED_NETHERITE_HAMMER_MATERIAL, 4, -2.8F, 
                    new Item.Settings().fireproof(), 5, 5, 3));
    
    public static final Item FABLED_NETHERITE_HAMMER = registerItem("fabled_netherite_hammer",
            new CustomHammerItem(FABLED_NETHERITE_HAMMER_MATERIAL, 4, -2.8F, 
                    new Item.Settings().fireproof(), 5, 5, 5));
    
    // Registration helper method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, 
                new Identifier(CharmncraftsGearsAndGadgets.MOD_ID, name), item);
    }
    
    // Initialize method (must be called in mod initializer)
    public static void registerModItems() {
        CharmncraftsGearsAndGadgets.LOGGER.info("Registering Tools for " + CharmncraftsGearsAndGadgets.MOD_ID);
        
        // Register custom creative tabs
        registerCreativeTabs();

        // Add smithing templates to Ingredients tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.BLANK_SMITHING_TEMPLATE);
            entries.add(ModItems.GOLD_SMITHING_TEMPLATE);
            entries.add(ModItems.IRON_SMITHING_TEMPLATE);
            entries.add(ModItems.BLANK_NETHERITE_SMITHING_TEMPLATE);
            entries.add(ModItems.NETHERITE_SMITHING_TEMPLATE);
        });
        
        // Add hammers to custom Hammers tab
        ItemGroupEvents.modifyEntriesEvent(HAMMERS_GROUP).register(entries -> {
            entries.add(ModItems.STONE_HAMMER);
            entries.add(ModItems.REFINED_STONE_HAMMER);
            entries.add(ModItems.REINFORCED_STONE_HAMMER);
            entries.add(ModItems.FORTIFIED_STONE_HAMMER);
            entries.add(ModItems.FABLED_STONE_HAMMER);
            
            entries.add(ModItems.GOLD_HAMMER);
            entries.add(ModItems.REFINED_GOLD_HAMMER);
            entries.add(ModItems.REINFORCED_GOLD_HAMMER);
            entries.add(ModItems.FORTIFIED_GOLD_HAMMER);
            entries.add(ModItems.FABLED_GOLD_HAMMER);
            
            entries.add(ModItems.IRON_HAMMER);
            entries.add(ModItems.REFINED_IRON_HAMMER);
            entries.add(ModItems.REINFORCED_IRON_HAMMER);
            entries.add(ModItems.FORTIFIED_IRON_HAMMER);
            entries.add(ModItems.FABLED_IRON_HAMMER);
            
            entries.add(ModItems.DIAMOND_HAMMER);
            entries.add(ModItems.REFINED_DIAMOND_HAMMER);
            entries.add(ModItems.REINFORCED_DIAMOND_HAMMER);
            entries.add(ModItems.FORTIFIED_DIAMOND_HAMMER);
            entries.add(ModItems.FABLED_DIAMOND_HAMMER);
            
            entries.add(ModItems.NETHERITE_HAMMER);
            entries.add(ModItems.REFINED_NETHERITE_HAMMER);
            entries.add(ModItems.REINFORCED_NETHERITE_HAMMER);
            entries.add(ModItems.FORTIFIED_NETHERITE_HAMMER);
            entries.add(ModItems.FABLED_NETHERITE_HAMMER);
        });
    }
    
    // ===== CREATIVE TAB REGISTRATION =====
    public static final RegistryKey<ItemGroup> HAMMERS_GROUP = RegistryKey.of(
        RegistryKeys.ITEM_GROUP, 
        new Identifier(CharmncraftsGearsAndGadgets.MOD_ID, "hammers")
    );
    
    private static void registerCreativeTabs() {
        Registry.register(Registries.ITEM_GROUP, HAMMERS_GROUP,
            FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.FABLED_NETHERITE_HAMMER))
                .displayName(Text.translatable("itemGroup.charmncrafts-gears-and-gadgets.hammers"))
                .entries((displayContext, entries) -> {
                    // Stone tier
                    entries.add(ModItems.STONE_HAMMER);
                    entries.add(ModItems.REFINED_STONE_HAMMER);
                    entries.add(ModItems.REINFORCED_STONE_HAMMER);
                    entries.add(ModItems.FORTIFIED_STONE_HAMMER);
                    entries.add(ModItems.FABLED_STONE_HAMMER);
                    
                    // Gold tier
                    entries.add(ModItems.GOLD_HAMMER);
                    entries.add(ModItems.REFINED_GOLD_HAMMER);
                    entries.add(ModItems.REINFORCED_GOLD_HAMMER);
                    entries.add(ModItems.FORTIFIED_GOLD_HAMMER);
                    entries.add(ModItems.FABLED_GOLD_HAMMER);
                    
                    // Iron tier
                    entries.add(ModItems.IRON_HAMMER);
                    entries.add(ModItems.REFINED_IRON_HAMMER);
                    entries.add(ModItems.REINFORCED_IRON_HAMMER);
                    entries.add(ModItems.FORTIFIED_IRON_HAMMER);
                    entries.add(ModItems.FABLED_IRON_HAMMER);
                    
                    // Diamond tier
                    entries.add(ModItems.DIAMOND_HAMMER);
                    entries.add(ModItems.REFINED_DIAMOND_HAMMER);
                    entries.add(ModItems.REINFORCED_DIAMOND_HAMMER);
                    entries.add(ModItems.FORTIFIED_DIAMOND_HAMMER);
                    entries.add(ModItems.FABLED_DIAMOND_HAMMER);
                    
                    // Netherite tier
                    entries.add(ModItems.NETHERITE_HAMMER);
                    entries.add(ModItems.REFINED_NETHERITE_HAMMER);
                    entries.add(ModItems.REINFORCED_NETHERITE_HAMMER);
                    entries.add(ModItems.FORTIFIED_NETHERITE_HAMMER);
                    entries.add(ModItems.FABLED_NETHERITE_HAMMER);
                })
                .build()
        );
    }
}
