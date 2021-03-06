package com.Ultra_Nerd.CodeLyokoRemake.commands;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class tele extends Teleporter
{

	private final WorldServer world;
	private double x,y,z;
	
	public tele(WorldServer world, double x, double y, double z)
	{
		super(world);
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
 public void placeInPortal(Entity entityin, float rotationYaw)
	{
	this.world.getBlockState(new BlockPos((int)this.x, (int) this.y, (int) this.z));
	entityin.setPosition(x, y, y);
	entityin.motionX = 0f;
	entityin.motionY = 0f;
	entityin.motionZ = 0f;
	}
	public static void teleportToDim(EntityPlayer player, int dim, double x, double y, double z)
	{
		int oldDimension = player.getEntityWorld().provider.getDimension();
		EntityPlayerMP entityplayermp = (EntityPlayerMP) player;
		MinecraftServer server = player.getEntityWorld().getMinecraftServer();
		WorldServer worldServer = server.getWorld(dim);
		
		if (worldServer == null || server == null) throw new IllegalArgumentException("Dimension:" + dim + "doesn't exist");
		worldServer.getMinecraftServer().getPlayerList().transferPlayerToDimension(entityplayermp, dim, new tele(worldServer, x, y + 5, z));
		player.setPositionAndUpdate(x, y + 5, z);
		
	}
}
