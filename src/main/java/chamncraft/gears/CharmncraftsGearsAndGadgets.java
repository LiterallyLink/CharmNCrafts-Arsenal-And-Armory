package chamncraft.gears;

import chamncraft.gears.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharmncraftsGearsAndGadgets implements ModInitializer {
	public static final String MOD_ID = "charmncrafts-gears-and-gadgets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("CharmNCrafts Gears and Gadgets initialized!");
	}
}
