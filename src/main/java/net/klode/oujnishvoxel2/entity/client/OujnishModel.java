package net.klode.oujnishvoxel2.entity.client;

import net.klode.oujnishvoxel2.OujnishVoxel2;
import net.klode.oujnishvoxel2.entity.custom.OujnishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OujnishModel extends AnimatedGeoModel<OujnishEntity> {

    @Override
    public Identifier getModelResource(OujnishEntity entity) {
        return new Identifier(OujnishVoxel2.MOD_ID, "geo/oujnish.geo.json");
    }

    @Override
    public Identifier getTextureResource(OujnishEntity entity) {
        return new Identifier(OujnishVoxel2.MOD_ID, "textures/entity/oujnish/oujnish.png");
    }

    @Override
    public Identifier getAnimationResource(OujnishEntity animatable) {
        return new Identifier(OujnishVoxel2.MOD_ID, "animations/oujnish.animation.json");
    }
}
