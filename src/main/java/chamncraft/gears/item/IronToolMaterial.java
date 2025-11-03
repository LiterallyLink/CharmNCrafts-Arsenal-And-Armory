package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronToolMaterial implements ToolMaterial {
    public static final IronToolMaterial INSTANCE = new IronToolMaterial();
    
    @Override
    public int getDurability() {
        // Iron tier durability
        return 250;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        // Iron mining speed
        return 6.0F;
    }
    
    @Override
    public float getAttackDamage() {
        // Iron tier attack damage bonus
        return 2.0F;
    }
    
    @Override
    public int getMiningLevel() {
        // 2 = Iron tier
        return 2;
    }
    
    @Override
    public int getEnchantability() {
        // Iron enchantability
        return 14;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        // Can be repaired with iron ingots
        return Ingredient.ofItems(net.minecraft.item.Items.IRON_INGOT);
    }
}
