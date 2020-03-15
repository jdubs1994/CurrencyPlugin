package io.dubois.command;

import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;

public class FireworkCommand extends SimpleCommand {

	public FireworkCommand() {
		super("firework");
	}

	@Override
	protected void onCommand() {
		checkConsole();

		final Player player = getPlayer();
		player.getWorld().spawn(player.getLocation(), Firework.class);

		tell("GET REKT M8");
	}

}
