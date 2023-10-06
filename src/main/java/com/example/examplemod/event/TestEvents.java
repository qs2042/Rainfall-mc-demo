package com.example.examplemod.event;

import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestEvents {
    private static final Logger LOGGER = LogManager.getLogger();

    // 事件: 服务器启动过程中触发(例: 注册命令,初始化数据)(ps: 使用SubscribeEvent并让事件总线自动发现要调用的方法)
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // 服务器启动时执行的操作
        LOGGER.info("HELLO from server starting");
    }
}
