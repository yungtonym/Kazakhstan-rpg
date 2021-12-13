package com.ip_thirteen.kazakhstanrpg.event;

import com.ip_thirteen.kazakhstanrpg.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class CraftEvent {
    public static void ReturnBucket(PlayerEvent.ItemCraftedEvent event){
        if (event.getCrafting().getItem() == ItemInit.CUMIS_BOTTLE.get()){
            event.getPlayer().inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));
        }
    }
}
