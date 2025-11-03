package chamncraft.core;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * CharmNCrafts - Main Mod Entry Point
 * A modular Minecraft mod combining Arsenal, Gears & Gadgets, and more.
 */
public class CharmNCraftsMod implements ModInitializer {
    public static final String MOD_ID = "charmncrafts-gears-and-gadgets";
    public static final String MOD_NAME = "CharmNCrafts";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing {} Mod...", MOD_NAME);

        // Initialize all modules through the module loader
        ModuleLoader.initializeModules();

        LOGGER.info("{} Mod initialized successfully!", MOD_NAME);
    }
}
