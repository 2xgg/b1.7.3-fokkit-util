# Beta 1.7.3 Babric Modding Environment

Minimal development environment for creating Minecraft Beta 1.7.3 mods using Babric/Fabric.

## What's Included

- **Minecraft**: Beta 1.7.3
- **Mappings**: BINY (b1.7.3+build.1:v2)
- **Loader**: Fabric Loader 0.17.3
- **Java**: Requires Java 17

## Project Structure

```
betamod-dev-env/
├── src/main/
│   ├── java/com/example/mod/
│   │   └── Modid.java          # Main mod class
│   └── resources/
│       ├── assets/modid/
│       │   └── lang/
│       │       └── en_US.lang  # Language file
│       └── fabric.mod.json     # Mod metadata
├── build.gradle.kts            # Build configuration
├── gradle.properties           # Project properties
└── settings.gradle.kts         # Settings
```

## Commands

```bash
# Build the mod
./gradlew build

# Run client
./gradlew runClient

# Run server
./gradlew runServer

# Generate IDE files
./gradlew idea
./gradlew eclipse
```

## Mod Configuration

Edit `gradle.properties` to customize:
- `mod_id` - Your mod's ID (lowercase, no spaces)
- `maven_group` - Your package name
- `archives_base_name` - Output jar name
- `mod_version` - Version number

## Next Steps

1. Update `gradle.properties` with your mod details
2. Rename the package from `com.example.mod` to your own
3. Edit `fabric.mod.json` with your mod info
4. Start coding in `Modid.java`!

## Notes

- No StationAPI included (pure Fabric)
- No extra dependencies - add what you need
- Both client and server run tasks configured
