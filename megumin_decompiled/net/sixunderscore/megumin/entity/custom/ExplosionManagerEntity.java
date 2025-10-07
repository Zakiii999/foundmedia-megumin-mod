/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1282
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_1937$class_7867
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2487
 *  net.minecraft.class_2940
 *  net.minecraft.class_2941
 *  net.minecraft.class_2943
 *  net.minecraft.class_2945
 *  net.minecraft.class_2945$class_9222
 *  net.minecraft.class_3218
 *  net.minecraft.class_3419
 */
package net.sixunderscore.megumin.entity.custom;

import net.minecraft.class_1282;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2940;
import net.minecraft.class_2941;
import net.minecraft.class_2943;
import net.minecraft.class_2945;
import net.minecraft.class_3218;
import net.minecraft.class_3419;
import net.sixunderscore.megumin.entity.ModEntities;
import net.sixunderscore.megumin.entity.custom.ExplosionBlastEntity;
import net.sixunderscore.megumin.entity.custom.ExplosionRayEntity;
import net.sixunderscore.megumin.entity.custom.ExplosionRingEntity;
import net.sixunderscore.megumin.sound.ModSounds;

public class ExplosionManagerEntity
extends class_1297 {
    private static final class_2940<Integer> TIMER = class_2945.method_12791(ExplosionManagerEntity.class, (class_2941)class_2943.field_13327);
    private class_1657 user;
    private int explosionDepth;

    public ExplosionManagerEntity(class_1299<?> entityType, class_1937 world) {
        super(entityType, world);
    }

    public void setUser(class_1657 user) {
        this.user = user;
    }

    protected void method_5693(class_2945.class_9222 builder) {
        builder.method_56912(TIMER, (Object)0);
    }

    public void method_5749(class_2487 nbt) {
        this.field_6011.method_12778(TIMER, (Object)nbt.method_10550("Timer"));
    }

    public void method_5652(class_2487 nbt) {
        nbt.method_10569("Timer", ((Integer)this.field_6011.method_12789(TIMER)).intValue());
    }

    public void method_5773() {
        if (this.user != null) {
            switch ((Integer)this.field_6011.method_12789(TIMER)) {
                case 0: {
                    this.initializeDepth();
                    this.playAmbientSound();
                    this.spawnPlayerRing();
                    break;
                }
                case 20: {
                    this.spawnRing(80, 90, 130);
                    break;
                }
                case 30: {
                    this.spawnRing(30, 80, 120);
                    break;
                }
                case 40: {
                    this.spawnRing(40, 70, 110);
                    break;
                }
                case 50: {
                    this.spawnRing(50, 60, 100);
                    break;
                }
                case 60: {
                    this.spawnRing(40, 50, 90);
                    break;
                }
                case 70: {
                    this.spawnRing(30, 40, 80);
                    break;
                }
                case 140: {
                    this.spawnRay();
                    break;
                }
                case 145: {
                    this.spawnExplosionBlast();
                    break;
                }
                case 146: {
                    this.spawnExplosionRange(1, 6, 20);
                    break;
                }
                case 147: {
                    this.spawnExplosionRange(6, 12, 20);
                    break;
                }
                case 148: {
                    this.spawnExplosionRange(12, 18, 15);
                    break;
                }
                case 149: {
                    this.spawnExplosionRange(18, 24, 15);
                    break;
                }
                case 150: {
                    this.spawnExplosionRange(24, 30, 15);
                    break;
                }
                case 151: {
                    this.spawnExplosionRange(30, 36, 12);
                    break;
                }
                case 155: {
                    this.applyEffectsToUser();
                    this.method_31472();
                }
            }
            this.field_6011.method_12778(TIMER, (Object)((Integer)this.field_6011.method_12789(TIMER) + 1));
        }
        super.method_5773();
    }

    private void initializeDepth() {
        class_1937 world = this.method_37908();
        if (!world.field_9236) {
            class_2338 depth = this.method_24515();
            for (int i = 0; i <= 10; ++i) {
                if (!world.method_8320(depth.method_10087(i)).method_27852(class_2246.field_9987)) continue;
                this.explosionDepth = i;
                return;
            }
        }
        this.explosionDepth = 10;
    }

    private void playAmbientSound() {
        if (!this.method_37908().field_9236) {
            this.method_37908().method_8396(null, this.user.method_24515(), ModSounds.MAGIC_AMBIENT, class_3419.field_15250, 10.0f, 1.0f);
        }
    }

    private void spawnPlayerRing() {
        ExplosionRingEntity ring = new ExplosionRingEntity(ModEntities.EXPLOSION_RING, this.method_37908());
        ring.setUser(this.user, 0.3f);
        ring.setLifeSpan(150.0f);
        ring.method_5814(this.user.method_23317(), this.user.method_23318() + (double)0.3f, this.user.method_23321());
        this.method_37908().method_8649((class_1297)ring);
        if (!this.method_37908().field_9236) {
            this.method_37908().method_8396(null, this.user.method_24515(), ModSounds.MAGIC_RING, class_3419.field_15250, 25.0f, 1.0f);
        }
    }

    private void spawnRing(int size, int height, int ticks) {
        ExplosionRingEntity ring = new ExplosionRingEntity(ModEntities.EXPLOSION_RING, this.method_37908());
        ring.setMaxSize(size);
        ring.setLifeSpan(ticks);
        ring.method_5814(this.method_23317(), this.method_23318() + (double)height, this.method_23321());
        this.method_37908().method_8649((class_1297)ring);
        if (!this.method_37908().field_9236) {
            this.method_37908().method_8396(null, this.method_24515().method_10069(0, height, 0), ModSounds.MAGIC_RING, class_3419.field_15250, 25.0f, 1.0f);
        }
    }

    private void spawnRay() {
        ExplosionRayEntity ray = new ExplosionRayEntity(ModEntities.EXPLOSION_RAY, this.method_37908());
        ray.method_5814(this.method_23317(), this.method_23318() + 90.0, this.method_23321());
        this.method_37908().method_8649((class_1297)ray);
    }

    private void spawnExplosionBlast() {
        ExplosionBlastEntity blast = new ExplosionBlastEntity(ModEntities.EXPLOSION_BLAST, this.method_37908());
        blast.method_5814(this.method_23317(), this.method_23318(), this.method_23321());
        this.method_37908().method_8649((class_1297)blast);
        if (!this.method_37908().field_9236) {
            this.method_37908().method_8396(null, this.method_24515(), ModSounds.BIG_EXPLOSION, class_3419.field_15250, 35.0f, 1.0f);
        }
    }

    private void spawnExplosionRange(int startRange, int endRange, int power) {
        class_1937 world = this.method_37908();
        if (!world.field_9236) {
            for (int i = startRange; i <= endRange; ++i) {
                int zOffset;
                int xOffset;
                if (this.field_5974.method_43056()) {
                    xOffset = this.field_5974.method_43056() ? -i : i;
                    zOffset = this.field_5974.method_39332(-i, i);
                } else {
                    xOffset = this.field_5974.method_39332(-i, i);
                    zOffset = this.field_5974.method_43056() ? -i : i;
                }
                world.method_8537((class_1297)this.user, this.method_23317() + (double)xOffset, this.method_23318() - (double)this.explosionDepth, this.method_23321() + (double)zOffset, (float)power, false, class_1937.class_7867.field_40889);
            }
        }
        if (this.explosionDepth != 0) {
            this.explosionDepth -= 2;
        }
    }

    private void applyEffectsToUser() {
        if (!this.user.method_31549().field_7477 && !this.method_37908().field_9236) {
            this.user.method_6092(new class_1293(class_1294.field_5909, 1600, 3));
            this.user.method_6092(new class_1293(class_1294.field_5911, 1600, 2));
            this.user.method_6092(new class_1293(class_1294.field_5901, 1600, 2));
        }
    }

    public boolean method_64397(class_3218 world, class_1282 source, float amount) {
        return false;
    }

    public boolean method_5732() {
        return false;
    }
}
