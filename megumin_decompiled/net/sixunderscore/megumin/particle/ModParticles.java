/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry
 *  net.fabricmc.fabric.api.particle.v1.FabricParticleTypes
 *  net.minecraft.class_2378
 *  net.minecraft.class_2396
 *  net.minecraft.class_2400
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
 */
package net.sixunderscore.megumin.particle;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.class_2378;
import net.minecraft.class_2396;
import net.minecraft.class_2400;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.sixunderscore.megumin.Megumin;
import net.sixunderscore.megumin.particle.custom.StarParticle;

public class ModParticles {
    public static final class_2400 STAR_PARTICLE = FabricParticleTypes.simple();

    public static void register() {
        Megumin.LOGGER.info("Registering particles for: megumin");
        class_2378.method_10230((class_2378)class_7923.field_41180, (class_2960)class_2960.method_60655((String)"megumin", (String)"star_particle"), (Object)STAR_PARTICLE);
    }

    public static void registerClient() {
        Megumin.LOGGER.info("Registering client-side particles for: megumin");
        ParticleFactoryRegistry.getInstance().register((class_2396)STAR_PARTICLE, StarParticle.Factory::new);
    }
}
