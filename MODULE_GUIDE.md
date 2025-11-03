# CharmNCrafts Module System Guide

## Overview

CharmNCrafts uses a modular architecture that makes it easy to organize and merge multiple Minecraft mods into one cohesive package. Each module is self-contained and manages its own content.

## Current Modules

1. **Arsenal & Armory** - Weapons, tools, and combat equipment
2. **Gears & Gadgets** - Utility items and mechanical devices

## Architecture

```
src/main/java/chamncraft/
├── core/                           # Core mod system
│   ├── CharmNCraftsMod.java       # Main mod entry point
│   ├── IModule.java               # Module interface
│   └── ModuleLoader.java          # Module loading system
└── modules/                        # All feature modules
    ├── arsenal/                    # Arsenal & Armory module
    │   ├── ArsenalModule.java     # Module initializer
    │   ├── items/
    │   │   ├── ArsenalItems.java  # Item registry
    │   │   ├── materials/         # Tool/armor materials
    │   │   └── custom/            # Custom item classes
    │   ├── blocks/                # (future) Block definitions
    │   └── entities/              # (future) Entity definitions
    └── gearsgadgets/              # Gears & Gadgets module
        ├── GearsGadgetsModule.java
        └── items/
            └── GearsGadgetsItems.java
```

## Creating a New Module

### Step 1: Create Module Structure

Create a new package under `chamncraft.modules/` with your module name:

```
modules/
└── yourmodule/
    ├── YourModule.java
    └── items/
        └── YourModuleItems.java
```

### Step 2: Implement Module Class

Create your module class implementing `IModule`:

```java
package chamncraft.modules.yourmodule;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.core.IModule;
import chamncraft.modules.yourmodule.items.YourModuleItems;

public class YourModule implements IModule {
    public static final String MODULE_ID = "yourmodule";

    @Override
    public String getModuleId() {
        return MODULE_ID;
    }

    @Override
    public String getModuleName() {
        return "Your Module Name";
    }

    @Override
    public void initialize() {
        CharmNCraftsMod.LOGGER.info("[YourModule] Initializing...");

        // Register creative tabs first
        YourModuleCreativeTabs.register();

        // Register your content
        YourModuleItems.register();

        CharmNCraftsMod.LOGGER.info("[YourModule] Initialized!");
    }

    @Override
    public int getPriority() {
        return 50; // Lower = loads earlier
    }
}
```

### Step 3: Create Items Registry

Create an items registry class:

```java
package chamncraft.modules.yourmodule.items;

import chamncraft.core.CharmNCraftsMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class YourModuleItems {

    // Define your items
    public static final Item YOUR_ITEM = new Item(new Item.Settings());

    public static void register() {
        CharmNCraftsMod.LOGGER.info("[YourModule] Registering items...");

        registerItem("your_item", YOUR_ITEM);

        addToCreativeTabs();
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM,
            new Identifier(CharmNCraftsMod.MOD_ID, name), item);
    }

    private static void addToCreativeTabs() {
        // Add items to creative tabs
    }
}
```

### Step 4: Create Creative Tab

Create a creative tab for your module:

```java
package chamncraft.modules.yourmodule;

import chamncraft.core.CharmNCraftsMod;
import chamncraft.modules.yourmodule.items.YourModuleItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class YourModuleCreativeTabs {

    public static final ItemGroup YOUR_TAB = Registry.register(
        Registries.ITEM_GROUP,
        new Identifier(CharmNCraftsMod.MOD_ID, "yourmodule"),
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.charmncrafts.yourmodule"))
            .icon(() -> new ItemStack(YourModuleItems.YOUR_ITEM))
            .entries((displayContext, entries) -> {
                // Add all your items to the tab
                entries.add(YourModuleItems.YOUR_ITEM);
            })
            .build()
    );

    public static void register() {
        CharmNCraftsMod.LOGGER.info("[YourModule] Registering creative tabs...");
    }
}
```

Then add the translation to `src/main/resources/assets/charmncrafts-gears-and-gadgets/lang/en_us.json`:

```json
{
  "itemGroup.charmncrafts.yourmodule": "Your Module Name"
}
```

### Step 5: Register Module

Add your module to `ModuleLoader.java`:

```java
private static void registerModules() {
    modules.add(new ArsenalModule());
    modules.add(new GearsGadgetsModule());
    modules.add(new YourModule()); // Add your module here
}
```

## Merging Existing Mods

When merging an existing mod into CharmNCrafts:

### 1. Analyze the Mod Structure

Look at the mod's main features:
- What items does it add?
- What blocks does it add?
- What entities does it add?
- Are there custom mechanics?

### 2. Create a Module

Create a new module following the structure above.

### 3. Port Content

#### Items
```java
// Old mod code:
public static final Item EXAMPLE = Registry.register(
    Registries.ITEM,
    new Identifier("oldmod", "example"),
    new Item(new Item.Settings())
);

// New module code (in YourModuleItems.java):
public static final Item EXAMPLE = new Item(new Item.Settings());

// In register() method:
registerItem("example", EXAMPLE);
```

#### Blocks
```java
// Create blocks/ package in your module
// Follow similar pattern as items
```

#### Custom Classes
- Move custom item/block/entity classes to appropriate subdirectories
- Update package names to match new structure

### 4. Update Resource Files

Move textures, models, recipes, and lang files:

```
src/main/resources/
├── assets/charmncrafts-gears-and-gadgets/
│   ├── textures/
│   │   └── item/
│   │       └── your_item.png
│   ├── models/
│   │   └── item/
│   │       └── your_item.json
│   └── lang/
│       └── en_us.json
└── data/charmncrafts-gears-and-gadgets/
    └── recipes/
        └── your_item.json
```

### 5. Test Integration

- Build the mod: `./gradlew build`
- Run the game: `./gradlew runClient`
- Verify all items appear correctly
- Test functionality

## Module Priority System

Modules load in priority order (lower numbers first):

- **0-10**: Core dependencies
- **10-30**: Fundamental content (tools, basic items)
- **30-50**: Standard content
- **50-70**: Advanced content
- **70+**: Content that depends on other modules

Example:
```java
@Override
public int getPriority() {
    return 10; // Arsenal loads early (tools are fundamental)
}
```

## Best Practices

### Organization
- One feature per module (weapons, magic, tech, etc.)
- Keep modules self-contained
- Use clear, descriptive names

### Naming Conventions
- Package: `chamncraft.modules.modulename`
- Module class: `ModuleNameModule.java`
- Items registry: `ModuleNameItems.java`
- Blocks registry: `ModuleNameBlocks.java`

### Resource Sharing
For shared utilities across modules:
- Create `chamncraft.core.utils` package
- Add helper classes for common operations
- Document shared resources

### Logging
Use module prefixes in logs:
```java
CharmNCraftsMod.LOGGER.info("[YourModule] Message here");
```

## Example: Adding a Magic Module

```java
// 1. Create module structure
modules/magic/
├── MagicModule.java
├── items/
│   ├── MagicItems.java
│   └── custom/
│       └── WandItem.java
└── spells/
    └── Spell.java

// 2. Implement module
public class MagicModule implements IModule {
    @Override
    public void initialize() {
        MagicItems.register();
        SpellRegistry.register();
    }
}

// 3. Register in ModuleLoader
modules.add(new MagicModule());
```

## Troubleshooting

### Module Not Loading
- Check that module is added to `ModuleLoader.registerModules()`
- Verify `initialize()` is called
- Check logs for errors

### Items Not Appearing
- Ensure items are registered in `register()` method
- Check creative tab registration
- Verify resource files exist

### Class Not Found Errors
- Update package imports
- Check fabric.mod.json entry points
- Rebuild project: `./gradlew clean build`

## Support

For issues or questions:
- Check the console logs for detailed error messages
- Review existing modules (Arsenal, GearsGadgets) as examples
- Ensure all resource files are properly placed
