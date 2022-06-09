package net.klode.oujnishvoxel2;

import net.fabricmc.api.ModInitializer;
import net.klode.oujnishvoxel2.item.ModItems;
import net.klode.oujnishvoxel2.util.ModRegistries;
import net.klode.oujnishvoxel2.world.structures.ModStructures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class OujnishVoxel2 implements ModInitializer {
	public static final String MOD_ID = "oujnishvoxel2";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		GeckoLib.initialize();

		ModItems.registerModItems();

		ModRegistries.registerModStuffs();

		ModStructures.registerStructureFeatures();

	}
}
