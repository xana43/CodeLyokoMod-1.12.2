package com.Ultra_Nerd.CodeLyokoRemake15.blocks;

import java.util.function.Supplier;

import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;

public class CoolantBlock extends FlowingFluidBlock{

	public CoolantBlock(Supplier<? extends FlowingFluid> supplier, Properties proper) {
		super(supplier,proper);
		
		
		//Modblocks.BLOCKS.add(this);
		//ModItems.Items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	
	
	
	
	
}