package com.example.examplemod.item.tool;

import com.example.examplemod.group.ModGroup;
import com.example.examplemod.item.ItemTierCustom;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;

import java.util.function.Supplier;

public class BlackGhostblade extends AxeItem {
    private static Properties properties = null;

    static {
        properties = new Properties()
                // 物品组, TAB_FOOD, TAB_TOOLS, TAB_(BUILDING_BLOCKS, DECORATIONS, REDSTONE)
                .tab(ModGroup.itemGroup)
                // 工具类型(ItemTier帮忙设置了属性, 这里可以不用设置)
//                .addToolType(ToolType.AXE, 5)
                // 物品耐久度
                .defaultDurability(64)
                // 物品的最大耐久度
                .durability(1024)
                // 不会被火焰和岩浆烧毁
                .fireResistant()
                // 物品的稀有度: COMMON, UNCOMMON, RARE, EPIC
                .rarity(Rarity.EPIC)
                .setNoRepair();
    }

    public BlackGhostblade() {
        // 工具属性(耐久度, 挖掘速度, 伤害, 附魔等级上限, 修复材料, 材质等级)
        // attackDamageBaseline(伤害底线 + 后续还会加上ItemTier.getAttackDamageBonus的数值)
        // 攻击速度
        // Item属性
        super(ItemTierCustom.NETHERITE, 4, 6f, properties);
    }
}

