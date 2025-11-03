package chamncraft.core;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * CharmNCrafts - Data Generator
 */
public class CharmNCraftsModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        CharmNCraftsMod.LOGGER.info("Initializing {} Data Generator...", CharmNCraftsMod.MOD_NAME);
        // Data generation here
    }
}
