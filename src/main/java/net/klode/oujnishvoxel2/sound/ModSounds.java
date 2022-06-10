package net.klode.oujnishvoxel2.sound;

import net.klode.oujnishvoxel2.OujnishVoxel2;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent DAFT_PUNK_MUSIC = registerSoundEvent("daft_punk_music");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(OujnishVoxel2.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
