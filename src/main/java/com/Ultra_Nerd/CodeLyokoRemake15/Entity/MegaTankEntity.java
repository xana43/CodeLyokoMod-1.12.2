package com.Ultra_Nerd.CodeLyokoRemake15.Entity;

import com.Ultra_Nerd.CodeLyokoRemake15.init.ModEntities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

import javax.annotation.Nonnull;

public class MegaTankEntity extends SkeletonEntity implements IAnimatedEntity {

    private final EntityAnimationManager TankManager = new EntityAnimationManager();
    private final EntityAnimationController Tankcontroller = new EntityAnimationController(this, "movecontroller", 20, this::animationPred);
    public MegaTankEntity(EntityType<MegaTankEntity> type, World world) {
        super(type, world);
        TankManager.addAnimationController(Tankcontroller);
    }
    public MegaTankEntity(World world) {
        super(ModEntities.MEGATANK.get(), world);


    }

    @Override
    public boolean isAggressive() {
        return true;
    }

    @Override
    protected boolean canBeRidden(@Nonnull Entity entityIn) {
        return false;
    }


    @Override
    public boolean canSpawn(@Nonnull IWorld worldIn, @Nonnull SpawnReason spawnReasonIn) {
        return true;
    }
    @Nonnull
    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public boolean canBeHitWithPotion() {
        return false;
    }
    

    @Override
    protected void registerAttributes() {
        // TODO Auto-generated method stub
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(10D);
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10D);
        this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10D);
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20D);
    }

    @Override
    protected boolean isInDaylight() {
        return false;
    }

    private <E extends HornetEntity> boolean animationPred(AnimationTestEvent<E> event) {

        if (event.isWalking()) {
            Tankcontroller.setAnimation(new AnimationBuilder().addAnimation("animation.MegaTank.move", true));
            return true;
        } else {
            Tankcontroller.setAnimation(new AnimationBuilder().addAnimation("animation.MegaTank.idle", true));
            return true;
        }
    }
    @Override
    public EntityAnimationManager getAnimationManager() {
        return TankManager;
    }




}