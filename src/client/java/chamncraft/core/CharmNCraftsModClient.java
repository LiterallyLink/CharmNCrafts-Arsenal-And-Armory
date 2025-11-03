package chamncraft.core;

import net.fabricmc.api.ClientModInitializer;

/**
 * CharmNCrafts Client Initializer
 * Handles client-side setup such as rendering and resources.
 */
public class CharmNCraftsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CharmNCraftsMod.LOGGER.info("Initializing {} client...", CharmNCraftsMod.MOD_NAME);

        // Client-side initialization
        // Register renderers, particle effects, etc. here

        CharmNCraftsMod.LOGGER.info("{} client initialized!", CharmNCraftsMod.MOD_NAME);
    }
}
