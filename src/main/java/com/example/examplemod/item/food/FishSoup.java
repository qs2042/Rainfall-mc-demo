package com.example.examplemod.item.food;

import com.example.examplemod.group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class FishSoup extends Item {
    private static Properties properties = null;

    static {
        Food food = new Food.Builder()
                // 食物的饱食度恢复量
                .nutrition(5)
                // 食物的饱和度修正值
                .saturationMod(0.8f)
                // 标记为肉类
                .meat()
                // 可以一直吃(哪怕不是饥饿状态)
                .alwaysEat()
                // 标记为快速食用
                .fast()
                .build();

        properties = new Properties()
                // 物品组
                .tab(ModGroup.itemGroup)
                // 物品的稀有度: COMMON, UNCOMMON, RARE, EPIC
                .rarity(Rarity.EPIC)
                // 设置为食物类型, 需要传递进食物的属性类
                .food(food)
                // 设置物品的最大堆叠数量
                .stacksTo(20);
    }

    public FishSoup() {
        super(properties);
    }
}
