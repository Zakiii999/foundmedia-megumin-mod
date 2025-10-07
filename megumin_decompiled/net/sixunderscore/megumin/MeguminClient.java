/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 */
package net.sixunderscore.megumin;

import net.fabricmc.api.ClientModInitializer;
import net.sixunderscore.megumin.entity.ModEntities;
import net.sixunderscore.megumin.particle.ModParticles;

public class MeguminClient
implements ClientModInitializer {
    public void onInitializeClient() {
        ModEntities.registerRenderers();
        ModParticles.registerClient();
    }
}
