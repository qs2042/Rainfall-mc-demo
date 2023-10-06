package com.example.examplemod.item.armor;

import com.example.examplemod.group.ModGroup;
import com.example.examplemod.item.ArmorMaterialCustom;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class TigerHelmet extends ArmorItem {
    private static final Item.Properties properties;

    static {
        properties = new Item.Properties().tab(ModGroup.itemGroup);
    }

    public TigerHelmet() {
        super(
                ArmorMaterialCustom.DIAMOND_TIGER,
                EquipmentSlotType.HEAD,
                properties
        );
    }

}
