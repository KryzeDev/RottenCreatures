package com.rporotos.rottencreatures.server.entity;

import com.rporotos.rottencreatures.RottenCreatures;
import com.rporotos.rottencreatures.server.entity.frostbitten.EntityFrostBitten;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityHandler {

    public static EntityType<EntityFrostBitten> FROSTBITTEN;

    public static void register() {
        FROSTBITTEN = register("frostbitten", EntityType.Builder.create(EntityFrostBitten::new, EntityClassification.CREATURE).size(1.4f, 3.4f));

        ForgeRegistries.ENTITIES.registerAll(
                FROSTBITTEN
        );
    }

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        ResourceLocation regName = new ResourceLocation(RottenCreatures.MOD_ID,name );
        return (EntityType<T>) builder.build(name).setRegistryName(regName);
    }

    public static void initializeAttributes() {
        GlobalEntityTypeAttributes.put(FROSTBITTEN, EntityFrostBitten.createAttributes().create());
    }
}
