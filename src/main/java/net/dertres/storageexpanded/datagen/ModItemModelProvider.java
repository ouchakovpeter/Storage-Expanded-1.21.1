package net.dertres.storageexpanded.datagen;

import net.dertres.storageexpanded.StorageExpanded;
import net.dertres.storageexpanded.block.ModBlocks;
import net.dertres.storageexpanded.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, StorageExpanded.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COPPERKEY.get());
        basicItem(ModItems.GOLDKEY.get());
        basicItem(ModItems.IRONKEY.get());

        basicItem(ModItems.COPPERNUGGET.get());

        basicItem(ModBlocks.LOCKABLE_OAK_DOOR.asItem());
    }
}
