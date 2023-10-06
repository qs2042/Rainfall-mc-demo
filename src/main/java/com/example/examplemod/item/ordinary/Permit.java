package com.example.examplemod.item.ordinary;

import com.example.examplemod.group.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;

public class Permit extends Item {
    private static final Item.Properties properties;

    static {
        properties = new Item.Properties()
                // 物品组
                .tab(ModGroup.itemGroup)
                // 物品耐久度
                .defaultDurability(9)
                // 不会被火焰和岩浆烧毁
                .fireResistant()
                // 物品的稀有度: COMMON, UNCOMMON, RARE, EPIC
                .rarity(Rarity.EPIC)
                // 禁止物品修复
                .setNoRepair();
    }

    public Permit() {
        super(properties);
    }
}
