package com.Ultra_Nerd.CodeLyokoRemake15.blocks;

import com.Ultra_Nerd.CodeLyokoRemake15.init.ModBlocks;
import com.Ultra_Nerd.CodeLyokoRemake15.tileentity.HologramProjectorTileEntity;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class HologramProjectorBlock extends ContainerBlock {
	public static BooleanProperty VALID = BooleanProperty.create("valid");

	public HologramProjectorBlock()
	{
	super(Block.Properties.create(Material.IRON)
				
				.hardnessAndResistance(6, 10)
				.sound(SoundType.METAL)
				.lightValue(2)
				.harvestLevel(0)
				.harvestTool(ToolType.PICKAXE)
				
					
					
					
					
			);
		this.setDefaultState(this.getDefaultState().with(VALID,false));

	}


	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		super.fillStateContainer(builder.add(BooleanProperty.create("valid")));
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getBlock().getDefaultState().with(VALID,false);
	}


	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Nullable
	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		// TODO Auto-generated method stub
		return new HologramProjectorTileEntity();
	}
	
	@Override
	public boolean hasTileEntity() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		// TODO Auto-generated method stub
		return true;
	}

	public static void SetModel(boolean act, World worldIn, BlockPos pos)
	{
		 BlockState state = worldIn.getBlockState(pos);
		 TileEntity tileentity = worldIn.getTileEntity(pos);

		 if(act) {
			 worldIn.setBlockState(pos, ModBlocks.HOLOPROJECTOR.get().getDefaultState().with(VALID, true), 3);

		 }
		 else worldIn.setBlockState(pos, ModBlocks.HOLOPROJECTOR.get().getDefaultState().with(VALID, false), 3);



	}





}
