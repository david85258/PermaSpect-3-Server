package net.perma.permaspect;

import org.bukkit.Location;

import java.util.Optional;

public abstract class MethodOverride {

    private static MethodOverride instance;

    public MethodOverride() {
        if (instance != null) instance = this;
        else throw new IllegalStateException("Already initialized");
    }

    public static MethodOverride getInstance() {
        return instance;
    }

    public abstract Optional<Boolean> Monsters_isDarkEnoughToSpawn(Location location);
}
