package com.Ultra_Nerd.CodeLyokoRemake.Util.handlers;


import com.Ultra_Nerd.CodeLyokoRemake.Blocks.tileentity.ComputerReactor;
import com.Ultra_Nerd.CodeLyokoRemake.Blocks.tileentity.TileEntityInfusingChamber;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TEH {

		

		public static void regte()
		{
			GameRegistry.registerTileEntity(TileEntityInfusingChamber.class, "flouride_infuser");
			GameRegistry.registerTileEntity(ComputerReactor.class, "reactor");
		}
	
}