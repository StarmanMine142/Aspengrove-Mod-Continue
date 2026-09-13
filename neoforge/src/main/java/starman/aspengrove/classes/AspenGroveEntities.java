package starman.aspengrove.classes;

import starman.aspengrove.AspenGrove;
import starman.aspengrove.classes.boats.AspenGroveBoatEntity;
import starman.aspengrove.classes.boats.AspenGroveChestBoatEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class AspenGroveEntities {
    public static EntityType<AspenGroveBoatEntity> ASPEN_BOAT;
    public static EntityType<AspenGroveChestBoatEntity> ASPEN_CHEST_BOAT;

    public static void initialize() {
        ASPEN_BOAT = register("aspen_boat",
                EntityType.Builder.<AspenGroveBoatEntity>of(AspenGroveBoatEntity::new, MobCategory.MISC)
                        .sized(1.375F, 0.5625F)
                        .clientTrackingRange(10));

        ASPEN_CHEST_BOAT = register("aspen_chest_boat",
                EntityType.Builder.<AspenGroveChestBoatEntity>of(AspenGroveChestBoatEntity::new, MobCategory.MISC)
                        .sized(1.375F, 0.5625F)
                        .clientTrackingRange(10));
    }

    private static <T extends net.minecraft.world.entity.Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(AspenGrove.MOD_ID, name);
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, id, builder.build(id.toString()));
    }
}