package com.ip_thirteen.kazakhstanrpg.items;

import com.ip_thirteen.kazakhstanrpg.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class MaterialItem extends Item
{
    public MaterialItem()
    {
        super(new Item.Properties().group(ModItemGroups.Mod_Materials_TAB));
    }
}