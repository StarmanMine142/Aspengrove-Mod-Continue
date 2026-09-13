package starman.aspengrove.classes;

<<<<<<< HEAD
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
=======
import java.util.Optional;

>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
<<<<<<< HEAD
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.Optional;

public class AspenGroveMushroomBlock extends MushroomBlock {
    private final ResourceKey<ConfiguredFeature<?, ?>> feature;

    public AspenGroveMushroomBlock(ResourceKey<ConfiguredFeature<?, ?>> feature, Properties properties) {
=======
import net.minecraft.core.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.levelgen.feature.*;

public class AspenGroveMushroomBlock extends MushroomBlock {
    private final ResourceKey<Feature> feature;

    public AspenGroveMushroomBlock(final ResourceKey<Feature> feature, final BlockBehaviour.Properties properties) {
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
        super(feature, properties);
        this.feature = feature;
    }

    @Override
<<<<<<< HEAD
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        this.growMushroom(level, pos, state, random);
    }

    public boolean growMushroom(ServerLevel level, BlockPos pos, BlockState state, RandomSource random) {
        Optional<? extends Holder<ConfiguredFeature<?, ?>>> optional = level.registryAccess()
                .lookupOrThrow(Registries.CONFIGURED_FEATURE)
                .get(this.feature);

        if (optional.isEmpty()) {
            return false;
        } else {
            level.removeBlock(pos, false);
            if (optional.get().value().place(level, level.getChunkSource().getGenerator(), random, pos)) {
                return true;
            } else {
                level.setBlock(pos, state, 3);
=======
    public boolean growMushroom(final ServerLevel level, final BlockPos pos, final BlockState state, final RandomSource random) {
        Optional<? extends Holder<Feature>> featureHolder = level.registryAccess().lookupOrThrow(Registries.FEATURE).get(this.feature);
        if (featureHolder.isEmpty()) {
            return false;
        } else {
            level.removeBlock(pos, false);
            if (((Feature)((Holder)featureHolder.get()).value()).place(level, level.getChunkSource().getGenerator(), random, pos)) {
                return true;
            } else {
                level.setBlockAndUpdate(pos, state);
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
                return false;
            }
        }
    }
<<<<<<< HEAD
=======

    @Override
    public boolean isValidBonemealTarget(final LevelReader level, final BlockPos pos, final BlockState state, final BonemealSource source) {
        if (level instanceof ServerLevel serverLevel) {
            Optional<? extends Holder<Feature>> featureHolder = serverLevel.registryAccess().lookupOrThrow(Registries.FEATURE).get(this.feature);
            if (featureHolder.isPresent()) {
                Feature feature = (Feature)((Holder)featureHolder.get()).value();
                if (feature instanceof AbstractHugeMushroomFeature mushroomFeature) {
                    int minHeight = 4 + mushroomFeature.foliageRadius();
                    return level.isInsideBuildHeight(pos.above(minHeight));
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean isBonemealSuccess(final Level level, final RandomSource random, final BlockPos pos, final BlockState state, final BonemealSource source) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void performBonemeal(final ServerLevel level, final RandomSource random, final BlockPos pos, final BlockState state, final BonemealSource source) {
        this.growMushroom(level, pos, state, random);
    }
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
}