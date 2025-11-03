package chamncraft.modules.bedrocktools.items.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

/**
 * Bedrock Tool Material - Unbreakable tools with moderate stats.
 */
public class BedrockToolMaterial implements ToolMaterial {
    public static final BedrockToolMaterial INSTANCE = new BedrockToolMaterial();

    @Override
    public int getDurability() {
        // Infinite durability - use max int value
        return Integer.MAX_VALUE;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // Around iron level (6.0F is iron)
        return 6.0F;
    }

    @Override
    public float getAttackDamage() {
        // Around iron level (2.0F is iron)
        return 2.0F;
    }

    @Override
    public int getMiningLevel() {
        // 2 = Iron tier (can mine iron/lapis but not diamond)
        return 2;
    }

    @Override
    public int getEnchantability() {
        // 0 = cannot be enchanted
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // Never loses durability, so no repair needed
        return Ingredient.EMPTY;
    }
}
