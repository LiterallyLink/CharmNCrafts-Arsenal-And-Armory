package chamncraft.gears.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class StoneToolMaterial implements ToolMaterial {
    public static final StoneToolMaterial INSTANCE = new StoneToolMaterial();
    
    @Override
    public int getDurability() {
        // Stone tier durability
        return 131;
    }
    
    @Override
    public float getMiningSpeedMultiplier() {
        // Stone level mining speed
        return 4.0F;
    }
    
    @Override
    public float getAttackDamage() {
        // Stone tier attack damage bonus
        return 1.0F;
    }
    
    @Override
    public int getMiningLevel() {
        // 1 = Stone tier (can mine stone, iron ore, lapis, etc. but not iron blocks)
        return 1;
    }
    
    @Override
    public int getEnchantability() {
        // Stone has low enchantability
        return 5;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        // Can be repaired with stone blocks
        return Ingredient.ofItems(net.minecraft.item.Items.STONE);
    }
}
