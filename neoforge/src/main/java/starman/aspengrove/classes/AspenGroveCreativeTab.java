package starman.aspengrove.classes;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.bus.api.*;

import net.minecraft.world.item.*;

@EventBusSubscriber
public class AspenGroveCreativeTab {

    @SubscribeEvent
    public static void onBuildCreativeModeTabContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.insertAfter(
                    Items.BIRCH_BUTTON.getDefaultInstance(),
                    AspenGroveItems.ASPEN_LOG_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_LOG_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_WOOD_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_WOOD_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.STRIPPED_ASPEN_LOG_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.STRIPPED_ASPEN_LOG_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.STRIPPED_ASPEN_WOOD_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.STRIPPED_ASPEN_WOOD_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_PLANKS_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_PLANKS_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_STAIRS_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_STAIRS_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_SLAB_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_SLAB_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_FENCE_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_FENCE_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_FENCE_GATE_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_FENCE_GATE_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_DOOR_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_DOOR_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_TRAPDOOR_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_TRAPDOOR_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_PRESSURE_PLATE_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_PRESSURE_PLATE_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_BUTTON_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.insertAfter(
                    Items.BIRCH_LOG.getDefaultInstance(),
                    AspenGroveItems.ASPEN_LOG_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.BIRCH_LEAVES.getDefaultInstance(),
                    AspenGroveItems.ASPEN_LEAVES_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.RED_MUSHROOM_BLOCK.getDefaultInstance(),
                    AspenGroveItems.ORANGE_MUSHROOM_BLOCK_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.BIRCH_SAPLING.getDefaultInstance(),
                    AspenGroveItems.ASPEN_SAPLING_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.RED_MUSHROOM.getDefaultInstance(),
                    AspenGroveItems.ORANGE_MUSHROOM_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.POPPY.getDefaultInstance(),
                    AspenGroveItems.HONEYFLOWER_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.insertAfter(
                    Items.BIRCH_HANGING_SIGN.getDefaultInstance(),
                    AspenGroveItems.ASPEN_SIGN_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_SIGN_ITEM.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_HANGING_SIGN_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.BIRCH_SHELF.getDefaultInstance(),
                    AspenGroveItems.ASPEN_SHELF_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.insertAfter(
                    Items.BONE_MEAL.getDefaultInstance(),
                    AspenGroveItems.BOUQUET.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.BIRCH_CHEST_BOAT.getDefaultInstance(),
                    AspenGroveItems.ASPEN_BOAT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveItems.ASPEN_BOAT.get().getDefaultInstance(),
                    AspenGroveItems.ASPEN_CHEST_BOAT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
    }

    public static void initialize(IEventBus modEventBus) {
    }
}