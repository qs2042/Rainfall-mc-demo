package com.example.examplemod.event;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MyModEvents {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void propertyOverrideRegistry(FMLClientSetupEvent event) {
        // 需要先在.json文件中配置overrides
        // overrides的值格式为数组包裹多个字典
        // predicate    条件(pulling, pull, size)
        // model
        event.enqueueWork(() -> {
            // 0. 添加overrides的物品
            // 1. overrides的名字(也就是之后要在模型文件的predicate里写的名字
            // 2. 动态变化的值(这里直接调用了itemStack.getCount()函数返回了物品堆叠的数量
            ItemModelsProperties.register(
                    ItemRegistry.SLEEP_FISH_ITEM.get(),
                    new ResourceLocation(ExampleMod.MOD_ID, "size"),
                    (itemStack, clientWorld, livingEntity) -> itemStack.getCount()
            );
        });
    }

    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        LOGGER.info("注册方块中: " + blockRegistryEvent.getName());
    }

    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
        LOGGER.info("注册物品中: " + itemRegistryEvent.getName());
    }
}
