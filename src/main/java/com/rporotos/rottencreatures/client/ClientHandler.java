package com.rporotos.rottencreatures.client;

import com.rporotos.rottencreatures.client.render.entity.RenderFrostBitten;
import com.rporotos.rottencreatures.server.entity.EntityHandler;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ClientHandler {

    public static void setup() {
        RenderingRegistry.registerEntityRenderingHandler(EntityHandler.FROSTBITTEN, RenderFrostBitten::new);
    }
}
