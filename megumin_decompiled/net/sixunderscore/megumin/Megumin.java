/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ModInitializer
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.sixunderscore.megumin;

import net.fabricmc.api.ModInitializer;
import net.sixunderscore.megumin.item.ModItems;
import net.sixunderscore.megumin.particle.ModParticles;
import net.sixunderscore.megumin.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Megumin
implements ModInitializer {
    public static final String MOD_ID = "megumin";
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"megumin");

    public void onInitialize() {
        ModItems.load();
        ModParticles.register();
        ModSounds.register();
    }
}
