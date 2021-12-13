package com.ip_thirteen.kazakhstanrpg.event;

import com.ip_thirteen.kazakhstanrpg.init.FluidInit;
import com.ip_thirteen.kazakhstanrpg.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class BottleEvent {
    @SubscribeEvent
    public static void WaterbottelTanks(RightClickBlock.RightClickBlock event)
    {
        ItemStack item = new ItemStack(ItemInit.CUMIS_BOTTLE.get(),1);

        if(event.getPlayer().getHeldItemMainhand().getItem() == Items.GLASS_BOTTLE)
        {
            if(event.getWorld().getFluidState(event.getPos()).getFluid() == FluidInit.CUMIS_FLUID.get())
            {
                if(!event.getPlayer().isCreative())
                {
                    event.getPlayer().setHeldItem(Hand.MAIN_HAND, ItemStack.EMPTY);
                }
                event.getPlayer().inventory.addItemStackToInventory(item);
            }
        }
    }
}
