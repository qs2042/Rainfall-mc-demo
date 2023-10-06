package com.example.examplemod.item.food;

import com.example.examplemod.group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class FlowerNectar extends Item {
    private static Properties properties = null;

    static {
        Supplier<EffectInstance> effectSupplier = () -> new EffectInstance(Effects.MOVEMENT_SPEED, 600, 2);
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
                // 添加效果：在50%的概率下给予速度效果（持续时间600，等级2）
                .effect(effectSupplier, 0.5f)
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

    public FlowerNectar() {
        super(properties);
    }
}
