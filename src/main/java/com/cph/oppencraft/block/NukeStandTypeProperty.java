package com.cph.oppencraft.block;

import net.minecraft.util.StringIdentifiable;

public enum NukeStandTypeProperty implements StringIdentifiable {
    CENTER("center"),
    RIGHT("right"),
    LEFT("left");

    private final String name;

    private NukeStandTypeProperty(String name) {
        this.name = name;
    }

    public String asString() {
        return this.name;
    }

}
