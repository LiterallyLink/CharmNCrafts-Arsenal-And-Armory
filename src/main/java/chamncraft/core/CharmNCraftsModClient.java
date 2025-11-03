package chamncraft.core;

import net.fabricmc.api.ClientModInitializer;

/**
 * CharmNCrafts - Client Initializer
 */
public class CharmNCraftsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CharmNCraftsMod.LOGGER.info("Initializing {} Client...", CharmNCraftsMod.MOD_NAME);
        // Client-side initialization here
    }
}
