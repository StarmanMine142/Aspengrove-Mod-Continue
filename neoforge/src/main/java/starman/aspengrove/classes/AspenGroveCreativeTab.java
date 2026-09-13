package starman.aspengrove.classes;

<<<<<<< HEAD
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraft.world.item.*;

@EventBusSubscriber
public class AspenGroveCreativeTab {

    @SubscribeEvent
    public static void onBuildCreativeModeTabContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.insertAfter(
                    Items.BIRCH_BUTTON.getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_LOG.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_LOG.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_WOOD.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_WOOD.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.STRIPPED_ASPEN_LOG.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.STRIPPED_ASPEN_LOG.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.STRIPPED_ASPEN_WOOD.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.STRIPPED_ASPEN_WOOD.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_PLANKS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_PLANKS.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_STAIRS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_STAIRS.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_SLAB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_SLAB.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_FENCE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_FENCE.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_FENCE_GATE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_FENCE_GATE.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_DOOR.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_DOOR.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_TRAPDOOR.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_TRAPDOOR.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_PRESSURE_PLATE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_PRESSURE_PLATE.get().asItem().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_BUTTON.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.insertAfter(
                    Items.BIRCH_LOG.getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_LOG.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.BIRCH_LEAVES.getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_LEAVES.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.RED_MUSHROOM_BLOCK.getDefaultInstance(),
                    AspenGroveBlocks.ORANGE_MUSHROOM_BLOCK.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.BIRCH_SAPLING.getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_SAPLING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.RED_MUSHROOM.getDefaultInstance(),
                    AspenGroveBlocks.ORANGE_MUSHROOM.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.POPPY.getDefaultInstance(),
                    AspenGroveBlocks.HONEYFLOWER.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.insertAfter(
                    Items.BIRCH_HANGING_SIGN.getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_SIGN_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    AspenGroveBlocks.ASPEN_SIGN_ITEM.get().getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_HANGING_SIGN_ITEM.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.BIRCH_SHELF.getDefaultInstance(),
                    AspenGroveBlocks.ASPEN_SHELF.get().asItem().getDefaultInstance(),
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
=======
import starman.aspengrove.AspenGrove;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AspenGroveCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AspenGrove.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ASPENGROVE_TAB =
            CREATIVE_MODE_TABS.register("aspengrove", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.aspengrove"))
                    .icon(() -> new ItemStack(AspenGroveBlocks.ASPEN_LOG.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_LOG.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_WOOD.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.STRIPPED_ASPEN_LOG.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.STRIPPED_ASPEN_WOOD.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_PLANKS.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_STAIRS.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_SLAB.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_FENCE.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_FENCE_GATE.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_DOOR.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_TRAPDOOR.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_PRESSURE_PLATE.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_BUTTON.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_SIGN_ITEM.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_HANGING_SIGN_ITEM.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_SHELF.get()));
                        output.accept(new ItemStack(AspenGroveItems.ASPEN_BOAT.get()));
                        output.accept(new ItemStack(AspenGroveItems.ASPEN_CHEST_BOAT.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_LEAVES.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ASPEN_SAPLING.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.HONEYFLOWER.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ORANGE_MUSHROOM.get()));
                        output.accept(new ItemStack(AspenGroveBlocks.ORANGE_MUSHROOM_BLOCK.get()));
                        output.accept(new ItemStack(AspenGroveItems.BOUQUET.get()));
                    }).build());

    public static void init(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
    }
}