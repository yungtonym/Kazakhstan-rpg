package com.ip_thirteen.kazakhstanrpg;

import com.ip_thirteen.kazakhstanrpg.event.BucketEvent;
import com.ip_thirteen.kazakhstanrpg.init.BlockInit;
import com.ip_thirteen.kazakhstanrpg.init.FluidInit;
import com.ip_thirteen.kazakhstanrpg.init.ItemInit;
import com.ip_thirteen.kazakhstanrpg.utils.ModItemGroups;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod("kazakhstanrpg")
public class KazakhstanRpg
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "kazakhstanrpg";
    public KazakhstanRpg() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(eventBus);
        BlockInit.BLOCKS.register(eventBus);
        FluidInit.FLUIDS.register(eventBus);


        eventBus.addListener(this::setup);

        eventBus.addListener(this::doClientStuff);


        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, BucketEvent::WaterBucketEvent);
    }
    @SubscribeEvent
    public static void RegisterItem(final RegistryEvent.Register<Item> even)
    {
        final IForgeRegistry<Item> registry = even.getRegistry();

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)

                .filter(block -> !(block instanceof FlowingFluidBlock))
                .forEach(block ->{
                        final Item.Properties properties =  new Item.Properties().group(ModItemGroups.Mod_Materials_TAB);
                        final BlockItem blockItem = new BlockItem(block,properties);
                        blockItem.setRegistryName(block.getRegistryName());
                        registry.register(blockItem);
                });
        LOGGER.debug("Registered BlockItems!");
    }
    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {


    }
   /*
    You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
    */
}
