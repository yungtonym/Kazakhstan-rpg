package com.ip_thirteen.kazakhstanrpg.init;

import com.ip_thirteen.kazakhstanrpg.KazakhstanRpg;

import com.ip_thirteen.kazakhstanrpg.utils.ModItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            KazakhstanRpg.MOD_ID);
    //item
    public static final RegistryObject <Item> CUMIS = ITEMS.register("cumis",
            () -> new Item(new Item.Properties().group(ModItemGroups.Mod_Materials_TAB).maxStackSize(1)));

    public static final RegistryObject<BucketItem> CUMIS_BUCKET = ITEMS.register("cumis_bucket",
            () -> new BucketItem(() -> FluidInit.CUMIS_FLUID.get(),
                    new Item.Properties()
                            .maxStackSize(1)
                            .group(ModItemGroups.Mod_Materials_TAB)));
    //block
    public static final RegistryObject <Item> CUMIS_BLOCK = ITEMS.register("cumis_block",
            () -> new BlockItem(BlockInit.CUMIS_BLOCK.get(), new Item.Properties().group(ModItemGroups.Mod_Materials_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}