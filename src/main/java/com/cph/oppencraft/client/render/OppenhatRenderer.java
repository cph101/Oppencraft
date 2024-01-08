package com.cph.oppencraft.client.render;

import com.cph.oppencraft.item.oppenhat.Oppenhat;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3f;

public class OppenhatRenderer<T extends PlayerEntity, M extends PlayerEntityModel<T>> extends FeatureRenderer<T, M> {

    public OppenhatRenderer(FeatureRendererContext<T, M> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, PlayerEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        ItemStack stack = entity.getEquippedStack(EquipmentSlot.HEAD);
        var biped = this.getContextModel();

        if(stack.getItem() instanceof Oppenhat hat) {
            ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
            double height = hat.getHeight();
            float size = hat.getSize() * 0.86F;


            matrices.push();
            biped.head.rotate(matrices);
            // set position
            matrices.translate(-0.01D, -(height + 0.88D), 0.05D);
            // set size
            matrices.scale(size, size * 0.9F, size);
            // set rotation
            matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-183.99F));
            matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(0.13F));
            matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(2F));

            String modelId = "oppencraft:oppenhat#inventory";
            itemRenderer.renderItem(stack, ModelTransformation.Mode.NONE, false, matrices, vertexConsumers, light, OverlayTexture.DEFAULT_UV, itemRenderer.getModels().getModelManager().getModel(new ModelIdentifier(modelId)));
            matrices.pop();
        }
    }

}
