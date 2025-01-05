package com.example.plugin.template;

import com.example.plugin.template.command.PingCommand;
import com.example.plugin.template.listener.PlayerListener;
import com.marcusslover.plus.lib.command.CommandManager;
import com.marcusslover.plus.lib.events.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	private CommandManager commandManager;
	private EventHandler eventHandler;

	@Override
	public void onEnable() {
		// Register commands
		commandManager = new CommandManager(this);
		commandManager.register(new PingCommand());

		// Register listener
		eventHandler = EventHandler.get().register(this);
		eventHandler.subscribe(new PlayerListener());
	}

	@Override
	public void onDisable() {
		commandManager.clearCommands();
	}
}
