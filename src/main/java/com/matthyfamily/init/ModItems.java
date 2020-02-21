package com.matthyfamily.init;

import com.matthyfamily.MatthysChedibles;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MatthysChedibles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(MatthysChedibles.MOD_ID)
public class ModItems {

    public static final Item sodium_chloride = null;

    /**
     * The actual event handler that registers the custom items.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        event.getRegistry().registerAll(
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "sodium_chloride"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "distillery"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "used_distillery_impure_aluminium"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "used_distillery_nitrogen_dioxide"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "filter"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "used_filter_aluminium"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "aluminium_dust")
        );
    }

}