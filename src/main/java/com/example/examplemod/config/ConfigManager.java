package com.example.examplemod.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.config.ModConfig.Type;

public class ConfigManager {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec CONFIG;

    // 定义配置项
    public static final ForgeConfigSpec.BooleanValue ENABLE_CUSTOM_BLOCK;

    static {
        BUILDER.comment("Block Configuration").push("block");

        ENABLE_CUSTOM_BLOCK = BUILDER.comment("Enable custom block")
                .define("enableCustomBlock", true);

        BUILDER.pop();

        CONFIG = BUILDER.build();
    }

    public static void registerConfigs() {
        ModLoadingContext.get().registerConfig(Type.COMMON, CONFIG);
    }

    public static void loadConfigs(ModConfig.Loading event) {
        // 在这里加载配置文件
    }
}
