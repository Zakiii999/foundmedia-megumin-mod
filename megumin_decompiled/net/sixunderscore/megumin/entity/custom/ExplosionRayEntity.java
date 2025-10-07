/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1282
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1937
 *  net.minecraft.class_2487
 *  net.minecraft.class_2945$class_9222
 *  net.minecraft.class_3218
 */
package net.sixunderscore.megumin.entity.custom;

import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1937;
import net.minecraft.class_2487;
import net.minecraft.class_2945;
import net.minecraft.class_3218;

public class ExplosionRayEntity
extends class_1297 {
    public int age;
    public final int ANIMATION_TICKS = 7;

    public ExplosionRayEntity(class_1299<?> type, class_1937 world) {
        super(type, world);
    }

    protected void method_5693(class_2945.class_9222 builder) {
    }

    protected void method_5749(class_2487 nbt) {
    }

    protected void method_5652(class_2487 nbt) {
    }

    public void method_5773() {
        if (this.age >= 7) {
            this.method_31472();
        }
        ++this.age;
        super.method_5773();
    }

    public boolean method_64397(class_3218 world, class_1282 source, float amount) {
        return false;
    }

    public boolean method_5732() {
        return false;
    }
}
