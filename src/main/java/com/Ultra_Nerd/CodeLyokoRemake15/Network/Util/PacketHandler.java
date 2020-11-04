package com.Ultra_Nerd.CodeLyokoRemake15.Network.Util;

import com.Ultra_Nerd.CodeLyokoRemake15.Base;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkInstance;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class PacketHandler {
    private static final String NET_VERSION = "1";
    private static int nextId = 0;
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(Base.MOD_ID, "network"),
            () -> NET_VERSION,
            NET_VERSION::equals,
            NET_VERSION::equals
    );

    public static void init() {
        DataTransferInterfaceMessage message = new DataTransferInterfaceMessage();
        INSTANCE.registerMessage(nextId++,DataTransferInterfaceMessage.class, message::encode, message::decode, message::handle);
    }


}
