package starman.aspengrove.classes;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

import net.minecraft.world.item.*;

public class AspenGroveCreativeTab {
    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(entries -> {
            entries.insertAfter(Items.BIRCH_BUTTON,
<<<<<<< HEAD
                    AspenGroveBlocks.ASPEN_LOG,
                    AspenGroveBlocks.ASPEN_WOOD,
                    AspenGroveBlocks.STRIPPED_ASPEN_LOG,
                    AspenGroveBlocks.STRIPPED_ASPEN_WOOD,
                    AspenGroveBlocks.ASPEN_PLANKS,
                    AspenGroveBlocks.ASPEN_STAIRS,
                    AspenGroveBlocks.ASPEN_SLAB,
                    AspenGroveBlocks.ASPEN_FENCE,
                    AspenGroveBlocks.ASPEN_FENCE_GATE,
                    AspenGroveBlocks.ASPEN_DOOR,
                    AspenGroveBlocks.ASPEN_TRAPDOOR,
                    AspenGroveBlocks.ASPEN_PRESSURE_PLATE,
                    AspenGroveBlocks.ASPEN_BUTTON
=======
                    AspenGroveItems.ASPEN_LOG_ITEM,
                    AspenGroveItems.ASPEN_WOOD_ITEM,
                    AspenGroveItems.STRIPPED_ASPEN_LOG_ITEM,
                    AspenGroveItems.STRIPPED_ASPEN_WOOD_ITEM,
                    AspenGroveItems.ASPEN_PLANKS_ITEM,
                    AspenGroveItems.ASPEN_STAIRS_ITEM,
                    AspenGroveItems.ASPEN_SLAB_ITEM,
                    AspenGroveItems.ASPEN_FENCE_ITEM,
                    AspenGroveItems.ASPEN_FENCE_GATE_ITEM,
                    AspenGroveItems.ASPEN_DOOR_ITEM,
                    AspenGroveItems.ASPEN_TRAPDOOR_ITEM,
                    AspenGroveItems.ASPEN_PRESSURE_PLATE_ITEM,
                    AspenGroveItems.ASPEN_BUTTON_ITEM
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
            );
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(entries -> {
            entries.insertAfter(Items.BIRCH_LOG,
<<<<<<< HEAD
                    AspenGroveBlocks.ASPEN_LOG
            );
            entries.insertAfter(Items.BIRCH_LEAVES,
                    AspenGroveBlocks.ASPEN_LEAVES
            );
            entries.insertAfter(Items.RED_MUSHROOM_BLOCK,
                    AspenGroveBlocks.ORANGE_MUSHROOM_BLOCK
            );
            entries.insertAfter(Items.BIRCH_SAPLING,
                    AspenGroveBlocks.ASPEN_SAPLING
            );
            entries.insertAfter(Items.RED_MUSHROOM,
                    AspenGroveBlocks.ORANGE_MUSHROOM
            );
            entries.insertAfter(Items.POPPY,
                    AspenGroveBlocks.HONEYFLOWER
=======
                    AspenGroveItems.ASPEN_LOG_ITEM
            );
            entries.insertAfter(Items.BIRCH_LEAVES,
                    AspenGroveItems.ASPEN_LEAVES_ITEM
            );
            entries.insertAfter(Items.RED_MUSHROOM_BLOCK,
                    AspenGroveItems.ORANGE_MUSHROOM_BLOCK_ITEM
            );
            entries.insertAfter(Items.BIRCH_SAPLING,
                    AspenGroveItems.ASPEN_SAPLING_ITEM
            );
            entries.insertAfter(Items.RED_MUSHROOM,
                    AspenGroveItems.ORANGE_MUSHROOM_ITEM
            );
            entries.insertAfter(Items.POPPY,
                    AspenGroveItems.HONEYFLOWER_ITEM
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
            );
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {
            entries.insertAfter(Items.BIRCH_HANGING_SIGN,
<<<<<<< HEAD
                    AspenGroveBlocks.ASPEN_SIGN_ITEM,
                    AspenGroveBlocks.ASPEN_HANGING_SIGN_ITEM
            );
            entries.insertAfter(Items.BIRCH_SHELF,
                    AspenGroveBlocks.ASPEN_SHELF
=======
                    AspenGroveItems.ASPEN_SIGN_ITEM,
                    AspenGroveItems.ASPEN_HANGING_SIGN_ITEM
            );
            entries.insertAfter(Items.BIRCH_SHELF,
                    AspenGroveItems.ASPEN_SHELF_ITEM
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
            );
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
            entries.insertAfter(Items.BONE_MEAL,
                    AspenGroveItems.BOUQUET
            );
            entries.insertAfter(Items.BIRCH_CHEST_BOAT,
                    AspenGroveItems.ASPEN_BOAT,
                    AspenGroveItems.ASPEN_CHEST_BOAT
            );
        });
    }
}