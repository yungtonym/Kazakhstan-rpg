package com.ip_thirteen.kazakhstanrpg.init;

import com.ip_thirteen.kazakhstanrpg.KazakhstanRpg;

import com.ip_thirteen.kazakhstanrpg.items.ModArmorMaterial;
import com.ip_thirteen.kazakhstanrpg.items.ModItemTier;
import com.ip_thirteen.kazakhstanrpg.utils.ModItemGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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
            () -> new BucketItem ( () -> FluidInit.CUMIS_FLUID.get(),
                    new Item.Properties()
                            .maxStackSize(1)
                            .group(ModItemGroups.Mod_Materials_TAB)));

    public static final RegistryObject <Item> CUMIS_BOTTLE = ITEMS.register("cumis_bottle",
            ()-> new GlassBottleItem(new Item.Properties().group(ModItemGroups.Mod_Materials_TAB).maxStackSize(1)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().group(ModItemGroups.Mod_Materials_TAB)));

    public static final RegistryObject <SwordItem> SABER = ITEMS.register("saber",
            ()-> new SwordItem(ItemTier.IRON,8,0.6f,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB).maxStackSize(1)));
    //block
    public static final RegistryObject <Item> CUMIS_BLOCK = ITEMS.register("cumis_block",
            () -> new BlockItem(BlockInit.CUMIS_BLOCK.get(), new Item.Properties().group(ModItemGroups.Mod_Materials_TAB)));
    // Ruby Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 4, -2.4f,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB).maxStackSize(1)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8f,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB).maxStackSize(1)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 1, -3f,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB).maxStackSize(1)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 6, -3.0f,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB).maxStackSize(1)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, -2, 0f,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB).maxStackSize(1)));

    //Armor ruby
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB)));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB)));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB)));

    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroups.Mod_Materials_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}