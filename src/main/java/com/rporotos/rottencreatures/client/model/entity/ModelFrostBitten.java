package com.rporotos.rottencreatures.client.model.entity;

import com.rporotos.rottencreatures.RottenCreatures;
import com.rporotos.rottencreatures.server.entity.frostbitten.EntityFrostBitten;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ModelFrostBitten extends AnimatedGeoModel<EntityFrostBitten> {

    @Override
    public ResourceLocation getModelLocation(EntityFrostBitten object) {
        return new ResourceLocation(RottenCreatures.MOD_ID, "geo/frostbitten.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EntityFrostBitten object) {
        return new ResourceLocation(RottenCreatures.MOD_ID, "textures/entity/frostbitten.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EntityFrostBitten animatable) {
        return null;
    }
}
