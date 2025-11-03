package chamncraft.core;

/**
 * Interface for all CharmNCrafts modules.
 * Each module should implement this interface to be loaded by the ModuleLoader.
 */
public interface IModule {
    /**
     * Gets the unique identifier for this module.
     * @return module ID (e.g., "arsenal", "gearsgadgets")
     */
    String getModuleId();

    /**
     * Gets the display name for this module.
     * @return human-readable module name
     */
    String getModuleName();

    /**
     * Called during mod initialization to set up the module.
     * Register items, blocks, entities, etc. here.
     */
    void initialize();

    /**
     * Gets the loading priority (lower numbers load first).
     * Use this if modules have dependencies on each other.
     * @return priority value (default: 100)
     */
    default int getPriority() {
        return 100;
    }
}
