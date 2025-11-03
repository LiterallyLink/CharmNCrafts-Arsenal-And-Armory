package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GoldToolMaterial implements ToolMaterial {
    public static final GoldToolMaterial INSTANCE = new GoldToolMaterial();
    
    @Override
    public int getDurability() {
        // Gold has very low durability (32)
        return 32;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        // Gold is very fast mining (12.0F, fastest after netherite)
        return 12.0F;
    }
    
    @Override
    public float getAttackDamage() {
        // Gold has 0 bonus attack damage
        return 0.0F;
    }
    
    @Override
    public int getMiningLevel() {
        // 0 = Can only mine stone tier (weak, decorative)
        return 0;
    }
    
    @Override
    public int getEnchantability() {
        // Gold has highest enchantability (22)
        return 22;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        // Can be repaired with gold ingots
        return Ingredient.ofItems(net.minecraft.item.Items.GOLD_INGOT);
    }
}
