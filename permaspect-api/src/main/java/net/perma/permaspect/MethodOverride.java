package net.perma.permaspect;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public abstract class MethodOverride {

    private static MethodOverride instance;

    public MethodOverride() {
        if (instance == null) instance = this;
        else throw new IllegalStateException("Already initialized");
    }

    public static @NotNull MethodOverride getInstance() {
        return instance;
    }

    public abstract @Nullable Optional<Boolean> Monsters_isDarkEnoughToSpawn(@NotNull Location location);

    public abstract @Nullable Optional<Boolean> PathfinderMob_checkSpawnRules(@NotNull Entity entity, @NotNull Location location);
}
