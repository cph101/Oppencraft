package com.cph.oppencraft.mixin.client;

import com.cph.oppencraft.block.nuke_stand.NukeStandUtils;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ModelLoader.class)
public class ModelLoaderMixin {


    @Inject(method = "loadModelFromJson", at = @At(value = "INVOKE", target = "Lnet/minecraft/resource/ResourceManager;openAsReader(Lnet/minecraft/util/Identifier;)Ljava/io/BufferedReader;"), cancellable = true)
    public void loadModelFromJson(Identifier id, CallbackInfoReturnable<JsonUnbakedModel> cir) {
        String woodNamespace;
        String woodType;
        if (id.toString().contains("nuke_stand_")) {
            woodNamespace = id.getNamespace();
            woodType = id.getPath().split("ock/nuke_stand_")[1].replace(".json", "");
        } else if (id.toString().contains("_nuke_stand.json") && id.toString().contains("item")) {
            woodNamespace = id.getNamespace();
            woodType = id.getPath().split("item/")[1].replace("_nuke_stand.json", "");
        } else return;
        String modelJson = NukeStandUtils.generateNukeStandBlockModel(woodType, woodNamespace);
        JsonUnbakedModel model = JsonUnbakedModel.deserialize(modelJson);
        model.id = id.toString();
        cir.setReturnValue(model);
    }


}