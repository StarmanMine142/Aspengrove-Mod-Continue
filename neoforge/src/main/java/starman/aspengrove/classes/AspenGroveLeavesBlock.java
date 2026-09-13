package starman.aspengrove.classes;

import com.mojang.serialization.MapCodec;
<<<<<<< HEAD
import net.minecraft.core.BlockPos;
=======
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
<<<<<<< HEAD
import net.minecraft.world.level.block.state.BlockState;

public class AspenGroveLeavesBlock extends LeavesBlock {
    public static final MapCodec<AspenGroveLeavesBlock> CODEC = simpleCodec(AspenGroveLeavesBlock::new);
    public AspenGroveLeavesBlock(Properties properties) {
        super(0.05f,properties);
=======
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;

public class AspenGroveLeavesBlock extends LeavesBlock {
    public static final MapCodec<AspenGroveLeavesBlock> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    AmbientLeavesBlockSoundPlayer.CODEC.fieldOf("ambient_leaves_block_sound_player").forGetter(b -> b.ambientLeavesBlockSoundPlayer),
                    propertiesCodec()
            ).apply(instance, AspenGroveLeavesBlock::new)
    );

    public AspenGroveLeavesBlock(AmbientLeavesBlockSoundPlayer soundPlayer, BlockBehaviour.Properties properties) {
        super(soundPlayer, properties);
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
    }

    @Override
    public MapCodec<? extends LeavesBlock> codec() {
        return CODEC;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);
        if (random.nextFloat() < 0.05f) {
            BlockPos blockPos = pos.below();
            BlockState blockState = level.getBlockState(blockPos);
<<<<<<< HEAD
            if (blockState.isFaceSturdy(level, blockPos, net.minecraft.core.Direction.UP)) {
=======
            if (blockState.isFaceSturdy(level, blockPos, Direction.UP)) {
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
                return;
            }

            int count = 1 + random.nextInt(1);
            for (int i = 0; i < count; i++) {
                double x = pos.getX() + random.nextDouble();
                double y = pos.getY() - 0.1;
                double z = pos.getZ() + random.nextDouble();
                double xSpeed = (random.nextDouble() - 0.5) * 0.02;
                double ySpeed = -0.04 - random.nextDouble() * 0.03;
                double zSpeed = (random.nextDouble() - 0.5) * 0.02;
                float[] color = new float[]{1.0F, 0.84F, 0.0F};
                level.addParticle(
                        ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, color[0], color[1], color[2]),
                        x, y, z,
                        xSpeed, ySpeed, zSpeed
                );
            }
        }
    }
<<<<<<< HEAD

    @Override
    protected void spawnFallingLeavesParticle(Level level,BlockPos blockPos,RandomSource randomSource) {
    }
}
=======
}
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
