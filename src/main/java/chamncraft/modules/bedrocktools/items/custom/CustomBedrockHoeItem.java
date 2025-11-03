package chamncraft.modules.bedrocktools.items.custom;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Custom Bedrock Hoe - Unbreakable farming tool.
 */
public class CustomBedrockHoeItem extends HoeItem {
    public CustomBedrockHoeItem(ToolMaterial material, int attackDamage,
                               float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
