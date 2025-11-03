package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DiamondToolMaterial implements ToolMaterial {
    public static final DiamondToolMaterial INSTANCE = new DiamondToolMaterial();
    
    @Override
    public int getDurability() {
        // Diamond tier durability
        return 1561;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        // Diamond mining speed
        return 8.0F;
    }
    
    @Override
    public float getAttackDamage() {
        // Diamond tier attack damage bonus
        return 3.0F;
    }
    
    @Override
    public int getMiningLevel() {
        // 3 = Diamond tier
        return 3;
    }
    
    @Override
    public int getEnchantability() {
        // Diamond enchantability
        return 10;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        // Can be repaired with diamonds
        return Ingredient.ofItems(net.minecraft.item.Items.DIAMOND);
    }
}
