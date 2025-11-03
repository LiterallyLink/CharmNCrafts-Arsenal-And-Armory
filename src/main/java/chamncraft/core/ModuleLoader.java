package chamncraft.core;

import chamncraft.modules.bedrocktools.BedrockToolsModule;
import chamncraft.modules.gearsgadgets.GearsGadgetsModule;
import chamncraft.modules.justhammers.JustHammersModule;
import chamncraft.modules.smithingtemplates.SmithingTemplateExpansionModule;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ModuleLoader - Manages initialization of all CharmNCrafts modules.
 * Add new modules to the registerModules() method.
 */
public class ModuleLoader {
    private static final List<IModule> modules = new ArrayList<>();
    private static boolean initialized = false;

    /**
     * Register all modules here.
     * Add new modules to this list as you create them.
     */
    private static void registerModules() {
        // Register modules in order
        modules.add(new BedrockToolsModule());
        modules.add(new JustHammersModule());
        modules.add(new SmithingTemplateExpansionModule());
        modules.add(new GearsGadgetsModule());
    }

    /**
     * Initialize all registered modules.
     * Called from the main mod initializer.
     */
    public static void initializeModules() {
        if (initialized) {
            CharmNCraftsMod.LOGGER.warn("Modules already initialized!");
            return;
        }

        CharmNCraftsMod.LOGGER.info("Loading modules...");

        // Register all modules
        registerModules();

        // Sort modules by priority
        modules.sort(Comparator.comparingInt(IModule::getPriority));

        // Initialize each module
        for (IModule module : modules) {
            try {
                CharmNCraftsMod.LOGGER.info("Loading module: {} ({})",
                    module.getModuleName(), module.getModuleId());
                module.initialize();
                CharmNCraftsMod.LOGGER.info("Module loaded: {}", module.getModuleName());
            } catch (Exception e) {
                CharmNCraftsMod.LOGGER.error("Failed to load module: {}",
                    module.getModuleName(), e);
            }
        }

        initialized = true;
        CharmNCraftsMod.LOGGER.info("All modules loaded successfully!");
    }

    /**
     * Get all registered modules.
     * @return list of modules
     */
    public static List<IModule> getModules() {
        return new ArrayList<>(modules);
    }
}
