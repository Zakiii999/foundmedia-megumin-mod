/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2400
 *  net.minecraft.class_4002
 *  net.minecraft.class_638
 *  net.minecraft.class_703
 *  net.minecraft.class_707
 */
package net.sixunderscore.megumin.particle.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2400;
import net.minecraft.class_4002;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_707;
import net.sixunderscore.megumin.particle.custom.StarParticle;

@Environment(value=EnvType.CLIENT)
public static class StarParticle.Factory
implements class_707<class_2400> {
    private final class_4002 sprites;

    public StarParticle.Factory(class_4002 spriteSet) {
        this.sprites = spriteSet;
    }

    public class_703 createParticle(class_2400 particleType, class_638 level, double x, double y, double z, double dx, double dy, double dz) {
        return new StarParticle(level, x, y, z, this.sprites, dx, dy, dz);
    }
}
