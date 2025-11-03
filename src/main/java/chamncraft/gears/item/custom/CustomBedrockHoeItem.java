package chamncraft.gears.item.custom;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class CustomBedrockHoeItem extends HoeItem {
    public CustomBedrockHoeItem(ToolMaterial material, int attackDamage, 
                               float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
