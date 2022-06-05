package net.klode.oujnishmod2.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.klode.oujnishmod2.OujnishMod2;
import net.klode.oujnishmod2.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item OUJNISH_SPAWN_EGG = registerItem("oujnish_spawn_egg",
            new SpawnEggItem(ModEntities.OUJNISH,0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OujnishMod2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + OujnishMod2.MOD_ID);
    }
}
