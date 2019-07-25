package org.maxgamer.quickshop.Event;

import lombok.*;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.*;
import org.maxgamer.quickshop.Shop.Shop;

/** Calling when shop price was changed, Can't cancel **/

public class ShopPriceChangedEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    @Getter private double newPrice;
    @Getter private double oldPrice;
    @Getter
    @NotNull
    private Shop shop;

    /**
     * Will call when shop price was changed.
     *
     * @param shop     Target shop
     * @param oldPrice The old shop price
     * @param newPrice The new shop price
     */
    public ShopPriceChangedEvent(@NotNull Shop shop, double oldPrice, double newPrice) {
        this.shop = shop;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    @NotNull
    public static HandlerList getHandlerList() {return handlers;}
    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
}