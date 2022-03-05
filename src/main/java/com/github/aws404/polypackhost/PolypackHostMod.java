package com.github.aws404.polypackhost;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.file.Path;

public class PolypackHostMod implements DedicatedServerModInitializer {
    public static final Path POLYMER_PACK_FILE = Path.of(FabricLoader.getInstance().getGameDir().toFile() + "/polymer-resourcepack.zip");
    public static final Logger LOGGER = LogManager.getLogger("Polypack Host");
    public static final PolypackHostConfig CONFIG = PolypackHostConfig.loadConfigFile(PolypackHostConfig.CONFIG_FILE);

    @Override
    public void onInitializeServer() {
        LOGGER.info("Starting Polypack Host Mod");
    }
}
