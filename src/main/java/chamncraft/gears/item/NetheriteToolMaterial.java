package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteToolMaterial implements ToolMaterial {
    public static final NetheriteToolMaterial INSTANCE = new NetheriteToolMaterial();
    
    @Override
    public int getDurability() {
        // Netherite tier durability
        return 2031;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        // Netherite mining speed
        return 9.0F;
    }
    
    @Override
    public float getAttackDamage() {
        // Netherite tier attack damage bonus
        return 4.0F;
    }
    
    @Override
    public int getMiningLevel() {
        // 4 = Netherite tier
        return 4;
    }
    
    @Override
    public int getEnchantability() {
        // Netherite enchantability
        return 15;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        // Can be repaired with netherite ingots
        return Ingredient.ofItems(net.minecraft.item.Items.NETHERITE_INGOT);
    }
}
