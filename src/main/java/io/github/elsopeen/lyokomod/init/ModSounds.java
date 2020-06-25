package io.github.elsopeen.lyokomod.init;



import io.github.elsopeen.lyokomod.LyokoMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
	public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, LyokoMod.MOD_ID);
	//for objects that load last
	 public static final Lazy<SoundEvent> LAZY_THEME = Lazy.of(() -> new SoundEvent(new ResourceLocation(LyokoMod.MOD_ID,"lyoko")));
	 //for sound events
	 public static final RegistryObject<SoundEvent> BLOKAMBIENT = SOUNDS.register("entity.blok.ambient", () -> new SoundEvent(new ResourceLocation(LyokoMod.MOD_ID,"entity.blok.ambient")));
	 public static final RegistryObject<SoundEvent> BLOKHURT = SOUNDS.register("entity.blok.hurt", () -> new SoundEvent(new ResourceLocation(LyokoMod.MOD_ID,"entity.blok.hurt")));
	 public static final RegistryObject<SoundEvent> THEME = SOUNDS.register("lyoko", LAZY_THEME);
    public static final RegistryObject<SoundEvent> LASERARROW = SOUNDS.register("laser", () -> new SoundEvent(new ResourceLocation(LyokoMod.MOD_ID,"laser")));
    public static final RegistryObject<SoundEvent> FOREST = SOUNDS.register("forestsector", () -> new SoundEvent(new ResourceLocation(LyokoMod.MOD_ID,"forestsector")));
    public static final RegistryObject<SoundEvent> ICE = SOUNDS.register("icesector", () -> new SoundEvent(new ResourceLocation(LyokoMod.MOD_ID,"icesector")));
	
}
