package com.ip_thirteen.kazakhstanrpg.init;

import com.ip_thirteen.kazakhstanrpg.KazakhstanRpg;

import com.ip_thirteen.kazakhstanrpg.items.MaterialItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, KazakhstanRpg.MOD_ID);

    public static final RegistryObject <Item> CUMIS = ITEMS.register("cumis", MaterialItem::new);
}