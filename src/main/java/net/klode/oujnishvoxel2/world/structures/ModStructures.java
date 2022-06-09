package net.klode.oujnishvoxel2.world.structures;

import com.mojang.serialization.Codec;
import net.klode.oujnishvoxel2.OujnishVoxel2;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

public class ModStructures {

    public static StructureType<?> TEUB;

    public static void registerStructureFeatures() {
        TEUB = register(new Identifier(OujnishVoxel2.MOD_ID, "teub"), Teub.CODEC);
    }

    private static <S extends Structure> StructureType<S> register(Identifier id, Codec<S> codec) {
        return Registry.register(Registry.STRUCTURE_TYPE, id, () -> codec);
    }
}
