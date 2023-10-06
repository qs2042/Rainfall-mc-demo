package com.example.examplemod.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ItemTierCustom implements IItemTier {
    // 木头(升级)
    WOOD(0, 59, 2.0F, 0.0F, 25, () -> {
        return Ingredient.of(ItemRegistry.PERMIT.get()); // .orElse(ItemTags.PLANKS)
    }),
    // 石头(升级)
    STONE(1, 131, 4.0F, 1.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.PERMIT.get()); // ItemTags.STONE_TOOL_MATERIALS
    }),
    // 铁器(升级)
    IRON(2, 250, 6.0F, 2.0F, 24, () -> {
        return Ingredient.of(ItemRegistry.PERMIT.orElse(Items.IRON_INGOT));
    }),
    // 钻石(升级)
    DIAMOND(3, 1561, 8.0F, 3.0F, 20, () -> {
        return Ingredient.of(ItemRegistry.PERMIT.orElse(Items.DIAMOND));
    }),
    // 黄金(升级)
    GOLD(0, 32, 12.0F, 0.0F, 32, () -> {
        return Ingredient.of(ItemRegistry.PERMIT.orElse(Items.GOLD_INGOT));
    }),
    // 下届(升级)
    NETHERITE(4, 2031, 9.0F, 4.0F, 25, () -> {
        return Ingredient.of(ItemRegistry.PERMIT.orElse(Items.NETHERITE_INGOT));
    });

    private final int level;            // 材质的等级（通常对应于钻石、铁、石头等级），用于计算斧头的有效性和特性。
    private final int uses;             // 耐久度（使用次数）。
    private final float speed;          // 挖掘速度，影响砍伐木材的效率。
    private final float damage;         // 伤害值，影响攻击时对敌对实体的伤害量。
    private final int enchantmentValue; // 附魔值，用于决定可以附加的附魔等级。
    private final LazyValue<Ingredient> repairIngredient; // 用于修复斧头的材料。

    ItemTierCustom(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> supplier) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(supplier);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
