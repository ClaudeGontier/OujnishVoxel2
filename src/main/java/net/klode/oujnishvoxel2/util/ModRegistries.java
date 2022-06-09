package net.klode.oujnishvoxel2.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.klode.oujnishvoxel2.entity.ModEntities;
import net.klode.oujnishvoxel2.entity.custom.OujnishEntity;

public class ModRegistries {

    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.OUJNISH, OujnishEntity.setAttributes());
    }

}
