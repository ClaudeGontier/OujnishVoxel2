package net.klode.oujnishvoxel2.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.klode.oujnishvoxel2.OujnishVoxel2;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MAIN = FabricItemGroupBuilder.build(new Identifier(OujnishVoxel2.MOD_ID, "main"),
            () -> new ItemStack(ModItems.DAFT_PUNK_MUSIC_DISK));
}
