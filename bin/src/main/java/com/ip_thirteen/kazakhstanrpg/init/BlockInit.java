package com.ip_thirteen.kazakhstanrpg.init;


import com.ip_thirteen.kazakhstanrpg.KazakhstanRpg;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, KazakhstanRpg.MOD_ID);

    public static final RegistryObject<Block> CUMIS_BLOCK = BLOCK.register("cumis_block",
            () -> new Block(Block.Properties.create(Material.WATER, MaterialColor.YELLOW)));

    public static void register(IEventBus eventBus)
    {
        BLOCK.register(eventBus);
    }

}
