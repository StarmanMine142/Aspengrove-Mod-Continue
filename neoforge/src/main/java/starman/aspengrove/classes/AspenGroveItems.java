package starman.aspengrove.classes;

import starman.aspengrove.AspenGrove;

import java.util.function.*;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AspenGroveItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AspenGrove.MOD_ID);

    private static ResourceKey<Item> item(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, name));
    }

    private static DeferredItem<Item> registerBlock(final String name, final DeferredBlock<? extends Block> block, final BiFunction<Block, Item.Properties, Item> itemFactory, final Item.Properties properties) {
        ResourceKey<Item> key = item(name);
        Item.Properties prepared = properties.useBlockDescriptionPrefix();
        return ITEMS.register(name, () -> {
            Item item = itemFactory.apply(block.get(), prepared.requiredFeatures(block.get().requiredFeatures()).setId(key));
            if (item instanceof BlockItem blockItem) {
                blockItem.registerBlocks(Item.BY_BLOCK, item);
            }
            return item;
        });
    }

    private static DeferredItem<Item> registerItem(final ResourceKey<Item> id, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        return ITEMS.register(id.identifier().getPath(), () -> {
            Item item = itemFactory.apply(properties.setId(id));
            if (item instanceof BlockItem blockItem) {
                blockItem.registerBlocks(Item.BY_BLOCK, item);
            }
            return item;
        });
    }

    private static DeferredItem<Item> register(String name, Function<Item.Properties, Item> factory) {
        ResourceKey<Item> key = item(name);
        return ITEMS.register(name, () -> {
            Item.Properties properties = new Item.Properties().setId(key).stacksTo(1);
            Item item = factory.apply(properties);
            if (item instanceof BlockItem blockItem) {
                blockItem.registerBlocks(Item.BY_BLOCK, item);
            }
            return item;
        });
    }

    public static final DeferredItem<Item> ASPEN_BOAT = register("aspen_boat", properties -> new BoatItem(AspenGroveEntities.ASPEN_BOAT.get(), properties.stacksTo(1).cookingFuel(ContextIntProviders.COOKING_TIME_BOATS)));
    public static final DeferredItem<Item> ASPEN_CHEST_BOAT = register("aspen_chest_boat", properties -> new BoatItem(AspenGroveEntities.ASPEN_CHEST_BOAT.get(), properties.stacksTo(1).cookingFuel(ContextIntProviders.COOKING_TIME_BOATS)));
    public static final DeferredItem<Item> BOUQUET = register("bouquet", properties -> new Item(properties.stacksTo(16).compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final DeferredItem<Item> ASPEN_LOG_ITEM = register("aspen_log", properties -> new BlockItem(AspenGroveBlocks.ASPEN_LOG.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> STRIPPED_ASPEN_LOG_ITEM = register("stripped_aspen_log", properties -> new BlockItem(AspenGroveBlocks.STRIPPED_ASPEN_LOG.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_WOOD_ITEM = register("aspen_wood", properties -> new BlockItem(AspenGroveBlocks.ASPEN_WOOD.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> STRIPPED_ASPEN_WOOD_ITEM = register("stripped_aspen_wood", properties -> new BlockItem(AspenGroveBlocks.STRIPPED_ASPEN_WOOD.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_PLANKS_ITEM = register("aspen_planks", properties -> new BlockItem(AspenGroveBlocks.ASPEN_PLANKS.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_SLAB_ITEM = register("aspen_slab", properties -> new BlockItem(AspenGroveBlocks.ASPEN_SLAB.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_SLABS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_STAIRS_ITEM = register("aspen_stairs", properties -> new BlockItem(AspenGroveBlocks.ASPEN_STAIRS.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_FENCE_ITEM = register("aspen_fence", properties -> new BlockItem(AspenGroveBlocks.ASPEN_FENCE.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_FENCE_GATE_ITEM = register("aspen_fence_gate", properties -> new BlockItem(AspenGroveBlocks.ASPEN_FENCE_GATE.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_PRESSURE_PLATE_ITEM = register("aspen_pressure_plate", properties -> new BlockItem(AspenGroveBlocks.ASPEN_PRESSURE_PLATE.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_BUTTON_ITEM = register("aspen_button", properties -> new BlockItem(AspenGroveBlocks.ASPEN_BUTTON.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_EXTRA_SMALL).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_DOOR_ITEM = register("aspen_door", properties -> new BlockItem(AspenGroveBlocks.ASPEN_DOOR.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_TRAPDOOR_ITEM = register("aspen_trapdoor", properties -> new BlockItem(AspenGroveBlocks.ASPEN_TRAPDOOR.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_SIGN_ITEM = registerBlock("aspen_sign", AspenGroveBlocks.ASPEN_SIGN, (b, p) -> new StandingAndWallBlockItem(b, AspenGroveBlocks.ASPEN_WALL_SIGN.get(), Direction.DOWN, p), (Item.Properties)(new Item.Properties()).cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_ITEMS_LARGE).stacksTo(16).signText());
    public static final DeferredItem<Item> ASPEN_HANGING_SIGN_ITEM = ITEMS.register("aspen_hanging_sign", () -> new HangingSignItem(AspenGroveBlocks.ASPEN_HANGING_SIGN.get(), AspenGroveBlocks.ASPEN_WALL_HANGING_SIGN.get(), new Item.Properties().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(16).setId(item("aspen_hanging_sign"))));
    public static final DeferredItem<Item> ASPEN_SHELF_ITEM = register("aspen_shelf", properties -> new BlockItem(AspenGroveBlocks.ASPEN_SHELF.get(), properties.useBlockDescriptionPrefix().cookingFuel(ContextIntProviders.COOKING_TIME_WOOD_BLOCKS).stacksTo(64)));
    public static final DeferredItem<Item> ASPEN_LEAVES_ITEM = register("aspen_leaves", properties -> new BlockItem(AspenGroveBlocks.ASPEN_LEAVES.get(), properties.useBlockDescriptionPrefix().stacksTo(64).compostable(ContextIntProviders.COMPOSTABLE_LOW)));
    public static final DeferredItem<Item> ASPEN_SAPLING_ITEM = register("aspen_sapling", properties -> new BlockItem(AspenGroveBlocks.ASPEN_SAPLING.get(), properties.useBlockDescriptionPrefix().stacksTo(64).compostable(ContextIntProviders.COMPOSTABLE_LOW)));
    public static final DeferredItem<Item> HONEYFLOWER_ITEM = register("honeyflower", properties -> new BlockItem(AspenGroveBlocks.HONEYFLOWER.get(), properties.useBlockDescriptionPrefix().stacksTo(64).compostable(ContextIntProviders.COMPOSTABLE_MEDIUM)));
    public static final DeferredItem<Item> ORANGE_MUSHROOM_ITEM = register("orange_mushroom", properties -> new BlockItem(AspenGroveBlocks.ORANGE_MUSHROOM.get(), properties.useBlockDescriptionPrefix().stacksTo(64).compostable(ContextIntProviders.COMPOSTABLE_MEDIUM)));
    public static final DeferredItem<Item> ORANGE_MUSHROOM_BLOCK_ITEM = register("orange_mushroom_block", properties -> new BlockItem(AspenGroveBlocks.ORANGE_MUSHROOM_BLOCK.get(), properties.useBlockDescriptionPrefix().stacksTo(64).compostable(ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH)));

    public static void initialize(IEventBus bus) {
        ITEMS.register(bus);
    }
}