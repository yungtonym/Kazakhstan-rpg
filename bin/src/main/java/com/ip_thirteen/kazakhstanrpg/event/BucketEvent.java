package com.ip_thirteen.kazakhstanrpg.event;


import com.ip_thirteen.kazakhstanrpg.init.ItemInit;
import net.minecraft.entity.passive.horse.HorseEntity;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public  class BucketEvent {
    @SubscribeEvent

    public static void WaterBucketEvent(PlayerInteractEvent.EntityInteractSpecific event)
    {

        ItemStack item1 = new ItemStack(ItemInit.CUMIS_BUCKET.get());

        if(event.getPlayer().getHeldItemMainhand().getItem() == Items.BUCKET)      //Если игрок кликает правой кнопкой мыши и у него в руке ведро
        {
            if(event.getTarget() instanceof HorseEntity );// если ведром нажимаем кликаем на лошадь
            {
                event.getPlayer().setHeldItem(Hand.MAIN_HAND,ItemStack.EMPTY);
                event.getPlayer().inventory.addItemStackToInventory(item1);
            }
        }
    }
}
