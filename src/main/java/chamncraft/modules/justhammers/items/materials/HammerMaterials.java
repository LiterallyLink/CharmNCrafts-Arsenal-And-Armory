package chamncraft.modules.justhammers.items.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

/**
 * Custom tool materials for upgraded hammer variants.
 */
public enum HammerMaterials implements ToolMaterial {
    // Refined tier - slightly better than base materials
    REFINED_STONE(ToolMaterials.STONE.getDurability() * 2, ToolMaterials.STONE.getMiningSpeedMultiplier() + 1.5F,
                  ToolMaterials.STONE.getAttackDamage() + 1.0F, ToolMaterials.STONE.getMiningLevel(),
                  ToolMaterials.STONE.getEnchantability() + 5, Ingredient.EMPTY),
    REFINED_IRON(ToolMaterials.IRON.getDurability() * 2, ToolMaterials.IRON.getMiningSpeedMultiplier() + 2.0F,
                 ToolMaterials.IRON.getAttackDamage() + 1.0F, ToolMaterials.IRON.getMiningLevel(),
                 ToolMaterials.IRON.getEnchantability() + 5, Ingredient.EMPTY),
    REFINED_GOLD(ToolMaterials.GOLD.getDurability() * 2, ToolMaterials.GOLD.getMiningSpeedMultiplier() + 2.0F,
                 ToolMaterials.GOLD.getAttackDamage() + 1.0F, ToolMaterials.GOLD.getMiningLevel(),
                 ToolMaterials.GOLD.getEnchantability() + 5, Ingredient.EMPTY),
    REFINED_DIAMOND(ToolMaterials.DIAMOND.getDurability() * 2, ToolMaterials.DIAMOND.getMiningSpeedMultiplier() + 2.5F,
                    ToolMaterials.DIAMOND.getAttackDamage() + 1.5F, ToolMaterials.DIAMOND.getMiningLevel(),
                    ToolMaterials.DIAMOND.getEnchantability() + 5, Ingredient.EMPTY),
    REFINED_NETHERITE(ToolMaterials.NETHERITE.getDurability() * 2, ToolMaterials.NETHERITE.getMiningSpeedMultiplier() + 3.0F,
                      ToolMaterials.NETHERITE.getAttackDamage() + 2.0F, ToolMaterials.NETHERITE.getMiningLevel(),
                      ToolMaterials.NETHERITE.getEnchantability() + 5, Ingredient.EMPTY),

    // Reinforced tier - enhanced durability
    REINFORCED_STONE(ToolMaterials.STONE.getDurability() * 3, ToolMaterials.STONE.getMiningSpeedMultiplier() + 2.5F,
                     ToolMaterials.STONE.getAttackDamage() + 2.0F, ToolMaterials.STONE.getMiningLevel(),
                     ToolMaterials.STONE.getEnchantability() + 8, Ingredient.EMPTY),
    REINFORCED_IRON(ToolMaterials.IRON.getDurability() * 3, ToolMaterials.IRON.getMiningSpeedMultiplier() + 3.0F,
                    ToolMaterials.IRON.getAttackDamage() + 2.0F, ToolMaterials.IRON.getMiningLevel(),
                    ToolMaterials.IRON.getEnchantability() + 8, Ingredient.EMPTY),
    REINFORCED_GOLD(ToolMaterials.GOLD.getDurability() * 3, ToolMaterials.GOLD.getMiningSpeedMultiplier() + 3.5F,
                    ToolMaterials.GOLD.getAttackDamage() + 2.0F, ToolMaterials.GOLD.getMiningLevel(),
                    ToolMaterials.GOLD.getEnchantability() + 10, Ingredient.EMPTY),
    REINFORCED_DIAMOND(ToolMaterials.DIAMOND.getDurability() * 3, ToolMaterials.DIAMOND.getMiningSpeedMultiplier() + 4.0F,
                       ToolMaterials.DIAMOND.getAttackDamage() + 2.5F, ToolMaterials.DIAMOND.getMiningLevel(),
                       ToolMaterials.DIAMOND.getEnchantability() + 8, Ingredient.EMPTY),
    REINFORCED_NETHERITE(ToolMaterials.NETHERITE.getDurability() * 3, ToolMaterials.NETHERITE.getMiningSpeedMultiplier() + 4.5F,
                         ToolMaterials.NETHERITE.getAttackDamage() + 3.0F, ToolMaterials.NETHERITE.getMiningLevel(),
                         ToolMaterials.NETHERITE.getEnchantability() + 8, Ingredient.EMPTY),

    // Fortified tier - very strong
    FORTIFIED_STONE(ToolMaterials.STONE.getDurability() * 4, ToolMaterials.STONE.getMiningSpeedMultiplier() + 4.0F,
                    ToolMaterials.STONE.getAttackDamage() + 3.0F, ToolMaterials.STONE.getMiningLevel(),
                    ToolMaterials.STONE.getEnchantability() + 12, Ingredient.EMPTY),
    FORTIFIED_IRON(ToolMaterials.IRON.getDurability() * 4, ToolMaterials.IRON.getMiningSpeedMultiplier() + 5.0F,
                   ToolMaterials.IRON.getAttackDamage() + 3.0F, ToolMaterials.IRON.getMiningLevel(),
                   ToolMaterials.IRON.getEnchantability() + 12, Ingredient.EMPTY),
    FORTIFIED_GOLD(ToolMaterials.GOLD.getDurability() * 4, ToolMaterials.GOLD.getMiningSpeedMultiplier() + 6.0F,
                   ToolMaterials.GOLD.getAttackDamage() + 3.0F, ToolMaterials.GOLD.getMiningLevel(),
                   ToolMaterials.GOLD.getEnchantability() + 15, Ingredient.EMPTY),
    FORTIFIED_DIAMOND(ToolMaterials.DIAMOND.getDurability() * 4, ToolMaterials.DIAMOND.getMiningSpeedMultiplier() + 6.0F,
                      ToolMaterials.DIAMOND.getAttackDamage() + 4.0F, ToolMaterials.DIAMOND.getMiningLevel(),
                      ToolMaterials.DIAMOND.getEnchantability() + 12, Ingredient.EMPTY),
    FORTIFIED_NETHERITE(ToolMaterials.NETHERITE.getDurability() * 4, ToolMaterials.NETHERITE.getMiningSpeedMultiplier() + 7.0F,
                        ToolMaterials.NETHERITE.getAttackDamage() + 5.0F, ToolMaterials.NETHERITE.getMiningLevel(),
                        ToolMaterials.NETHERITE.getEnchantability() + 12, Ingredient.EMPTY),

    // Fabled tier - legendary quality
    FABLED_STONE(ToolMaterials.STONE.getDurability() * 6, ToolMaterials.STONE.getMiningSpeedMultiplier() + 6.0F,
                 ToolMaterials.STONE.getAttackDamage() + 5.0F, ToolMaterials.STONE.getMiningLevel(),
                 ToolMaterials.STONE.getEnchantability() + 20, Ingredient.EMPTY),
    FABLED_IRON(ToolMaterials.IRON.getDurability() * 6, ToolMaterials.IRON.getMiningSpeedMultiplier() + 7.0F,
                ToolMaterials.IRON.getAttackDamage() + 5.0F, ToolMaterials.IRON.getMiningLevel(),
                ToolMaterials.IRON.getEnchantability() + 20, Ingredient.EMPTY),
    FABLED_GOLD(ToolMaterials.GOLD.getDurability() * 6, ToolMaterials.GOLD.getMiningSpeedMultiplier() + 10.0F,
                ToolMaterials.GOLD.getAttackDamage() + 5.0F, ToolMaterials.GOLD.getMiningLevel(),
                ToolMaterials.GOLD.getEnchantability() + 30, Ingredient.EMPTY),
    FABLED_DIAMOND(ToolMaterials.DIAMOND.getDurability() * 6, ToolMaterials.DIAMOND.getMiningSpeedMultiplier() + 9.0F,
                   ToolMaterials.DIAMOND.getAttackDamage() + 6.0F, ToolMaterials.DIAMOND.getMiningLevel(),
                   ToolMaterials.DIAMOND.getEnchantability() + 20, Ingredient.EMPTY),
    FABLED_NETHERITE(ToolMaterials.NETHERITE.getDurability() * 6, ToolMaterials.NETHERITE.getMiningSpeedMultiplier() + 10.0F,
                     ToolMaterials.NETHERITE.getAttackDamage() + 8.0F, ToolMaterials.NETHERITE.getMiningLevel(),
                     ToolMaterials.NETHERITE.getEnchantability() + 20, Ingredient.EMPTY);

    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Ingredient repairIngredient;

    HammerMaterials(int durability, float miningSpeedMultiplier, float attackDamage,
                    int miningLevel, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
