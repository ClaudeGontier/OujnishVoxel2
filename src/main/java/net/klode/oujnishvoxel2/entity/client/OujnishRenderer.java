package net.klode.oujnishvoxel2.entity.client;

import net.klode.oujnishvoxel2.OujnishVoxel2;
import net.klode.oujnishvoxel2.entity.custom.OujnishEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OujnishRenderer extends GeoEntityRenderer<OujnishEntity> {
    public OujnishRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new OujnishModel());
    }

    @Override
    public Identifier getTextureResource(OujnishEntity entity) {
        return new Identifier(OujnishVoxel2.MOD_ID, "textures/entity/oujnish/oujnish.png");
    }
}
