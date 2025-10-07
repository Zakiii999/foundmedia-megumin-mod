/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1792$class_1793
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 */
package net.sixunderscore.megumin.item.custom;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.sixunderscore.megumin.entity.ModEntities;
import net.sixunderscore.megumin.entity.custom.ExplosionManagerEntity;

public class MeguminStaffItem
extends class_1792 {
    public MeguminStaffItem(class_1792.class_1793 settings) {
        super(settings);
    }

    public class_1269 method_7836(class_1937 world, class_1657 user, class_1268 hand) {
        class_243 cameraVec;
        class_3965 result;
        class_1799 stack = user.method_5998(hand);
        if (!user.method_7357().method_7904(stack) && (result = world.method_17742(new class_3959(cameraVec = user.method_5836(1.0f), cameraVec.method_1019(user.method_5828(1.0f).method_1021(800.0)), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)user))).method_17783() == class_239.class_240.field_1332) {
            class_243 hitPos = result.method_17784();
            if (!world.field_9236) {
                ExplosionManagerEntity explosionManager = new ExplosionManagerEntity(ModEntities.EXPLOSION_MANAGER, world);
                explosionManager.setUser(user);
                explosionManager.method_33574(hitPos);
                world.method_8649((class_1297)explosionManager);
                if (!user.method_31549().field_7477) {
                    stack.method_7970(1, (class_1309)user, class_1304.field_6173);
                }
            }
            if (user.method_31549().field_7477) {
                user.method_7357().method_62835(stack, 200);
            } else {
                user.method_7357().method_62835(stack, 1200);
            }
            return class_1269.field_5812;
        }
        return class_1269.field_5814;
    }
}
