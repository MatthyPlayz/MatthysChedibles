package com.matthyfamily.init;

import com.matthyfamily.MatthysChedibles;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MatthysChedibles.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(MatthysChedibles.MOD_ID)
public class ModItems {

    public static final Item sodium_chloride = null;
    public static Food bacon = null;

    /**
     * The actual event handler that registers the custom items.
     *
     * @param event The event this event handler handles
     */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //In here you pass in all item instances you want to register.
        //Make sure you always set the registry name.
        // The food register looks like: (new Food.Builder()).hunger(int hunger).saturation(saturation (float+F)).build();
        // Set the food
        bacon = (new Food.Builder()).hunger(10).saturation(1.0F).build();
        event.getRegistry().registerAll(
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "sodium_chloride"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "distillery"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "used_distillery_impure_aluminium"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "used_distillery_nitrogen_dioxide"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "filter"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "used_filter_aluminium"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "aluminium_dust"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "nitric_acid"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "sodium_nitrate"),
                new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "raw_bacon"),
                new Item(new Item.Properties().food(bacon)).setRegistryName(MatthysChedibles.MOD_ID, "bacon")
                // new Item(new Item.Properties()).setRegistryName(MatthysChedibles.MOD_ID, "bacon")
        );
    }
}