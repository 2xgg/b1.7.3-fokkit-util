package com.example.mod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Modid implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("modid");

    @Override
    public void onInitialize() {
        LOGGER.info("Mod initialized!");
    }
}
