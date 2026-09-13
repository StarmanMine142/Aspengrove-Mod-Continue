package starman.aspengrove;

<<<<<<< HEAD
import net.fabricmc.api.ModInitializer;

import starman.aspengrove.classes.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
=======
import starman.aspengrove.classes.*;

import org.slf4j.*;

import net.fabricmc.api.ModInitializer;
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59

public class AspenGrove implements ModInitializer {
    public static final String MOD_ID = "aspengrove";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        AspenGroveColors.initialize();
        AspenGroveWoodTypes.initialize();
        AspenGroveBlocks.initialize();
<<<<<<< HEAD
        AspenGroveBlocks.registerFuels();
        AspenGroveBlocks.registerStrippables();
        AspenGroveBlocks.registerFlammables();
        AspenGroveBlocks.registerCompostables();
=======
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
        AspenGroveCreativeTab.initialize();
        AspenGroveTreeGrowers.initialize();
        AspenGroveEntities.initialize();
        AspenGroveItems.initialize();
<<<<<<< HEAD
        AspenGroveItems.registerCompostables();
        AspenGroveItems.registerFuels();
=======
        AspenGroveRegisters.initialize();
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
        AspenGroveBiomes.initialize();

        LOGGER.info("Aspen Grove Initialized!");
    }
}