package net.dertres.storageexpanded.datagen;

import net.dertres.storageexpanded.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.LOCKABLE_OAK_TRAPDOOR.get());

        add(ModBlocks.LOCKABLE_OAK_DOOR.get(),
                block -> createDoorTable(ModBlocks.LOCKABLE_OAK_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator; //taking registries of blocks and putting it into a list where the loot table provider can use it
    }
}
