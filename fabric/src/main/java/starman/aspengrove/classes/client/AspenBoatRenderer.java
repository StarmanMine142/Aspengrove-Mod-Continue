package starman.aspengrove.classes.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
<<<<<<< HEAD
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;
=======
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.*;
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59

public class AspenBoatRenderer extends BoatRenderer {
    private final Identifier customTexture;

    public AspenBoatRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayerLocation, String name, boolean isChest) {
        super(context, modelLayerLocation);
        String folder = isChest ? "chest_boat" : "boat";
        this.customTexture = Identifier.fromNamespaceAndPath("aspengrove", "textures/entity/" + folder + "/" + name + ".png");
    }

<<<<<<< HEAD
    protected net.minecraft.client.renderer.rendertype.RenderType renderType() {
=======
    protected RenderType renderType() {
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
        return this.model().renderType(this.customTexture);
    }
}