/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_2400
 *  net.minecraft.class_3999
 *  net.minecraft.class_4002
 *  net.minecraft.class_4003
 *  net.minecraft.class_638
 *  net.minecraft.class_703
 *  net.minecraft.class_707
 */
package net.sixunderscore.megumin.particle.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2400;
import net.minecraft.class_3999;
import net.minecraft.class_4002;
import net.minecraft.class_4003;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_707;

public class StarParticle
extends class_4003 {
    protected StarParticle(class_638 level, double xCords, double yCords, double zCords, class_4002 spriteSet, double xd, double yd, double zd) {
        super(level, xCords, yCords, zCords, xd, yd, zd);
        this.field_28786 = 1.6f;
        this.field_3874 = xd;
        this.field_3854 = yd;
        this.field_3871 = zd;
        this.field_17867 = 0.75f;
        this.field_3847 = 20;
        this.method_18142(spriteSet);
    }

    public class_3999 method_18122() {
        return class_3999.field_17828;
    }

    @Environment(value=EnvType.CLIENT)
    public static class Factory
    implements class_707<class_2400> {
        private final class_4002 sprites;

        public Factory(class_4002 spriteSet) {
            this.sprites = spriteSet;
        }

        public class_703 createParticle(class_2400 particleType, class_638 level, double x, double y, double z, double dx, double dy, double dz) {
            return new StarParticle(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }
}
