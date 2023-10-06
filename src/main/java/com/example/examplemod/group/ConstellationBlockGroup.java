package com.example.examplemod.group;

import com.example.examplemod.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ConstellationBlockGroup extends ItemGroup {
    public ConstellationBlockGroup() {
        super("constellation_block_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.SLEEP_FISH_ITEM.get());
    }
}
