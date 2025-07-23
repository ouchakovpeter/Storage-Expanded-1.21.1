package net.dertres.storageexpanded.datagen;

import net.dertres.storageexpanded.StorageExpanded;
import net.dertres.storageexpanded.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, StorageExpanded.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        doorBlockWithRenderType(ModBlocks.LOCKABLE_OAK_DOOR.get(), modLoc("block/lockable_oak_door_bottom"), modLoc("block/lockable_oak_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.LOCKABLE_OAK_TRAPDOOR.get(), modLoc("block/lockable_oak_trapdoor"), true, "cutout");

        blockItem(ModBlocks.LOCKABLE_OAK_TRAPDOOR, "_bottom");

    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("tutorialmod:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
