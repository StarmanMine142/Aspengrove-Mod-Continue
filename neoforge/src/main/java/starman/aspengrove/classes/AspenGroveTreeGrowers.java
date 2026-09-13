package starman.aspengrove.classes;

import starman.aspengrove.AspenGrove;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
<<<<<<< HEAD
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.Optional;

public class AspenGroveTreeGrowers {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ASPEN_SELECTOR =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, "aspen"));

    public static final ResourceKey<PlacedFeature> ASPEN_TREE_PLACED =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, "aspen"));

    public static final TreeGrower ASPEN = new TreeGrower(
            "aspen",
            Optional.empty(),
            Optional.of(ASPEN_SELECTOR),
            Optional.empty()
    );

    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_ORANGE_MUSHROOM_SELECTOR =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, "huge_orange_mushroom"));
=======
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class AspenGroveTreeGrowers {
    public static final ResourceKey<Feature> ASPEN_SELECTOR =
            ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, "aspen_selector"));

    public static final ResourceKey<PlacedFeature> ASPEN_TREE_PLACED =
            ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, "aspen_tree_placed"));

    public static final TreeGrower ASPEN = new TreeGrower(
            "azalea",
            WeightedList.of(AspenGroveTreeGrowers.ASPEN_SELECTOR),
            WeightedList.of(),
            WeightedList.of(),
            AspenGroveTreeGrowers.ASPEN_SELECTOR
    );


    public static final ResourceKey<Feature> HUGE_ORANGE_MUSHROOM_SELECTOR =
            ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, "huge_orange_mushroom_selector"));
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59

    public static void initialize() {
    }
}