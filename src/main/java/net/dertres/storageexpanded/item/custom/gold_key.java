package net.dertres.storageexpanded.item.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Properties;

//item constructor
public class gold_key extends Item {
    public gold_key(Properties properties) {
        super(properties);
    }

    private void ensureKeyId(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        if (!tag.hasUUID("KeyID")) {
            tag.putUUID("KeyID", UUID.randomUUID());
        }
    }

    @Override
    public InteractionResult useOn(UseOnContext context){
        Level level = context.getLevel();
        Block clickedblock = level.getBlockState(context.getClickedPos()).getBlock();

        return super.useOn(context);
    }

    @Override
    public void onCraftedBy(ItemStack stack, Level world, Player player) {
        ensureKeyId(stack);
        super.onCraftedBy(stack, world, player);
    }

    public static UUID getKeyId(ItemStack stack) {
        CompoundTag tag = stack.getTag();
        return (tag != null && tag.hasUUID("KeyID")) ? tag.getUUID("KeyID") : null;
    }
}
