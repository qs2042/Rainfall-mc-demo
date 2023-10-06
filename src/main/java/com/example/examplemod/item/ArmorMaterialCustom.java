package com.example.examplemod.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ArmorMaterialCustom implements IArmorMaterial {
    // 皮革
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.LEATHER);
    }),
    // 锁链
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    // 铁
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.IRON_INGOT);
    }),
    // 金
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.GOLD_INGOT);
    }),
    // 钻
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    DIAMOND_TIGER("tiger", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.of(Items.DIAMOND);
    }),
    // 海龟
    TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> {
        return Ingredient.of(Items.SCUTE);
    }),
    // 下届
    NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    });

    // 表示每个装备槽位在装备时提供的额外生命值
    /*
    数组的每个元素对应一个槽位，索引从0开始
    例如，索引0表示头盔槽位，对应的值为13。
     */
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    // 装备名称
    private final String name;
    // 装备的耐久度乘数(用于计算装备的耐久度)
    private final int durabilityMultiplier;
    // 表示装备在不同槽位上提供的护甲值
    /*
    数组的每个元素对应一个槽位，索引从0开始
    例如，索引0表示头盔槽位，对应的值表示头盔提供的护甲值。
     */
    private final int[] slotProtections;
    // 表示装备的附魔值(附魔值用于计算附魔台上生成附魔选项的可能性)
    private final int enchantmentValue;
    // 声音事件(装备在使用时播放的声音)
    private final SoundEvent sound;
    // 装备的韧性值(韧性值影响装备的抗击退能力)
    private final float toughness;
    // 表示装备的抗击退能力(它影响玩家被敌对实体击退时的反应)
    private final float knockbackResistance;
    // 表示修复装备所需的原料(懒加载的字段)
    /*
    Ingredient 是一个表示合成配方中所需原料的类。
    在这种情况下，repairIngredient 表示修复装备所需的原料，该原料在需要时才会被加载。
     */
    private final LazyValue<Ingredient> repairIngredient;

    ArmorMaterialCustom(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> supplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(supplier);

    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}