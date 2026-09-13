package starman.aspengrove.classes.client;

import starman.aspengrove.classes.*;
<<<<<<< HEAD
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.sprite.SpriteId;
import net.minecraft.resources.Identifier;

import java.util.List;

=======

import java.util.List;

import net.fabricmc.api.*;
import net.fabricmc.fabric.api.client.rendering.v1.*;

import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
public class AspenGroveClient implements ClientModInitializer {
    public static final String MOD_ID = "aspengrove";

    public static final ModelLayerLocation ASPEN_BOAT = register("boat/aspen");
    public static final ModelLayerLocation ASPEN_CHEST_BOAT = register("chest_boat/aspen");

    private static ModelLayerLocation register(String name) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(MOD_ID, name), "main");
    }

    @Override
    public void onInitializeClient() {
        BlockColorRegistry.register(
<<<<<<< HEAD
                List.of(BlockTintSources.grass()),
=======
                List.of(BlockTintSources.foliage()),
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
                AspenGroveBlocks.HONEYFLOWER
        );

        ModelLayerRegistry.registerModelLayer(ASPEN_BOAT, BoatModel::createBoatModel);
        ModelLayerRegistry.registerModelLayer(ASPEN_CHEST_BOAT, BoatModel::createChestBoatModel);

        EntityRendererRegistry.register(AspenGroveEntities.ASPEN_BOAT, context ->
                new AspenBoatRenderer(context, ASPEN_BOAT, "aspen", false)
        );

        EntityRendererRegistry.register(AspenGroveEntities.ASPEN_CHEST_BOAT, context ->
                new AspenBoatRenderer(context, ASPEN_CHEST_BOAT, "aspen", true)
        );
<<<<<<< HEAD

        SpriteId signMaterial = new SpriteId(
                Sheets.SIGN_SHEET,
                Identifier.fromNamespaceAndPath(MOD_ID, "entity/signs/aspen")
        );

        SpriteId hangingSignMaterial = new SpriteId(
                Sheets.SIGN_SHEET,
                Identifier.fromNamespaceAndPath(MOD_ID, "entity/signs/hanging/aspen")
        );

        Sheets.SIGN_SPRITES.put(AspenGroveWoodTypes.ASPEN, signMaterial);
        Sheets.HANGING_SIGN_SPRITES.put(AspenGroveWoodTypes.ASPEN, hangingSignMaterial);
=======
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
    }
}