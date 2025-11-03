package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FabledNetheriteToolMaterial implements ToolMaterial {
    public static final FabledNetheriteToolMaterial INSTANCE = new FabledNetheriteToolMaterial();
    
    @Override
    public int getDurability() {
        return 9000;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0F;
    }
    
    @Override
    public float getAttackDamage() {
        return 4.0F;
    }
    
    @Override
    public int getMiningLevel() {
        return 4;
    }
    
    @Override
    public int getEnchantability() {
        return 15;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(net.minecraft.item.Items.NETHERITE_INGOT);
    }
}
