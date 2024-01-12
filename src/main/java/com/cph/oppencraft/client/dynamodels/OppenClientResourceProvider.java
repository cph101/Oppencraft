package com.cph.oppencraft.client.dynamodels;

import net.mehvahdjukaar.moonlight.api.resources.pack.DynamicResourcePack;
import net.minecraft.resource.ResourceType;
import net.minecraft.resource.pack.ResourcePackProfile;
import net.minecraft.util.Identifier;

public class OppenClientResourceProvider extends DynamicResourcePack {

    protected OppenClientResourceProvider(Identifier name, ResourceType type) {
        super(name, type, ResourcePackProfile.InsertionPosition.TOP, true, true);
    }
}
