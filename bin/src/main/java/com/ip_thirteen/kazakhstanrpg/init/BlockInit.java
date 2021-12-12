package com.ip_thirteen.kazakhstanrpg.init;


import com.ip_thirteen.kazakhstanrpg.KazakhstanRpg;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            KazakhstanRpg.MOD_ID);
    public static final RegistryObject<Block> CUMIS_BLOCK = BLOCKS.register("cumis_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON).sound(SoundType.METAL)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)));

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

}
