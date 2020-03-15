package io.dubois.command.firstgroup;

import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class StrikeCommand extends SimpleSubCommand {

	public StrikeCommand(final SimpleCommandGroup parent) {
		super(parent, "strike|s");

		setMinArguments(1);
		setUsage("<target>");
	}

	@Override
	protected void onCommand() {
		final Player target = findPlayer(args[0]);
		target.getWorld().strikeLightning(target.getLocation());
		tell("&bYou just struck " + target.getName() + " &bwith lightning!");
	}
}
