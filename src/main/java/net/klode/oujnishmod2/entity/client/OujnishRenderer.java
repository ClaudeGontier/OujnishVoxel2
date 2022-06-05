package net.klode.oujnishmod2.entity.client;

import net.klode.oujnishmod2.OujnishMod2;
import net.klode.oujnishmod2.entity.custom.OujnishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OujnishRenderer extends GeoEntityRenderer<OujnishEntity> {
    public OujnishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new OujnishModel());
    }

    @Override
    public Identifier getTextureLocation(OujnishEntity entity) {
        return new Identifier(OujnishMod2.MOD_ID, "textures/entity/oujnish/oujnish.png");
    }
}
