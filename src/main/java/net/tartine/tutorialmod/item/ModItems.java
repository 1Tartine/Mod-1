package net.tartine.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tartine.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> RED_PEARL = ITEMS.register("red_pearl",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CYAN_PEARL = ITEMS.register("cyan_pearl",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHARD1 = ITEMS.register("yellow_shard",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
