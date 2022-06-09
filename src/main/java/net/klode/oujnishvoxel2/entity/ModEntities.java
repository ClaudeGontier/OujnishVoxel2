package net.klode.oujnishvoxel2.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.klode.oujnishvoxel2.OujnishVoxel2;
import net.klode.oujnishvoxel2.entity.custom.OujnishEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<OujnishEntity> OUJNISH = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(OujnishVoxel2.MOD_ID, "oujnish"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, OujnishEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.3f)).build());
}
