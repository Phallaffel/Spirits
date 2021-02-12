package me.numin.spirits.ability.spirit.combo;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
public class PhaseDisabler implements Listener {

    @EventHandler
    public void onHandSwap(PlayerSwapHandItemsEvent e) {
        Player phasePlayer = e.getPlayer();
        Phase phase = new Phase(phasePlayer);
        phase.disablePhase();
        e.setCancelled(true);
    }
}
