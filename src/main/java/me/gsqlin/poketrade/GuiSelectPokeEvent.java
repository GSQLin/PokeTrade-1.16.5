package me.gsqlin.poketrade;

import com.pixelmonmod.pixelmon.api.pokemon.Pokemon;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GuiSelectPokeEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Pokemon pokemon;
    private Boolean cancelled = false;
    private final Player player;

    public GuiSelectPokeEvent(Player player,Pokemon pokemon){
        this.pokemon = pokemon;
        this.player = player;
    }

    public Pokemon getPokemon(){
        return this.pokemon;
    }
    public Player getPlayer(){
        return this.player;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
