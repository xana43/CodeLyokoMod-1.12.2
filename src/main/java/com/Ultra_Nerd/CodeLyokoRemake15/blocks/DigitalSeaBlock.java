package com.Ultra_Nerd.CodeLyokoRemake15.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.function.Supplier;


public class DigitalSeaBlock extends FlowingFluidBlock {

	
	public DigitalSeaBlock(Supplier<? extends FlowingFluid> supplier) {
		super(supplier, Block.Properties.create(Material.WATER).doesNotBlockMovement().noDrops()
				.notSolid()
				.hardnessAndResistance(100)
				.variableOpacity()
		);
	   		
	}
	
	
	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
		// TODO Auto-generated method stub
		
			entityIn.attackEntityFrom(DamageSource.GENERIC, Byte.MAX_VALUE);
		
	}

	@Override
	public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return false;
	}

	@Override
	public boolean isTransparent(BlockState state) {
		return true;
	}


}
