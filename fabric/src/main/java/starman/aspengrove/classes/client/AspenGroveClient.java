package starman.aspengrove.classes.client;

import starman.aspengrove.AspenGrove;
import starman.aspengrove.classes.*;

import java.util.List;

import net.fabricmc.api.*;
import net.fabricmc.fabric.api.client.rendering.v1.*;

import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.core.registries.BuiltInClientRegistries;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
public class AspenGroveClient implements ClientModInitializer {

    public static final ModelLayerLocation ASPEN_BOAT = register("boat/aspen");
    public static final ModelLayerLocation ASPEN_CHEST_BOAT = register("chest_boat/aspen");

    private static ModelLayerLocation register(String name) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(AspenGrove.MOD_ID, name), "main");
    }

    @Override
    public void onInitializeClient() {
        BlockColorRegistry.register(
                List.of(BlockTintSources.foliage()),
                AspenGroveBlocks.HONEYFLOWER
        );

        ModelLayerRegistry.registerModelLayer(ASPEN_BOAT, BoatModel::createBoatModel);
        ModelLayerRegistry.registerModelLayer(ASPEN_CHEST_BOAT, BoatModel::createChestBoatModel);

        EntityRenderers.register(
                BuiltInClientRegistries.ENTITY_RENDERER,
                AspenGroveEntities.ASPEN_BOAT,
                context -> new AspenBoatRenderer(context, ASPEN_BOAT, "aspen", false)
        );

        EntityRenderers.register(
                BuiltInClientRegistries.ENTITY_RENDERER,
                AspenGroveEntities.ASPEN_CHEST_BOAT,
                context -> new AspenBoatRenderer(context, ASPEN_CHEST_BOAT, "aspen", true)
        );
    }
}