package com.rporotos.rottencreatures.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.rporotos.rottencreatures.client.model.entity.ModelFrostBitten;
import com.rporotos.rottencreatures.server.entity.frostbitten.EntityFrostBitten;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RenderFrostBitten extends GeoEntityRenderer<EntityFrostBitten>{

    public RenderFrostBitten(EntityRendererManager renderManager) {
        super(renderManager, new ModelFrostBitten());
    }

    @Override
    public ResourceLocation getEntityTexture(EntityFrostBitten entity) {
        return this.getGeoModelProvider().getTextureLocation(entity);
    }

    @Override
    public RenderType getRenderType(EntityFrostBitten animatable, float partialTicks, MatrixStack stack,
                                    IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return RenderType.getEntityTranslucent(getTextureLocation(animatable));
    }
}
