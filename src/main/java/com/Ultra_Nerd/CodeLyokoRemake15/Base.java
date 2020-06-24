package com.Ultra_Nerd.CodeLyokoRemake15;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Ultra_Nerd.CodeLyokoRemake15.Util.handlers.registry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("cm")
public class Base
{
	private static final Logger Log = LogManager.getLogger();
	
	public static final String MOD_ID = "cm";
	
	public Base()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::dostuff);
		registry.init();
		MinecraftForge.EVENT_BUS.register(this);
		
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		
	}
	
	private void dostuff(final FMLClientSetupEvent event)
	{
		
	}
	public static final ItemGroup Lyoko = new ItemGroup("Lyoko") {
		
		@Override
		public ItemStack createIcon() {
			// TODO Auto-generated method stub
			return new ItemStack(registry.BIT.get());
		}
	};
	
}