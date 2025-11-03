package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RefinedStoneToolMaterial implements ToolMaterial {
    public static final RefinedStoneToolMaterial INSTANCE = new RefinedStoneToolMaterial();
    
    @Override
    public int getDurability() {
        return 250;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0F;
    }
    
    @Override
    public float getAttackDamage() {
        return 1.0F;
    }
    
    @Override
    public int getMiningLevel() {
        return 1;
    }
    
    @Override
    public int getEnchantability() {
        return 5;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(net.minecraft.item.Items.STONE);
    }
}
