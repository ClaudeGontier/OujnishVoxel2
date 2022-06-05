package net.klode.oujnishmod2;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.klode.oujnishmod2.entity.ModEntities;
import net.klode.oujnishmod2.entity.client.OujnishRenderer;

public class OujnishMod2Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.OUJNISH, OujnishRenderer::new);
    }
}
