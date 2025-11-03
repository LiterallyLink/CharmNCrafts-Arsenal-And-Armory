# CharmNCrafts Quick Start Guide

## What's New

CharmNCrafts now uses a **modular architecture** that makes it easy to organize and merge multiple Minecraft mods into one unified package!

## Current Modules

### Arsenal & Armory
**Items Added:**
- Bedrock Pickaxe (Unbreakable)
- Bedrock Axe (Unbreakable)
- Bedrock Shovel (Unbreakable)
- Bedrock Sword (Unbreakable)
- Bedrock Hoe (Unbreakable)

### Gears & Gadgets
Ready for your utility items and gadgets! (Template created)

## How to Add New Modules

### Quick Template

1. **Create module package:**
   ```
   src/main/java/chamncraft/modules/yourmodule/
   ```

2. **Create YourModule.java:**
   ```java
   public class YourModule implements IModule {
       public String getModuleId() { return "yourmodule"; }
       public String getModuleName() { return "Your Module"; }
       public void initialize() {
           YourModuleItems.register();
       }
   }
   ```

3. **Create YourModuleItems.java:**
   ```java
   public class YourModuleItems {
       public static final Item YOUR_ITEM = new Item(new Item.Settings());

       public static void register() {
           registerItem("your_item", YOUR_ITEM);
       }
   }
   ```

4. **Register in ModuleLoader.java:**
   ```java
   modules.add(new YourModule());
   ```

See `MODULE_GUIDE.md` for detailed instructions!

## Merging Existing Mods

1. Create a new module for the mod
2. Copy items/blocks/entities into module structure
3. Update package names
4. Register in ModuleLoader
5. Move resource files (textures, models, recipes)

Full guide in `MODULE_GUIDE.md`

## Building

```bash
./gradlew clean build
```

## Running

```bash
./gradlew runClient
```

## Project Structure

```
chamncraft/
├── core/                    # Core mod system
│   ├── CharmNCraftsMod      # Main entry point
│   ├── IModule              # Module interface
│   └── ModuleLoader         # Module manager
└── modules/                 # Feature modules
    ├── arsenal/             # Weapons & tools
    └── gearsgadgets/        # Utilities & gadgets
```

## Module Features

- **Self-contained:** Each module manages its own content
- **Priority-based:** Control load order
- **Easy to extend:** Simple interface to implement
- **Organized:** Clear structure for large projects
- **Maintainable:** Separation of concerns

## Next Steps

1. Check out `MODULE_GUIDE.md` for creating modules
2. See `STRUCTURE.md` for project organization
3. Start merging your existing mods!

## Example: Adding Magic Module

```java
// 1. Create modules/magic/MagicModule.java
public class MagicModule implements IModule {
    public void initialize() {
        MagicItems.register();
    }
}

// 2. Create modules/magic/items/MagicItems.java
public class MagicItems {
    public static final Item WAND = new WandItem(new Item.Settings());

    public static void register() {
        registerItem("magic_wand", WAND);
    }
}

// 3. Register in ModuleLoader
modules.add(new MagicModule());
```

Done! Your magic module is now part of CharmNCrafts.

## Benefits

- **Easy Merging:** Combine multiple mods seamlessly
- **Better Organization:** Features grouped logically
- **Scalability:** Add as many modules as needed
- **Clean Code:** Self-documenting structure
- **Flexibility:** Enable/disable modules easily

## Support

- Read `MODULE_GUIDE.md` for detailed instructions
- Check `STRUCTURE.md` for project layout
- Review existing modules (Arsenal, GearsGadgets) as examples
