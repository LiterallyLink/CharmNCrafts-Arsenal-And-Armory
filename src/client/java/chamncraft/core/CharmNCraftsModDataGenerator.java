package chamncraft.core;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

/**
 * CharmNCrafts Data Generator
 * Generates JSON files for recipes, loot tables, etc.
 */
public class CharmNCraftsModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        CharmNCraftsMod.LOGGER.info("Running data generation for {}", CharmNCraftsMod.MOD_NAME);

        // Register data generators here
        // FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        // pack.addProvider(MyRecipeProvider::new);

        CharmNCraftsMod.LOGGER.info("Data generation complete for {}", CharmNCraftsMod.MOD_NAME);
    }
}
