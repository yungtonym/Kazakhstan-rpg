package com.ip_thirteen.kazakhstanrpg.init;

import com.ip_thirteen.kazakhstanrpg.KazakhstanRpg;

import com.ip_thirteen.kazakhstanrpg.items.MaterialItem;
import com.ip_thirteen.kazakhstanrpg.utils.ModItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =DeferredRegister.create(ForgeRegistries.ITEMS, KazakhstanRpg.MOD_ID);
    //item
    public static final RegistryObject <Item> CUMIS = ITEMS.register("cumis", MaterialItem::new);
    //block
    public static final RegistryObject <Item> CUMIS_BLOCK = ITEMS.register("cumis_block",
            () -> new BlockItem(BlockInit.CUMIS_BLOCK.get(), new Item.Properties().group(ModItemGroups.Mod_Materials_TAB)));
}