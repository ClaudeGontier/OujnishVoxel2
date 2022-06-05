package net.klode.oujnishmod2;

import net.fabricmc.api.ModInitializer;
import net.klode.oujnishmod2.item.ModItems;
import net.klode.oujnishmod2.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class OujnishMod2 implements ModInitializer {
	public static final String MOD_ID = "oujnishmod2";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		GeckoLib.initialize();

		ModItems.registerModItems();

		ModRegistries.registerModStuffs();

	}
}
