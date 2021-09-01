package com.rporotos.rottencreatures.server.entity.frostbitten;

import com.rporotos.rottencreatures.server.entity.RottenEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

/**
 * Created by KryzeDev on 31/8/2021.
 */

public class EntityFrostBitten extends RottenEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public EntityFrostBitten(EntityType<? extends RottenEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
//      this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 0.6F));
    }

    public static AttributeModifierMap.MutableAttribute createAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 4.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.9D);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<>(this, "controller", 2, this::predicate));
    }

    private <T extends IAnimatable> PlayState predicate(AnimationEvent<T> event) {
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}

