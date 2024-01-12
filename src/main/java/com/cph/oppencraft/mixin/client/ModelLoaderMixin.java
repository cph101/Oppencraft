package com.cph.oppencraft.mixin.client;

import com.cph.oppencraft.block.NukeStandUtils;

@Mixin(ModelLoader.class)
public class ModelLoaderMixin {
 
    @Inject(method = "loadModelFromJson", at = @At(value = "INVOKE", target = "Lnet/minecraft/resource/ResourceManager;getResource(Lnet/minecraft/util/Identifier;)Lnet/minecraft/resource/Resource;"), cancellable = true)
    public void loadModelFromJson(Identifier id, CallbackInfoReturnable<JsonUnbakedModel> cir) {

        if (id.toString().contains("_nuke_stand") {
            String woodNamespace = id.toString().split(":")[0];
            String woodType = id.toString().split(woodNamespace + ":")[0].split("_")[0];
            String modelJson = NukeStandUtils.generateNukeStandModel(woodType, woodNamespace);
            JsonUnbakedModel model = JsonUnbakedModel.deserialize(modelJson);
            model.id = id.toString();
            cir.setReturnValue(model);
        } else return;
    }
}