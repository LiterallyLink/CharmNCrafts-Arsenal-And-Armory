package chamncraft.modules.bedrocktools.items.custom;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

/**
 * Custom Bedrock Axe - Unbreakable chopping tool and weapon.
 */
public class CustomBedrockAxeItem extends AxeItem {
    public CustomBedrockAxeItem(ToolMaterial material, float attackDamage,
                               float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
