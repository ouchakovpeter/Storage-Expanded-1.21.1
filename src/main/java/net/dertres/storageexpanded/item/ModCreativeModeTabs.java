package net.dertres.storageexpanded.item;

import net.dertres.storageexpanded.StorageExpanded;
import net.dertres.storageexpanded.block.ModBlocks;
import net.minecraft.client.gui.screens.CreateBuffetWorldScreen;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StorageExpanded.MOD_ID);

    public static final Supplier<CreativeModeTab> STORAGE_EXPANDED_ITEMS_TAB = CREATIVE_MODE_TAB.register("storage_expanded_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLDKEY.get()))
                    .title(Component.translatable("creativetab.storageexpanded.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(ModItems.GOLDKEY);
                      output.accept(ModItems.IRONKEY);
                      output.accept(ModItems.COPPERKEY);
                      output.accept(ModBlocks.LOCKABLE_OAK_DOOR);
                      output.accept(ModBlocks.LOCKABLE_OAK_TRAPDOOR);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
