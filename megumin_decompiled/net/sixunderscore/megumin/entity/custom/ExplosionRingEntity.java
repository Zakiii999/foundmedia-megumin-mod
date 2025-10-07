/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1282
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_2394
 *  net.minecraft.class_2487
 *  net.minecraft.class_2940
 *  net.minecraft.class_2941
 *  net.minecraft.class_2943
 *  net.minecraft.class_2945
 *  net.minecraft.class_2945$class_9222
 *  net.minecraft.class_3218
 */
package net.sixunderscore.megumin.entity.custom;

import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2394;
import net.minecraft.class_2487;
import net.minecraft.class_2940;
import net.minecraft.class_2941;
import net.minecraft.class_2943;
import net.minecraft.class_2945;
import net.minecraft.class_3218;
import net.sixunderscore.megumin.particle.ModParticles;

public class ExplosionRingEntity
extends class_1297 {
    private static final class_2940<Float> MAX_SIZE = class_2945.method_12791(ExplosionRingEntity.class, (class_2941)class_2943.field_13320);
    private static final class_2940<Float> LIFESPAN = class_2945.method_12791(ExplosionRingEntity.class, (class_2941)class_2943.field_13320);
    public final int ANIMATION_TICKS = 7;
    public int age;
    private class_1657 user;
    private float userYOffset;

    public ExplosionRingEntity(class_1299<?> type, class_1937 world) {
        super(type, world);
    }

    protected void method_5693(class_2945.class_9222 builder) {
        builder.method_56912(MAX_SIZE, (Object)Float.valueOf(5.0f));
        builder.method_56912(LIFESPAN, (Object)Float.valueOf(100.0f));
    }

    public void method_5652(class_2487 nbt) {
        nbt.method_10548("MaxSize", ((Float)this.field_6011.method_12789(MAX_SIZE)).floatValue());
        nbt.method_10548("LifeSpan", ((Float)this.field_6011.method_12789(LIFESPAN)).floatValue());
    }

    public void method_5749(class_2487 nbt) {
        this.field_6011.method_12778(MAX_SIZE, (Object)Float.valueOf(nbt.method_10583("MaxSize")));
        this.field_6011.method_12778(LIFESPAN, (Object)Float.valueOf(nbt.method_10583("LifeSpan")));
    }

    public void method_5773() {
        if ((float)this.age >= ((Float)this.field_6011.method_12789(LIFESPAN)).floatValue()) {
            this.method_31472();
        }
        if (this.user != null) {
            this.method_5814(this.user.method_23317(), this.user.method_23318() + (double)this.userYOffset, this.user.method_23321());
            class_1937 class_19372 = this.method_37908();
            if (class_19372 instanceof class_3218) {
                class_3218 serverWorld = (class_3218)class_19372;
                serverWorld.method_65096((class_2394)ModParticles.STAR_PARTICLE, this.user.method_23317() + this.field_5974.method_43059(), this.user.method_23318(), this.user.method_23321() + this.field_5974.method_43059(), 2, 0.0, 0.0, 0.0, 1.0);
            }
        }
        ++this.age;
        super.method_5773();
    }

    public float getMaxSize() {
        return ((Float)this.field_6011.method_12789(MAX_SIZE)).floatValue();
    }

    public void setMaxSize(float size) {
        this.field_6011.method_12778(MAX_SIZE, (Object)Float.valueOf(size));
    }

    public float getLifeSpan() {
        return ((Float)this.field_6011.method_12789(LIFESPAN)).floatValue();
    }

    public void setLifeSpan(float ticks) {
        this.field_6011.method_12778(LIFESPAN, (Object)Float.valueOf(ticks));
    }

    public void setUser(class_1657 user, float yOffset) {
        this.user = user;
        this.userYOffset = yOffset;
    }

    public boolean method_64397(class_3218 world, class_1282 source, float amount) {
        return false;
    }

    public boolean method_5732() {
        return false;
    }
}
