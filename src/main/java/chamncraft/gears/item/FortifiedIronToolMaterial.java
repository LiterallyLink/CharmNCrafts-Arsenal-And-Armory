package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FortifiedIronToolMaterial implements ToolMaterial {
    public static final FortifiedIronToolMaterial INSTANCE = new FortifiedIronToolMaterial();
    
    @Override
    public int getDurability() {
        return 600;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0F;
    }
    
    @Override
    public float getAttackDamage() {
        return 2.0F;
    }
    
    @Override
    public int getMiningLevel() {
        return 2;
    }
    
    @Override
    public int getEnchantability() {
        return 14;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(net.minecraft.item.Items.IRON_INGOT);
    }
}
