/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1299$class_1300
 *  net.minecraft.class_1311
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_5321
 *  net.minecraft.class_7923
 *  net.minecraft.class_7924
 */
package net.sixunderscore.megumin.entity;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1311;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_7923;
import net.minecraft.class_7924;
import net.sixunderscore.megumin.Megumin;
import net.sixunderscore.megumin.entity.custom.ExplosionBlastEntity;
import net.sixunderscore.megumin.entity.custom.ExplosionManagerEntity;
import net.sixunderscore.megumin.entity.custom.ExplosionRayEntity;
import net.sixunderscore.megumin.entity.custom.ExplosionRingEntity;
import net.sixunderscore.megumin.entity.renderer.ExplosionBlastEntityRenderer;
import net.sixunderscore.megumin.entity.renderer.ExplosionManagerEntityRenderer;
import net.sixunderscore.megumin.entity.renderer.ExplosionRayEntityRenderer;
import net.sixunderscore.megumin.entity.renderer.ExplosionRingEntityRenderer;

public class ModEntities {
    public static final class_1299<ExplosionRingEntity> EXPLOSION_RING = ModEntities.register("explosion_ring", class_1299.class_1300.method_5903(ExplosionRingEntity::new, (class_1311)class_1311.field_17715).method_63006().method_17687(0.5f, 0.5f));
    public static final class_1299<ExplosionRayEntity> EXPLOSION_RAY = ModEntities.register("explosion_ray", class_1299.class_1300.method_5903(ExplosionRayEntity::new, (class_1311)class_1311.field_17715).method_63006().method_17687(0.5f, 0.5f));
    public static final class_1299<ExplosionBlastEntity> EXPLOSION_BLAST = ModEntities.register("explosion_blast", class_1299.class_1300.method_5903(ExplosionBlastEntity::new, (class_1311)class_1311.field_17715).method_63006().method_17687(0.5f, 0.5f));
    public static final class_1299<ExplosionManagerEntity> EXPLOSION_MANAGER = ModEntities.register("explosion_manager", class_1299.class_1300.method_5903(ExplosionManagerEntity::new, (class_1311)class_1311.field_17715).method_63006().method_17687(0.5f, 0.5f));

    private static <T extends class_1297> class_1299<T> register(String id, class_1299.class_1300<T> type) {
        return ModEntities.register(class_5321.method_29179((class_5321)class_7924.field_41266, (class_2960)class_2960.method_60656((String)id)), type);
    }

    private static <T extends class_1297> class_1299<T> register(class_5321<class_1299<?>> key, class_1299.class_1300<T> type) {
        return (class_1299)class_2378.method_39197((class_2378)class_7923.field_41177, key, (Object)type.method_5905(key));
    }

    public static void registerRenderers() {
        Megumin.LOGGER.info("Registering renderers for: megumin");
        EntityRendererRegistry.register(EXPLOSION_RING, ExplosionRingEntityRenderer::new);
        EntityRendererRegistry.register(EXPLOSION_RAY, ExplosionRayEntityRenderer::new);
        EntityRendererRegistry.register(EXPLOSION_BLAST, ExplosionBlastEntityRenderer::new);
        EntityRendererRegistry.register(EXPLOSION_MANAGER, ExplosionManagerEntityRenderer::new);
    }
}
