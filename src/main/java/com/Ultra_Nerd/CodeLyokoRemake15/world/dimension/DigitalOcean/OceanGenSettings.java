package com.Ultra_Nerd.CodeLyokoRemake15.world.dimension.DigitalOcean;

import com.Ultra_Nerd.CodeLyokoRemake15.init.ModFluids;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationSettings;

public class OceanGenSettings extends GenerationSettings {
    public byte BiomeSize(){
        return 4;
    }

    public byte getBiomID()
    {
        return 112;
    }






    @Override
    public BlockState getDefaultBlock() {
        return ModFluids.DIO.get().getDefaultState();
    }



    @Override
    public BlockState getDefaultFluid() {
        return Blocks.BEDROCK.getDefaultState();
    }
}