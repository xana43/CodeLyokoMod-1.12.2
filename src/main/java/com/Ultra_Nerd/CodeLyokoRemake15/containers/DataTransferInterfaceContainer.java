package com.Ultra_Nerd.CodeLyokoRemake15.containers;

import com.Ultra_Nerd.CodeLyokoRemake15.init.ModBlocks;
import com.Ultra_Nerd.CodeLyokoRemake15.init.ModContainerTypes;
import com.Ultra_Nerd.CodeLyokoRemake15.tileentity.TowerInterfaceTileEntity;
import com.Ultra_Nerd.CodeLyokoRemake15.tileentity.test.DataTransferInterfaceTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

import javax.annotation.Nonnull;
import java.util.Objects;

public class DataTransferInterfaceContainer extends Container {
    private final DataTransferInterfaceTileEntity dataTransferInterfaceTileEntity;
    private final IWorldPosCallable canInteractWithCallable;

    public DataTransferInterfaceContainer(final int windowid, final PlayerInventory PInventory, final DataTransferInterfaceTileEntity dataTransferInterfaceTileEntity){
        super(ModContainerTypes.DATA_TRANSFER_INTERFACE_CONTAINER.get(), windowid);
        this.dataTransferInterfaceTileEntity = dataTransferInterfaceTileEntity;
        this.canInteractWithCallable = IWorldPosCallable.of(dataTransferInterfaceTileEntity.getWorld(), dataTransferInterfaceTileEntity.getPos());
    }

    public DataTransferInterfaceContainer(final int windowid, final PlayerInventory inven, final PacketBuffer data) {
        this(windowid, inven, getBlockTE(inven, data));
    }

    private static DataTransferInterfaceTileEntity getBlockTE(final PlayerInventory inventory, final PacketBuffer data) {
        Objects.requireNonNull(inventory, "player inventory can't be null");
        Objects.requireNonNull(data, "data can't be null");
        final TileEntity tileAtPos = inventory.player.world.getTileEntity(data.readBlockPos());
        if (tileAtPos instanceof DataTransferInterfaceTileEntity) {
            return (DataTransferInterfaceTileEntity) tileAtPos;
        } else {
            throw new IllegalStateException("TileEntity isn't correct" + tileAtPos);
        }
    }

    @Override
    public boolean canInteractWith(@Nonnull PlayerEntity playerIn) {
        return isWithinUsableDistance(canInteractWithCallable, playerIn, ModBlocks.DATA_TRANSFER_INTERFACE.get());
    }
}