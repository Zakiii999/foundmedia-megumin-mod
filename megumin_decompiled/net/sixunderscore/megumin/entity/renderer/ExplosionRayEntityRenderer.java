/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10017
 *  net.minecraft.class_1297
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4604
 *  net.minecraft.class_4608
 *  net.minecraft.class_5617$class_5618
 *  net.minecraft.class_897
 *  org.joml.Quaternionf
 */
package net.sixunderscore.megumin.entity.renderer;

import java.util.Objects;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4604;
import net.minecraft.class_4608;
import net.minecraft.class_5617;
import net.minecraft.class_897;
import net.sixunderscore.megumin.entity.custom.ExplosionRayEntity;
import net.sixunderscore.megumin.entity.renderstates.SimpleExplosionVisualRenderState;
import org.joml.Quaternionf;

public class ExplosionRayEntityRenderer
extends class_897<ExplosionRayEntity, SimpleExplosionVisualRenderState> {
    private static final class_2960 TEXTURE = class_2960.method_60655((String)"megumin", (String)"textures/entity/explosion_ray.png");
    private static final class_1921 LAYER = class_1921.method_23580((class_2960)TEXTURE);

    public ExplosionRayEntityRenderer(class_5617.class_5618 ctx) {
        super(ctx);
    }

    public void render(SimpleExplosionVisualRenderState state, class_4587 matrixStack, class_4597 vertexConsumerProvider, int light) {
        matrixStack.method_22903();
        Quaternionf playerQuaternion = this.field_4676.method_24197();
        playerQuaternion.x = 0.0f;
        playerQuaternion.z = 0.0f;
        matrixStack.method_22907(playerQuaternion);
        class_4587.class_4665 entry = matrixStack.method_23760();
        class_4588 vertexConsumer = vertexConsumerProvider.getBuffer(LAYER);
        float size = state.size;
        this.produceVertex(vertexConsumer, entry, -1.5f, size, 0, 1);
        this.produceVertex(vertexConsumer, entry, 1.5f, size, 1, 1);
        this.produceVertex(vertexConsumer, entry, 1.5f, 0.0f, 1, 0);
        this.produceVertex(vertexConsumer, entry, -1.5f, 0.0f, 0, 0);
        matrixStack.method_22909();
        super.method_3936((class_10017)state, matrixStack, vertexConsumerProvider, light);
    }

    private void produceVertex(class_4588 vertexConsumer, class_4587.class_4665 matrix, float x, float y, int textureU, int textureV) {
        vertexConsumer.method_56824(matrix, x, y, 0.0f).method_39415(-1).method_22913((float)textureU, (float)textureV).method_22922(class_4608.field_21444).method_60803(0xF000F0).method_60831(matrix, 0.0f, 1.0f, 0.0f);
    }

    public void updateRenderState(ExplosionRayEntity entity, SimpleExplosionVisualRenderState state, float tickDelta) {
        super.method_62354((class_1297)entity, (class_10017)state, tickDelta);
        float elapsedTime = (float)entity.age + tickDelta;
        Objects.requireNonNull(entity);
        float delta = Math.min(elapsedTime / 7.0f, 1.0f);
        state.size = class_3532.method_48781((float)delta, (int)0, (int)-100);
    }

    public boolean shouldRender(ExplosionRayEntity entity, class_4604 frustum, double x, double y, double z) {
        return frustum.method_23093(this.method_62358(entity).method_1014(0.5));
    }

    public SimpleExplosionVisualRenderState createRenderState() {
        return new SimpleExplosionVisualRenderState();
    }
}
