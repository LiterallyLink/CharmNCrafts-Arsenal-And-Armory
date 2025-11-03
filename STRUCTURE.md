# CharmNCrafts Project Structure

## Directory Layout

```
CharmNCrafts-Arsenal-And-Armory/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── chamncraft/
│   │   │       ├── core/                    # Core mod system
│   │   │       │   ├── CharmNCraftsMod.java      # Main entry point
│   │   │       │   ├── IModule.java              # Module interface
│   │   │       │   └── ModuleLoader.java         # Module loader
│   │   │       └── modules/                 # Feature modules
│   │   │           ├── arsenal/             # Arsenal & Armory module
│   │   │           │   ├── ArsenalModule.java
│   │   │           │   └── items/
│   │   │           │       ├── ArsenalItems.java
│   │   │           │       ├── materials/
│   │   │           │       │   └── BedrockToolMaterial.java
│   │   │           │       └── custom/
│   │   │           │           ├── CustomBedrockAxeItem.java
│   │   │           │           ├── CustomBedrockHoeItem.java
│   │   │           │           └── CustomBedrockPickaxeItem.java
│   │   │           └── gearsgadgets/        # Gears & Gadgets module
│   │   │               ├── GearsGadgetsModule.java
│   │   │               └── items/
│   │   │                   └── GearsGadgetsItems.java
│   │   └── resources/
│   │       ├── fabric.mod.json              # Mod metadata
│   │       ├── assets/
│   │       │   └── charmncrafts-gears-and-gadgets/
│   │       │       ├── lang/
│   │       │       │   └── en_us.json
│   │       │       ├── models/
│   │       │       │   └── item/
│   │       │       └── textures/
│   │       │           └── item/
│   │       └── data/
│   │           └── charmncrafts-gears-and-gadgets/
│   │               └── recipes/
│   └── client/
│       ├── java/
│       │   └── chamncraft/
│       │       └── core/
│       │           ├── CharmNCraftsModClient.java
│       │           └── CharmNCraftsModDataGenerator.java
│       └── resources/
│           └── charmncrafts-gears-and-gadgets.client.mixins.json
├── gradle/
├── build.gradle                             # Build configuration
├── gradle.properties                        # Gradle properties
├── settings.gradle                          # Gradle settings
├── LICENSE
├── MODULE_GUIDE.md                          # Module creation guide
└── STRUCTURE.md                             # This file
```

## Module Structure Template

When creating a new module, follow this structure:

```
modules/
└── yourmodule/
    ├── YourModule.java                      # Module entry point (implements IModule)
    ├── items/                               # Item definitions
    │   ├── YourModuleItems.java            # Item registry
    │   ├── materials/                       # Tool/armor materials
    │   │   └── CustomMaterial.java
    │   └── custom/                          # Custom item classes
    │       └── CustomItem.java
    ├── blocks/                              # Block definitions
    │   ├── YourModuleBlocks.java           # Block registry
    │   └── custom/                          # Custom block classes
    │       └── CustomBlock.java
    ├── entities/                            # Entity definitions
    │   ├── YourModuleEntities.java         # Entity registry
    │   └── custom/                          # Custom entity classes
    │       └── CustomEntity.java
    ├── blockentities/                       # Block entity definitions
    │   └── CustomBlockEntity.java
    └── util/                                # Module-specific utilities
        └── Helper.java
```

## Core Components

### CharmNCraftsMod.java
- Main mod entry point
- Defines MOD_ID and MOD_NAME constants
- Initializes the module system via ModuleLoader

### IModule.java
- Interface that all modules must implement
- Defines module contract: ID, name, initialization, priority

### ModuleLoader.java
- Manages module registration and initialization
- Loads modules in priority order
- Handles module lifecycle

## Module Components

### Module Entry Point (e.g., ArsenalModule.java)
- Implements IModule interface
- Coordinates module initialization
- Sets module priority

### Registry Classes (e.g., ArsenalItems.java)
- Registers items/blocks/entities
- Adds content to creative tabs
- Centralizes module content

### Custom Classes
- Extend Minecraft base classes
- Implement custom behavior
- Organized in `custom/` subdirectories

### Materials
- Define tool/armor tiers
- Stored in `materials/` subdirectories

## Resource Organization

### Assets (Client-side)
```
assets/charmncrafts-gears-and-gadgets/
├── lang/                    # Translations
│   └── en_us.json
├── models/                  # Item/block models
│   ├── item/
│   └── block/
├── textures/               # Textures
│   ├── item/
│   ├── block/
│   └── entity/
└── sounds/                 # Sound definitions
```

### Data (Server-side)
```
data/charmncrafts-gears-and-gadgets/
├── recipes/                # Crafting recipes
├── loot_tables/           # Loot tables
├── advancements/          # Advancements
└── tags/                  # Tags
    ├── items/
    └── blocks/
```

## Key Files

### fabric.mod.json
- Mod metadata and configuration
- Entry points for main, client, and datagen
- Dependencies and version requirements

### build.gradle
- Build configuration
- Dependencies
- Mod source sets

### gradle.properties
- Version numbers
- Minecraft/Fabric/Yarn versions
- Mod metadata

## Development Workflow

### Adding New Content

1. **Choose a Module** - Decide which module the content belongs to
2. **Create Classes** - Add custom classes if needed
3. **Register Content** - Add to module's registry class
4. **Add Resources** - Create models, textures, recipes
5. **Test** - Run client and verify functionality

### Creating New Module

1. **Create Package** - `chamncraft.modules.yourmodule`
2. **Implement Module** - Create module class
3. **Create Registries** - Items, blocks, etc.
4. **Register Module** - Add to ModuleLoader
5. **Add Resources** - Textures, models, lang files

### Building

```bash
# Clean build
./gradlew clean build

# Run client (test in-game)
./gradlew runClient

# Run server
./gradlew runServer

# Generate sources (for IDE)
./gradlew genSources
```

## Package Naming Conventions

- `core` - Core mod infrastructure
- `modules` - Feature modules
- `modules.modulename` - Specific module
- `modules.modulename.items` - Item definitions
- `modules.modulename.blocks` - Block definitions
- `modules.modulename.entities` - Entity definitions
- `modules.modulename.util` - Module utilities

## Migration Notes

### From Old Structure

Old structure had items scattered in `chamncraft.arsenal`. New structure:
- Moved to `chamncraft.modules.arsenal`
- Better organization by feature type
- Cleaner separation of concerns

### Benefits

- **Modularity** - Easy to add/remove features
- **Organization** - Clear structure for large mods
- **Maintainability** - Self-contained modules
- **Scalability** - Simple to merge multiple mods
- **Clarity** - Obvious where to add new content
