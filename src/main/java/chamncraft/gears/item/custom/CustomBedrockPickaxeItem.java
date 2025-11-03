package chamncraft.gears.item.custom;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomBedrockPickaxeItem extends PickaxeItem {
    public CustomBedrockPickaxeItem(ToolMaterial material, int attackDamage, 
                                    float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
