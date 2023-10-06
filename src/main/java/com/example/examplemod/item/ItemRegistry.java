package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.block.BlockRegistry;
import com.example.examplemod.group.ModGroup;
import com.example.examplemod.item.armor.TigerHelmet;
import com.example.examplemod.item.food.FishSoup;
import com.example.examplemod.item.food.FlowerNectar;
import com.example.examplemod.item.food.WinterMelon;
import com.example.examplemod.item.ordinary.Permit;
import com.example.examplemod.item.tool.BlackGhostblade;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

/*
properties = new Item.Properties()

// 指定物品在合成过程中的剩余物品
例如为当前物品设置了合成表, 然后使用了craftRemainder方法, 传递一个钻石块Item进去
当玩家使用这个物品进行合成, 就会留下一个钻石块
properties.craftRemainder()

// 设置物品的自定义渲染器, 例如可以让物品在物品栏或世界中呈现不同的模型或动画
properties.setISTER(null)


 */
public class ItemRegistry {
    // DeferredRegister
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    // Item
    public static RegistryObject<Item> PERMIT = registerItem("permit", Permit::new);
    public static RegistryObject<Item> FISH_SOUP = registerItem("fish_soup", FishSoup::new);
    public static RegistryObject<Item> FLOWER_NECTAR = registerItem("flower_nectar", FlowerNectar::new);
    public static RegistryObject<Item> BLACK_GHOSTBLADE = registerItem("black_ghostblade", BlackGhostblade::new);
    public static RegistryObject<Item> WINTER_MELON = registerItem("winter_melon", WinterMelon::new);

    // Item
    public static final RegistryObject<Item> TIGER_HELMET = ITEMS.register("tiger_helmet", TigerHelmet::new);
    public static final RegistryObject<Item> TIGER_CHESTPLATE = ITEMS.register("tiger_chestplate", () -> new ArmorItem(ArmorMaterialCustom.DIAMOND_TIGER, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ModGroup.itemGroup)));
    public static final RegistryObject<Item> TIGER_LEGGINGS = ITEMS.register("tiger_leggings", () -> new ArmorItem(ArmorMaterialCustom.DIAMOND_TIGER, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ModGroup.itemGroup)));
    public static final RegistryObject<Item> TIGER_BOOTS = ITEMS.register(
            "tiger_boots",
            () -> new ArmorItem(
                    ArmorMaterialCustom.DIAMOND_TIGER,
                    EquipmentSlotType.FEET,
                    (new Item.Properties()).tab(ModGroup.itemGroup)
            )
    );

    public static final RegistryObject<Item> FURRY_AMATEUR_TREASURES_ITEM = ITEMS.register(
            "furry_amateur_treasures", () -> new Item(new Item.Properties().tab(ModGroup.itemGroup))
    );
    public static final RegistryObject<Item> SLEEP_FISH_ITEM = ITEMS.register(
            "sleep_fish", () -> new Item(new Item.Properties().tab(ModGroup.itemGroup))
    );

    // block
    public static final RegistryObject<Item> RICK_CAKE_ITEM = ITEMS.register(
            "rick_cake",
            () -> new BlockItem(BlockRegistry.RICK_CAKE.get(), new Item.Properties().tab(ModGroup.itemGroup))
    );


    static {
        BlockRegistry.list.forEach(v -> {
            ITEMS.register(
                    v.getId().getPath(), () -> new BlockItem(v.get(), new Item.Properties().tab(ModGroup.itemGroup))
            );
        });
    }

    // 根据 DeferredRegister<Item> 的规则写的
    private static RegistryObject<Item> registerItem(String name, Supplier<? extends Item> item) {
        return ITEMS.register(name, item);
    }

    // 模仿Items中的方法写的
    private static Item registerItem(String name, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).registerBlocks(Item.BY_BLOCK, item);
        }

        return Registry.register(Registry.ITEM, new ResourceLocation(name), item).asItem();
    }

}
