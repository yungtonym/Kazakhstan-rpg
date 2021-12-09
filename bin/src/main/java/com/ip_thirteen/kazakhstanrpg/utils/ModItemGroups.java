package com.ip_thirteen.kazakhstanrpg.utils;

import com.ip_thirteen.kazakhstanrpg.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class ModItemGroups {
    public static ItemGroup createGroup(String id, RegistryObject<Item> icon)
    {
        return new ItemGroup(id) {
            @Override
            public ItemStack createIcon() {
                return new ItemStack(icon.get());
            }
        };
    }
    public static ItemGroup Mod_Materials_TAB = createGroup("Mod_Materials_TAB", ModItems.CUMIS);
}
