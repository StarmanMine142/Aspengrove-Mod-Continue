package starman.aspengrove.classes.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
<<<<<<< HEAD
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(Dist.CLIENT)
=======

@OnlyIn(Dist.CLIENT)
>>>>>>> 098d3ae4f0b055d0f25c44ad42a7ad4718b18e59
public class AspenBoatRenderer extends BoatRenderer {
    public AspenBoatRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayer) {
        super(context, modelLayer);
    }
}