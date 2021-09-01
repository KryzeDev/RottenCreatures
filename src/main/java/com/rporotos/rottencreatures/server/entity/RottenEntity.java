package com.rporotos.rottencreatures.server.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public abstract class RottenEntity extends MonsterEntity {

    public RottenEntity(EntityType<? extends RottenEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
