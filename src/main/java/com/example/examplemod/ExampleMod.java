package com.example.examplemod;

import com.example.examplemod.block.BlockRegistry;
import com.example.examplemod.config.ConfigManager;
import com.example.examplemod.event.TestEvents;
import com.example.examplemod.item.ItemRegistry;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {
    public static final String MOD_ID = "demo";

    // 引用 log4j 日志
    private static final Logger LOGGER = LogManager.getLogger();

    public ExampleMod() {
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        // [Mod总线] 处理游戏的生命周期
        // 注册setup方法
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // 注册enqueueIMC方法
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // 注册processIMC方法
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // 注册doClientStuff方法
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // [Forge总线] 处理游戏事件
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new TestEvents());
    }

    // 事件: 初始化(放置一些与模组初始化相关的代码)
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        // 注册配置文件
        ConfigManager.registerConfigs();
    }

    // 事件: 初始化(客户端)(注册渲染器、创建GUI界面等操作需要使用这种事件)
    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    // 模组通信案例: 将IMC转发给另一个模组
    private void enqueueIMC(final InterModEnqueueEvent event) {
        InterModComms.sendTo("examplemod", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    // 模组通信案例: 接收和处理来自其他模组的InterModComms
    private void processIMC(final InterModProcessEvent event) {
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
}
