package net.klode.oujnishmod2.entity.client;

import net.klode.oujnishmod2.OujnishMod2;
import net.klode.oujnishmod2.entity.custom.OujnishEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OujnishModel extends AnimatedGeoModel<OujnishEntity> {
    @Override
    public Identifier getModelLocation(OujnishEntity object) {
        return new Identifier(OujnishMod2.MOD_ID, "geo/oujnish.geo.json");
    }

    @Override
    public Identifier getTextureLocation(OujnishEntity object) {
        return new Identifier(OujnishMod2.MOD_ID, "textures/entity/oujnish/oujnish.png");
    }

    @Override
    public Identifier getAnimationFileLocation(OujnishEntity animatable) {
        return new Identifier(OujnishMod2.MOD_ID, "animations/oujnish.animation.json");
    }
}
