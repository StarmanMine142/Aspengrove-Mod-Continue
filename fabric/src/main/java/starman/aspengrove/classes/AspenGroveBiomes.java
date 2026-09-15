package starman.aspengrove.classes;

import com.terraformersmc.biolith.api.biome.BiomePlacement;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.*;
import net.minecraft.world.level.biome.*;

public class AspenGroveBiomes {
    public static final ResourceKey<Biome> ASPEN_GROVE = ResourceKey.create(
            Registries.BIOME,
            Identifier.fromNamespaceAndPath("aspengrove", "aspen_grove")
    );

    public static void initialize() {
        Climate.ParameterPoint aspenParameters = new Climate.ParameterPoint(
                Climate.Parameter.span(-0.05F, 0.15F),
                Climate.Parameter.span(-0.1F, 0.2F),
                Climate.Parameter.span(0.3F, 0.7F),
                Climate.Parameter.span(-0.375F, 0.05F),
                Climate.Parameter.span(0.0F, 0.0F),
                Climate.Parameter.span(0.0F, 0.3F),
                0L
        );

        BiomePlacement.addOverworld(ASPEN_GROVE, aspenParameters);
    }
}