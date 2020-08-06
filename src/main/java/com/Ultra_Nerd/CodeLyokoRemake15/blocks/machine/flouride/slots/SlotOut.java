package com.Ultra_Nerd.CodeLyokoRemake15.blocks.machine.flouride.slots;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class SlotOut extends Slot {

	private final PlayerEntity player;
	private int rc;
	public SlotOut(PlayerEntity player, IInventory inventory, int index, int x, int y)
	{
		super(inventory, index, x, y);
		this.player = player;
	}
	
	
	@Override
	public boolean isItemValid(@Nonnull ItemStack stack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Nonnull
	@Override
	public ItemStack onTake(@Nonnull PlayerEntity thePlayer, @Nonnull ItemStack stack) {
		// TODO Auto-generated method stub
		this.onCrafting(stack);
		super.onTake(thePlayer, stack);
		return stack;
	}

	@Nonnull
	@Override
	public ItemStack decrStackSize(int amount) {
		// TODO Auto-generated method stub
		if(this.getHasStack()) this.rc += Math.min(amount, this.getStack().getCount());
		return super.decrStackSize(amount);
	}
}
