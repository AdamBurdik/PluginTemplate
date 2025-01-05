package com.example.plugin.template.listener;

import com.marcusslover.plus.lib.events.EventListener;
import com.marcusslover.plus.lib.events.annotations.Event;
import net.kyori.adventure.text.Component;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerListener implements EventListener {
	@Event
	public void onPlayerJoin(PlayerJoinEvent event) {
		Component message = Component.text("Welcome " + event.getPlayer().getName());
		event.joinMessage(message);
	}
}
