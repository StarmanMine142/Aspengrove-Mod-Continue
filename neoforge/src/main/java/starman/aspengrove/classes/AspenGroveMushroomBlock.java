package starman.aspengrove.classes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
<<<<<<< HEAD
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
=======
import net.minecraft.world.level.levelgen.feature.Feature;
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59

import java.util.Optional;

public class AspenGroveMushroomBlock extends MushroomBlock {
<<<<<<< HEAD
    private final ResourceKey<ConfiguredFeature<?, ?>> feature;

    public AspenGroveMushroomBlock(ResourceKey<ConfiguredFeature<?, ?>> feature, Properties properties) {
=======
    private final ResourceKey<Feature> feature;

    public AspenGroveMushroomBlock(ResourceKey<Feature> feature, Properties properties) {
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
        super(feature, properties);
        this.feature = feature;
    }

    @Override
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
<<<<<<< HEAD
        Optional<? extends Holder<ConfiguredFeature<?, ?>>> optional = level.registryAccess()
                .lookupOrThrow(Registries.CONFIGURED_FEATURE)
=======
        Optional<? extends Holder<Feature>> optional = level.registryAccess()
                .lookupOrThrow(Registries.FEATURE)
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
                .get(this.feature);

        if (optional.isEmpty()) {
            return false;
        } else {
            level.removeBlock(pos, false);
            if (optional.get().value().place(level, level.getChunkSource().getGenerator(), random, pos)) {
                return true;
            } else {
                level.setBlock(pos, state, 3);
                return false;
            }
        }
    }
}