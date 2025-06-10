package net.dertres.storageexpanded.item;

import net.dertres.storageexpanded.StorageExpanded;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StorageExpanded.MOD_ID); //StorageExpanded refers to the main class.
    //DeferredRegister is a helper class helping to register objects.
    //A long list of all the items you want to register.
    //it is Deferred because it only tells minecraft at a specific time under a different mod id.

    public static final DeferredItem<Item> GOLDKEY = ITEMS.register("gold_key",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRONKEY = ITEMS.register("iron_key",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPERKEY = ITEMS.register("copper_key",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
