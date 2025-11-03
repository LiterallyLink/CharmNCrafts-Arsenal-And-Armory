package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FabledGoldToolMaterial implements ToolMaterial {
    public static final FabledGoldToolMaterial INSTANCE = new FabledGoldToolMaterial();
    
    @Override
    public int getDurability() {
        return 160;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }
    
    @Override
    public float getAttackDamage() {
        return 0.0F;
    }
    
    @Override
    public int getMiningLevel() {
        return 0;
    }
    
    @Override
    public int getEnchantability() {
        return 22;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(net.minecraft.item.Items.GOLD_INGOT);
    }
}
