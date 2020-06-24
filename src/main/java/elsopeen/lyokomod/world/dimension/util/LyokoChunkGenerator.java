package elsopeen.lyokomod.world.dimension.util;

import net.minecraft.world.IWorld;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.NoiseChunkGenerator;

import javax.annotation.Nonnull;

public class LyokoChunkGenerator extends NoiseChunkGenerator<LyokoGenSettings> {

    public LyokoChunkGenerator(IWorld worldIn, BiomeProvider provider, LyokoGenSettings settingsIn) {
        super(worldIn, provider, 8, 4, 64, settingsIn, true);
        this.randomSeed.skip(2620);
    }

    @Override
    protected void fillNoiseColumn(@Nonnull double[] noiseColumn, int noiseX, int noiseZ) {
        double d0 = 1368.824D;
        double d1 = 684.412D;
        double d2 = 17.110300000000002D;
        double d3 = 4.277575000000001D;
        int i = 64;
        int j = -200;
        this.calcNoiseColumn(noiseColumn, noiseX, noiseZ,
                1368.824D, 684.412D,
                17.110300000000002D, 4.277575000000001D,
                64, -200);
    }

    @Nonnull
    @Override
    protected double[] getBiomeNoiseColumn(int noiseX, int noiseZ) {
        return new double[]{(double)this.biomeProvider.func_222365_c(noiseX, noiseZ), 0.0D};
    }

    @Override
    protected double func_222545_a(double p_222545_1_, double p_222545_3_, int p_222545_5_) {
        return 8.0D - p_222545_1_;
    }
    @Override
    protected double func_222551_g() {
        return ((int)super.func_222551_g() / 2.0);
    }

    @Override
    protected double func_222553_h() {
        return 8.0D;
    }

    @Override
    public int getGroundHeight() {
        return 80;
    }

    @Override
    public int getSeaLevel() {
        return 10;
    }
}