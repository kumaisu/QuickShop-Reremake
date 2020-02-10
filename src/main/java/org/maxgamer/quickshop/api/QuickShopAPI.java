package org.maxgamer.quickshop.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.maxgamer.quickshop.Shop;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public final class QuickShopAPI {

    private QuickShopAPI() {
    }

    @NotNull
    public Optional<Shop> getShopByUUID(@NotNull UUID uuid) {
        return Optional.empty();
    }

    @NotNull
    public List<Shop> getShopsOf(@NotNull Player player) {
        return Collections.emptyList();
    }

    @NotNull
    public List<Shop> getShops() {
        return Collections.emptyList();
    }

}
