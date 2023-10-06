package com.example.examplemod.block;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    public static final RegistryObject<Block> RICK_CAKE = BLOCKS.register("rick_cake", RickCakeBlock::new);

    public static final List<RegistryObject<Block>> list = new ArrayList<>();
    static {
        List<String> strings = Arrays.asList("block_1", "block_2", "block_3");
        strings.forEach(v -> {
            RegistryObject<Block> ro = BLOCKS.register(v, RickCakeBlock::new);
            list.add(ro);
        });
    }
    /*public static final RegistryObject<Block> ROCK_PRO_BLOCK = BLOCKS.register(
            "rock_test",
            () -> new Block(Block.Properties
                    .of(Material.NETHER_WOOD)
                    .sound(SoundType.STONE)
            )
    );*/

}
