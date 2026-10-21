package starman.aspengrove;

import starman.aspengrove.classes.*;
import starman.aspengrove.classes.client.AspenGroveClient;

import org.slf4j.*;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(AspenGrove.MOD_ID)
public class AspenGrove {
    public static final String MOD_ID = "aspengrove";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public AspenGrove(IEventBus modEventBus) {
        AspenGroveBlocks.initialize(modEventBus);
        AspenGroveEntities.initialize(modEventBus);
        AspenGroveItems.initialize(modEventBus);
        AspenGroveCreativeTab.initialize(modEventBus);
        AspenGroveColors.initialize();
        AspenGroveWoodTypes.initialize();
        AspenGroveTreeGrowers.initialize();

        modEventBus.addListener(this::commonSetup);

        if (FMLEnvironment.getDist() == Dist.CLIENT) {
            new AspenGroveClient(modEventBus);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            AspenGroveBiomes.initialize();
            AspenGroveBlocks.addToBlockEntityTypes();
            LOGGER.info("Aspen Grove Initialized!");
        });
    }
}