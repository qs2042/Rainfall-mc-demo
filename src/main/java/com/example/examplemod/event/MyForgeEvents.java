package com.example.examplemod.event;

import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod.EventBusSubscriber
public class MyForgeEvents {
    private static final Logger LOGGER = LogManager.getLogger();

//    @SubscribeEvent
//    public static void drawLast(RenderWorldLastEvent event) {
//        System.out.println("Drawing!");
//    }

    // 捡起物品
    @SubscribeEvent
    public static void pickupItem(EntityItemPickupEvent event) {
        LOGGER.info("捡起了物品: " + event.getItem().getName());
    }

    // 铁毡上进行操作
    @SubscribeEvent
    public static void anvilUpdate(AnvilUpdateEvent event) {
        LOGGER.info("铁毡上进行操作: " + event);
    }

    // 实体繁殖并产生一个新的幼年实体时
    @SubscribeEvent
    public static void babyEntitySpawn(BabyEntitySpawnEvent event) {
        LOGGER.info("实体繁殖并产生一个新的幼年实体时: " + event);
    }

}
