package starman.aspengrove.classes;
<<<<<<< HEAD

import com.terraformersmc.biolith.api.biome.BiomePlacement;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;

=======
//
//import com.terraformersmc.biolith.api.biome.BiomePlacement;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.*;
import net.minecraft.world.level.biome.*;
//
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
public class AspenGroveBiomes {
    public static final ResourceKey<Biome> ASPEN_GROVE = ResourceKey.create(
            Registries.BIOME,
            Identifier.fromNamespaceAndPath("aspengrove", "aspen_grove")
    );
<<<<<<< HEAD

    public static void initialize() {
        BiomePlacement.replaceOverworld(Biomes.FOREST, ASPEN_GROVE, 0.27);
        BiomePlacement.replaceOverworld(Biomes.BIRCH_FOREST, ASPEN_GROVE, 0.27);
        BiomePlacement.replaceOverworld(Biomes.TAIGA, ASPEN_GROVE, 0.27);
=======
//
    public static void initialize() {
//        BiomePlacement.replaceOverworld(Biomes.FOREST, ASPEN_GROVE, 0.27);
//        BiomePlacement.replaceOverworld(Biomes.BIRCH_FOREST, ASPEN_GROVE, 0.27);
//        BiomePlacement.replaceOverworld(Biomes.TAIGA, ASPEN_GROVE, 0.27);
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
    }
}