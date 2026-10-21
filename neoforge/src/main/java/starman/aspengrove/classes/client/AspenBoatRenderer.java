package starman.aspengrove.classes.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.*;

@EventBusSubscriber(Dist.CLIENT)
public class AspenBoatRenderer extends BoatRenderer {
    public AspenBoatRenderer(EntityRendererProvider.Context context, ModelLayerLocation modelLayer) {
        super(context, modelLayer);
    }
}