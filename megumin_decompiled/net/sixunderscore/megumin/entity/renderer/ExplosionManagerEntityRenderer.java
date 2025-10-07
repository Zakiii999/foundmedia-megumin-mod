/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_10017
 *  net.minecraft.class_5617$class_5618
 *  net.minecraft.class_897
 */
package net.sixunderscore.megumin.entity.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10017;
import net.minecraft.class_5617;
import net.minecraft.class_897;
import net.sixunderscore.megumin.entity.custom.ExplosionManagerEntity;

@Environment(value=EnvType.CLIENT)
public class ExplosionManagerEntityRenderer
extends class_897<ExplosionManagerEntity, class_10017> {
    public ExplosionManagerEntityRenderer(class_5617.class_5618 ctx) {
        super(ctx);
    }

    public class_10017 method_55269() {
        return new class_10017();
    }
}
