package com.cph.oppencraft.client.render;

import com.cph.oppencraft.Oppencraft;
import com.cph.oppencraft.client.OppencraftClient;
import com.cph.oppencraft.client.entities.NukeEntityModel;
import com.cph.oppencraft.entity.NukeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.util.Identifier;

public class NukeEntityRenderer extends MobEntityRenderer<NukeEntity, NukeEntityModel> {

    public NukeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new NukeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(NukeEntity entity) {
        return new Identifier(Oppencraft.MOD_ID, "textures/entity/nuke.png");
    }
}
