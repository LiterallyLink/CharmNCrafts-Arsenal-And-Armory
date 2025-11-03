package chamncraft.modules.bedrocktools.items.custom;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Custom Bedrock Pickaxe - Unbreakable mining tool.
 */
public class CustomBedrockPickaxeItem extends PickaxeItem {
    public CustomBedrockPickaxeItem(ToolMaterial material, int attackDamage,
                                    float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
