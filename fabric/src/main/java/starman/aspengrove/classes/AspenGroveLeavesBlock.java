package starman.aspengrove.classes;

<<<<<<< HEAD
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class AspenGroveLeavesBlock extends LeavesBlock {
    public static final MapCodec<AspenGroveLeavesBlock> CODEC = simpleCodec(AspenGroveLeavesBlock::new);
    public AspenGroveLeavesBlock(BlockBehaviour.Properties properties) {
        super(0.05f,properties);
    }

    @Override
    public MapCodec<? extends LeavesBlock> codec() {
        return CODEC;
=======
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.*;
import net.minecraft.core.*;
import net.minecraft.core.particles.*;

public class AspenGroveLeavesBlock extends LeavesBlock {

    public AspenGroveLeavesBlock(AmbientLeavesBlockSoundPlayer soundPlayer, BlockBehaviour.Properties properties) {
        super(soundPlayer, properties);
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        super.animateTick(state, level, pos, random);
<<<<<<< HEAD
        if (random.nextFloat() < 0.05f) {
            BlockPos blockPos = pos.below();
            BlockState blockState = level.getBlockState(blockPos);
            if (blockState.isFaceSturdy(level, blockPos, net.minecraft.core.Direction.UP)) {
=======

        if (random.nextFloat() < 0.05f) {
            BlockPos blockPos = pos.below();
            BlockState blockState = level.getBlockState(blockPos);

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
<<<<<<< HEAD
=======

>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
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
