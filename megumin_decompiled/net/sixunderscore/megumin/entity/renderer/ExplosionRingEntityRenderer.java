/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
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
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
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
import net.sixunderscore.megumin.entity.custom.ExplosionRingEntity;
import net.sixunderscore.megumin.entity.renderstates.ExplosionRingEntityRenderState;
import org.joml.Quaternionf;

@Environment(value=EnvType.CLIENT)
public class ExplosionRingEntityRenderer
extends class_897<ExplosionRingEntity, ExplosionRingEntityRenderState> {
    private static final class_2960 TEXTURE = class_2960.method_60655((String)"megumin", (String)"textures/entity/explosion_ring.png");
    private static final class_1921 LAYER = class_1921.method_23580((class_2960)TEXTURE);

    public ExplosionRingEntityRenderer(class_5617.class_5618 ctx) {
        super(ctx);
    }

    public void render(ExplosionRingEntityRenderState state, class_4587 matrixStack, class_4597 vertexConsumerProvider, int light) {
        matrixStack.method_22903();
        float size = state.size;
        matrixStack.method_22905(size, size, size);
        matrixStack.method_22907(new Quaternionf().rotateY(state.rotation));
        class_4587.class_4665 entry = matrixStack.method_23760();
        class_4588 vertexConsumer = vertexConsumerProvider.getBuffer(LAYER);
        this.produceVertex(vertexConsumer, entry, -0.5f, -0.5f, 0, 1);
        this.produceVertex(vertexConsumer, entry, -0.5f, 0.5f, 1, 1);
        this.produceVertex(vertexConsumer, entry, 0.5f, 0.5f, 1, 0);
        this.produceVertex(vertexConsumer, entry, 0.5f, -0.5f, 0, 0);
        matrixStack.method_22909();
        super.method_3936((class_10017)state, matrixStack, vertexConsumerProvider, light);
    }

    private void produceVertex(class_4588 vertexConsumer, class_4587.class_4665 matrix, float x, float z, int textureU, int textureV) {
        vertexConsumer.method_56824(matrix, x, 0.0f, z).method_39415(-1).method_22913((float)textureU, (float)textureV).method_22922(class_4608.field_21444).method_60803(0xF000F0).method_60831(matrix, 0.0f, 1.0f, 0.0f);
    }

    public void updateRenderState(ExplosionRingEntity entity, ExplosionRingEntityRenderState state, float tickDelta) {
        super.method_62354((class_1297)entity, (class_10017)state, tickDelta);
        float maxSize = entity.getMaxSize();
        float entityLifeSpan = entity.getLifeSpan();
        Objects.requireNonNull(entity);
        float animationTicks = 7.0f;
        if ((float)entity.age < animationTicks) {
            float elapsedTime = (float)entity.age + tickDelta;
            float delta = Math.min(elapsedTime / animationTicks, 1.0f);
            state.size = class_3532.method_16439((float)delta, (float)0.0f, (float)maxSize);
        } else if ((float)entity.age > entityLifeSpan - animationTicks) {
            float elapsedTime = (float)entity.age + tickDelta - (entityLifeSpan - animationTicks);
            float delta = Math.min(elapsedTime / animationTicks, 1.0f);
            state.size = class_3532.method_16439((float)delta, (float)maxSize, (float)0.0f);
        } else {
            state.size = maxSize;
        }
        state.rotation = ((float)entity.age + tickDelta) * 0.2f;
    }

    public boolean shouldRender(ExplosionRingEntity entity, class_4604 frustum, double x, double y, double z) {
        return frustum.method_23093(this.method_62358(entity).method_1014((double)entity.getMaxSize()));
    }

    public ExplosionRingEntityRenderState createRenderState() {
        return new ExplosionRingEntityRenderState();
    }
}
