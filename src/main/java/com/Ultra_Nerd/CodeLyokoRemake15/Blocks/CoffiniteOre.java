package com.Ultra_Nerd.CodeLyokoRemake15.Blocks;

import java.util.Random;

import com.Ultra_Nerd.CodeLyokoRemake15.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class CoffiniteOre extends Block {
	
	public CoffiniteOre()
	{
super(Block.Properties.create(Material.ROCK)
				
				.hardnessAndResistance(6, 10)
				.sound(SoundType.STONE)
				.lightValue(1)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE)
			);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.URANIUM_SILACATE; 
			   
		
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 3;
		int min = 0;
		return rand.nextInt(max) + min;
	}
}