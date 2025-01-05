package com.example.plugin.template.command;

import com.marcusslover.plus.lib.color.Color;
import com.marcusslover.plus.lib.command.Command;
import com.marcusslover.plus.lib.command.CommandContext;
import com.marcusslover.plus.lib.command.ICommand;
import com.marcusslover.plus.lib.command.TabCompleteContext;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Command(name="ping", description="just a simple ping command", permission="plugin.template.command.ping")
public class PingCommand implements ICommand {
	@Override
	public boolean execute(@NotNull CommandContext ctx) {
		Component message = Component.text("Pong!")
						.color(Color.of(200, 200, 200).adventure());

		ctx.sender().sendMessage(message);
		return false;
	}

	@Override
	public @NotNull List<@NotNull String> tab(@NotNull TabCompleteContext ctx) {
		return List.of("Hello", "World!");
	}
}
