package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RefinedDiamondToolMaterial implements ToolMaterial {
    public static final RefinedDiamondToolMaterial INSTANCE = new RefinedDiamondToolMaterial();
    
    @Override
    public int getDurability() {
        return 2500;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }
    
    @Override
    public float getAttackDamage() {
        return 3.0F;
    }
    
    @Override
    public int getMiningLevel() {
        return 3;
    }
    
    @Override
    public int getEnchantability() {
        return 10;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(net.minecraft.item.Items.DIAMOND);
    }
}
