package com.ip_thirteen.kazakhstanrpg.init;

import com.ip_thirteen.kazakhstanrpg.KazakhstanRpg;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {

    public static final ResourceLocation CUMIS_STILL_RL =  new ResourceLocation(KazakhstanRpg.MOD_ID,
            "blocks/cumis_still");
    public static final ResourceLocation CUMIS_FLOWING_RL =  new ResourceLocation(KazakhstanRpg.MOD_ID,
            "blocks/cumis_flowing");
    public static final ResourceLocation CUMIS_OVERLAY_RL =  new ResourceLocation(KazakhstanRpg.MOD_ID,
            "blocks/cumis_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
            KazakhstanRpg.MOD_ID);

    public static final  RegistryObject<FlowingFluid> CUMIS_FLUID = FLUIDS.register("cumis_fluid",
            ()-> new ForgeFlowingFluid.Source(FluidInit.CUMIS_FLUID_PROPERTIES));
    public static final  RegistryObject<FlowingFluid> CUMIS_FLOWING = FLUIDS.register("cumis_flowing",
            ()-> new ForgeFlowingFluid.Flowing(FluidInit.CUMIS_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties CUMIS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ()->CUMIS_FLUID.get(),
            ()->CUMIS_FLOWING.get(),
            FluidAttributes.builder(CUMIS_STILL_RL,CUMIS_FLOWING_RL)
                    .density(15)
                    .luminosity(2)
                    .viscosity(5)
                    .sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK).overlay(CUMIS_OVERLAY_RL)
                    .color(0x88886688))
            .slopeFindDistance(4)
            .levelDecreasePerBlock(2)
            .block(()->FluidInit.CUMIS_FLUID_BLOCK.get()).bucket(()->ItemInit.CUMIS_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> CUMIS_FLUID_BLOCK = BlockInit.BLOCKS
            .register("cumis_fluid_block",()-> new FlowingFluidBlock(()-> FluidInit.CUMIS_FLUID.get(),
                    AbstractBlock.Properties.create(Material.WATER)
                            .doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));
}
