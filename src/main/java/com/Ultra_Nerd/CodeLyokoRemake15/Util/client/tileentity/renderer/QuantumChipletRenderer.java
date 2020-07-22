package com.Ultra_Nerd.CodeLyokoRemake15.Util.client.tileentity.renderer;

import com.Ultra_Nerd.CodeLyokoRemake15.init.ModItems;
import com.Ultra_Nerd.CodeLyokoRemake15.tileentity.QuantumChipletTileEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class QuantumChipletRenderer extends TileEntityRenderer<QuantumChipletTileEntity> {

    private float degrees;


    public QuantumChipletRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
        degrees = 0;

    }

    @Override
    public void render(QuantumChipletTileEntity tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {

        NonNullList<ItemStack> items = tileEntityIn.getItems();

        for(ItemStack stack : items)
        {
            if(!stack.isEmpty())
            {
                if(stack.getItem() == ModItems.SOLID_QUANTUM.get()) {
                    matrixStackIn.push();
                    matrixStackIn.scale(.5f, .5f, .5f);
                    matrixStackIn.translate(1, 1, 1);
                    matrixStackIn.rotate(Vector3f.YP.rotationDegrees(degrees++ * 16));
                    renderItem(stack, partialTicks, matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn);
                    matrixStackIn.pop();
                }
            }
        }
    }
    private void renderItem(ItemStack stack, float partialTicks, MatrixStack matrix,IRenderTypeBuffer buff,int lightIn, int overlayIn)
    {
        Minecraft.getInstance().getItemRenderer().renderItem(stack, ItemCameraTransforms.TransformType.FIXED,lightIn, OverlayTexture.NO_OVERLAY,matrix,buff);
    }
}