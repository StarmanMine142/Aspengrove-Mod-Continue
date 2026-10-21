package starman.aspengrove.classes;

import starman.aspengrove.AspenGrove;

import java.util.function.Function;
import java.util.function.Supplier;
import java.lang.reflect.Field;
import java.util.Set;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.block.entity.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

@SuppressWarnings("null")
public class AspenGroveBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AspenGrove.MOD_ID);

    public static void initialize(IEventBus bus) {
        BLOCKS.register(bus);
        bus.addListener(FMLCommonSetupEvent.class, e -> addToBlockEntityTypes());
    }

    private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> blockFactory, Supplier<BlockBehaviour.Properties> settings) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        return BLOCKS.registerBlock(name, blockFactory, () -> settings.get().setId(blockKey));
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, name));
    }

    public static final DeferredBlock<RotatedPillarBlock> ASPEN_LOG = register(
            "aspen_log",
            RotatedPillarBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.WOOD)
                    .strength(2.0F)
                    .ignitedByLava()
                    .instrument(NoteBlockInstrument.BASS)
    );

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ASPEN_LOG = register(
            "stripped_aspen_log",
            RotatedPillarBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.WOOD)
                    .strength(2.0F)
                    .ignitedByLava()
                    .instrument(NoteBlockInstrument.BASS)
    );

    public static final DeferredBlock<RotatedPillarBlock> ASPEN_WOOD = register(
            "aspen_wood",
            RotatedPillarBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.WOOD)
                    .strength(2.0F)
                    .ignitedByLava()
                    .instrument(NoteBlockInstrument.BASS)
    );

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ASPEN_WOOD = register(
            "stripped_aspen_wood",
            RotatedPillarBlock::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .sound(SoundType.WOOD)
                    .strength(2.0F)
                    .ignitedByLava()
                    .instrument(NoteBlockInstrument.BASS)
    );

    public static final DeferredBlock<Block> ASPEN_PLANKS = register(
            "aspen_planks",
            Block::new,
            () -> BlockBehaviour.Properties.of()
                    .mapColor(AspenGroveColors.ASPEN_PLANKS)
                    .sound(SoundType.WOOD)
                    .strength(2.0F)
                    .ignitedByLava()
                    .instrument(NoteBlockInstrument.BASS)
    );

    public static final DeferredBlock<SlabBlock> ASPEN_SLAB = register(
            "aspen_slab",
            SlabBlock::new,
            () -> BlockBehaviour.Properties
                    .ofFullCopy(AspenGroveBlocks.ASPEN_PLANKS.get())
    );

    public static final DeferredBlock<StairBlock> ASPEN_STAIRS = register(
            "aspen_stairs",
            (settings) -> new StairBlock(ASPEN_PLANKS.get().defaultBlockState(), settings),
            () -> BlockBehaviour.Properties
                    .ofFullCopy(ASPEN_PLANKS.get())
    );

    public static final DeferredBlock<FenceBlock> ASPEN_FENCE = register(
            "aspen_fence",
            FenceBlock::new,
            () -> BlockBehaviour.Properties
                    .ofFullCopy(AspenGroveBlocks.ASPEN_PLANKS.get())
    );

    public static final DeferredBlock<FenceGateBlock> ASPEN_FENCE_GATE = register(
            "aspen_fence_gate",
            (settings) -> new FenceGateBlock(WoodType.OAK, settings),
            () -> BlockBehaviour.Properties
                    .ofFullCopy(AspenGroveBlocks.ASPEN_PLANKS.get())
                    .noOcclusion()
    );

    public static final DeferredBlock<PressurePlateBlock> ASPEN_PRESSURE_PLATE = register(
            "aspen_pressure_plate",
            (settings) -> new PressurePlateBlock(WoodType.OAK.setType(), settings),
            () -> BlockBehaviour.Properties
                    .ofFullCopy(AspenGroveBlocks.ASPEN_PLANKS.get())
                    .noCollision()
                    .strength(0.5f)
    );

    public static final DeferredBlock<ButtonBlock> ASPEN_BUTTON = register(
            "aspen_button",
            (settings) -> new ButtonBlock(BlockSetType.OAK, 30, settings),
            () -> BlockBehaviour.Properties
                    .ofFullCopy(AspenGroveBlocks.ASPEN_PLANKS.get())
                    .noCollision()
                    .strength(0.5f)
    );

    public static final DeferredBlock<DoorBlock> ASPEN_DOOR = register(
            "aspen_door",
            (settings) -> new DoorBlock(BlockSetType.OAK, settings),
            () -> BlockBehaviour.Properties
                    .ofFullCopy(AspenGroveBlocks.ASPEN_PLANKS.get())
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos, aabb) -> false)
                    .noOcclusion()
    );

    public static final DeferredBlock<TrapDoorBlock> ASPEN_TRAPDOOR = register(
            "aspen_trapdoor",
            (settings) -> new TrapDoorBlock(BlockSetType.OAK, settings),
            () -> BlockBehaviour.Properties
                    .ofFullCopy(AspenGroveBlocks.ASPEN_PLANKS.get())
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos, aabb) -> false)
                    .noOcclusion()
    );

    public static final DeferredBlock<StandingSignBlock> ASPEN_SIGN = BLOCKS.register(
            "aspen_sign",
            () -> new StandingSignBlock(AspenGroveWoodTypes.ASPEN, BlockBehaviour.Properties
                    .ofFullCopy(ASPEN_PLANKS.get())
                    .setId(keyOfBlock("aspen_sign"))
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
            )
    );

    public static final DeferredBlock<WallSignBlock> ASPEN_WALL_SIGN = BLOCKS.register(
            "aspen_wall_sign",
            () -> new WallSignBlock(AspenGroveWoodTypes.ASPEN, BlockBehaviour.Properties
                    .ofFullCopy(ASPEN_PLANKS.get())
                    .setId(keyOfBlock("aspen_wall_sign"))
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
            )
    );

    public static final DeferredBlock<CeilingHangingSignBlock> ASPEN_HANGING_SIGN = BLOCKS.register(
            "aspen_hanging_sign",
            () -> new CeilingHangingSignBlock(AspenGroveWoodTypes.ASPEN, BlockBehaviour.Properties
                    .ofFullCopy(ASPEN_PLANKS.get())
                    .setId(keyOfBlock("aspen_hanging_sign"))
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
            )
    );

    public static final DeferredBlock<WallHangingSignBlock> ASPEN_WALL_HANGING_SIGN = BLOCKS.register(
            "aspen_wall_hanging_sign",
            () -> new WallHangingSignBlock(AspenGroveWoodTypes.ASPEN, BlockBehaviour.Properties
                    .ofFullCopy(ASPEN_PLANKS.get())
                    .setId(keyOfBlock("aspen_wall_hanging_sign"))
                    .forceSolidOn()
                    .noCollision()
                    .strength(1.0F)
            )
    );

    public static final DeferredBlock<ShelfBlock> ASPEN_SHELF = register(
            "aspen_shelf",
            ShelfBlock::new,
            () -> BlockBehaviour.Properties
                    .ofFullCopy(AspenGroveBlocks.ASPEN_PLANKS.get())
                    .sound(SoundType.SHELF)
    );

    public static final DeferredBlock<AspenGroveLeavesBlock> ASPEN_LEAVES = register(
            "aspen_leaves",
            (properties) -> new AspenGroveLeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), properties),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(AspenGroveColors.ASPEN_LEAVES)
                    .sound(SoundType.GRASS)
                    .strength(0.2f)
                    .isSuffocating((state, world, pos) -> false)
                    .isViewBlocking((state, world, pos, aabb) -> false)
                    .noOcclusion()
                    .randomTicks()
                    .ignitedByLava()
    );

    public static final DeferredBlock<SaplingBlock> ASPEN_SAPLING = register(
            "aspen_sapling",
            (settings) -> new SaplingBlock(AspenGroveTreeGrowers.ASPEN, settings),
            () -> BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollision()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .ignitedByLava()
    );

    public static final DeferredBlock<FlowerPotBlock> POTTED_ASPEN_SAPLING = register(
            "potted_aspen_sapling",
            (properties) -> new FlowerPotBlock(ASPEN_SAPLING.get(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING)
                    .mapColor(MapColor.GRASS)
    );

    public static final DeferredBlock<FlowerBlock> HONEYFLOWER = register(
            "honeyflower",
            (properties) -> new FlowerBlock(MobEffects.HEALTH_BOOST, 10, properties),
            () -> BlockBehaviour.Properties
                    .ofFullCopy(Blocks.POPPY)
    );

    public static final DeferredBlock<FlowerPotBlock> POTTED_HONEYFLOWER = register(
            "potted_honeyflower",
            (properties) -> new FlowerPotBlock(HONEYFLOWER.get(), properties),
            () -> BlockBehaviour.Properties
                    .ofFullCopy(Blocks.POTTED_POPPY)
    );

    public static final DeferredBlock<AspenGroveMushroomBlock> ORANGE_MUSHROOM = register(
            "orange_mushroom",
            (properties) -> new AspenGroveMushroomBlock(AspenGroveTreeGrowers.HUGE_ORANGE_MUSHROOM_SELECTOR, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.RED_MUSHROOM)
                    .mapColor(MapColor.COLOR_ORANGE)
    );

    public static final DeferredBlock<FlowerPotBlock> POTTED_ORANGE_MUSHROOM = register(
            "potted_orange_mushroom",
            (properties) -> new FlowerPotBlock(ORANGE_MUSHROOM.get(), properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_RED_MUSHROOM)
                    .mapColor(MapColor.COLOR_ORANGE)
    );

    public static final DeferredBlock<HugeMushroomBlock> ORANGE_MUSHROOM_BLOCK = register(
            "orange_mushroom_block",
            HugeMushroomBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.RED_MUSHROOM_BLOCK)
                    .mapColor(MapColor.COLOR_ORANGE)
    );

    public static void addToBlockEntityTypes() {
        try {
            Field targetField = null;
            for (Field field : BlockEntityType.class.getDeclaredFields()) {
                if (Set.class.isAssignableFrom(field.getType())) {
                    java.lang.reflect.Type genericType = field.getGenericType();
                    if (genericType instanceof java.lang.reflect.ParameterizedType pt) {
                        java.lang.reflect.Type[] actualTypes = pt.getActualTypeArguments();
                        if (actualTypes.length == 1 && actualTypes[0] == Block.class) {
                            targetField = field;
                            break;
                        }
                    }
                }
            }
            if (targetField == null) {
                System.err.println("[AspenGrove] CRITICAL: Could not find Set<Block> field in BlockEntityType");
                return;
            }
            targetField.setAccessible(true);
            Set<Block> signBlocks = (Set<Block>) targetField.get(BlockEntityTypes.SIGN);
            boolean modified = false;
            try {
                modified = signBlocks.add(ASPEN_SIGN.get()) | signBlocks.add(ASPEN_WALL_SIGN.get());
            } catch (UnsupportedOperationException e) {

                Set<Block> newSignBlocks = new java.util.HashSet<>(signBlocks);
                newSignBlocks.add(ASPEN_SIGN.get());
                newSignBlocks.add(ASPEN_WALL_SIGN.get());
                targetField.set(BlockEntityTypes.SIGN, newSignBlocks);
                modified = true;
            }
            if (modified) {
                System.out.println("[AspenGrove] Successfully added signs to BlockEntityType.SIGN");
            }
            Set<Block> hangingSignBlocks = (Set<Block>) targetField.get(BlockEntityTypes.HANGING_SIGN);
            modified = false;
            try {
                modified = hangingSignBlocks.add(ASPEN_HANGING_SIGN.get()) | hangingSignBlocks.add(ASPEN_WALL_HANGING_SIGN.get());
            } catch (UnsupportedOperationException e) {
                Set<Block> newHangingSignBlocks = new java.util.HashSet<>(hangingSignBlocks);
                newHangingSignBlocks.add(ASPEN_HANGING_SIGN.get());
                newHangingSignBlocks.add(ASPEN_WALL_HANGING_SIGN.get());
                targetField.set(BlockEntityTypes.HANGING_SIGN, newHangingSignBlocks);
                modified = true;
            }
            if (modified) {
                System.out.println("[AspenGrove] Successfully added hanging signs to BlockEntityType.HANGING_SIGN");
            }
            Set<Block> shelfBlocks = (Set<Block>) targetField.get(BlockEntityTypes.SHELF);
            modified = false;
            try {
                modified = shelfBlocks.add(ASPEN_SHELF.get());
            } catch (UnsupportedOperationException e) {
                Set<Block> newShelfBlocks = new java.util.HashSet<>(shelfBlocks);
                newShelfBlocks.add(ASPEN_SHELF.get());
                targetField.set(BlockEntityTypes.SHELF, newShelfBlocks);
                modified = true;
            }
            if (modified) {
                System.out.println("[AspenGrove] Successfully added shelves to BlockEntityType.SHELF");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}