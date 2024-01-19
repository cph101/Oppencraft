package com.cph.oppencraft.init;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public interface ModSoundEvents {
    Map<SoundEvent, Identifier> SOUND_EVENTS = new LinkedHashMap<>();
    SoundEvent NUKE = createSoundEvent("entity.nuke");

    static void initialize() {
        SOUND_EVENTS.keySet().forEach(soundEvent -> Registry.register(Registry.SOUND_EVENT, SOUND_EVENTS.get(soundEvent), soundEvent));
    }

    private static SoundEvent createSoundEvent(String path) {
        SoundEvent soundEvent = new SoundEvent(new Identifier("explosiveideas", path));
        SOUND_EVENTS.put(soundEvent, new Identifier("explosiveideas", path));
        return soundEvent;
    }
}

