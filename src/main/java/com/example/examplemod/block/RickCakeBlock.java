package com.example.examplemod.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.item.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

// TODO: 方块状态, 非实心, 自定义模型, 含水
public class RickCakeBlock extends Block {
    private static final Properties properties;

    static {
        // Properties有好几种创建的方式
        /*
        1. 使用Forge提供的材质, 默认自带材质颜色
        properties = Properties.of(Material.NETHER_WOOD);

        2. 自定义材质颜色
        properties = Properties.of(Material.NETHER_WOOD, MaterialColor.COLOR_GRAY);
        properties = Properties.of(Material.NETHER_WOOD, DyeColor.LIGHT_BLUE);

        3. 可传入一个Function, 根据方块的状态, 来动态更改颜色
        properties = Properties.of(Material.WOOD, (state) -> MaterialColor.WOOD);

        4. 复制其他方块属性(这里复制的是原版MC的石头)
        properties = Properties.copy(Blocks.STONE);
         */

        properties = Properties.of(MyMaterial.NORMAL.toMaterial())
                // 设置摩擦力系数
                .friction(1F)
                // 设置速度因子乘数
                .speedFactor(1F)
                // 设置跳跃因子
                .jumpFactor(1F)

                // 设置光照等级
                .lightLevel(v -> 15)
                // 设置方块是否是有效的生物生成位置
                .isValidSpawn((p_test_1_, p_test_2_, p_test_3_, p_test_4_) -> false)

                // 设置采集等级
                .harvestLevel(1)
                // 设置方块是否需要正确的工具才能掉落物品
                .requiresCorrectToolForDrops()
                // 如果被破坏不掉落物品
                .noDrops()
                // 指定采集工具
                .harvestTool(ToolType.PICKAXE)
                // 设置为瞬间破坏
//                .instabreak()
                // 设置方块强度: 破坏时间(destroyTime), 爆炸耐性(explosionResistance)
                .strength(1F, 3F)
                // 设置声音
                .sound(SoundType.BAMBOO)

                // 启用: 形状动态改变
                .dynamicShape()
                // 启用: 游戏中的方块随机时间都可更新
                .randomTicks();

                // 设置为空气
//                .air()
                // 设置为无碰撞
//                .noCollission()
                // 设置为无遮挡
//                .noOcclusion();
    }

    public RickCakeBlock() {
        super(properties);
    }
}
