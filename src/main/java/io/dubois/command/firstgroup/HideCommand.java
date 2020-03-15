package io.dubois.command.firstgroup;

import io.dubois.plugin.CurrencyPlugin;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class HideCommand extends SimpleSubCommand {

	public HideCommand(final SimpleCommandGroup parent) {
		super(parent, "hide|h");

		setMinArguments(1);
		setUsage("<target>");
	}

	@Override
	protected void onCommand() {
		final Player target = findPlayer(args[0]);
		checkConsole();
		if(target.canSee(getPlayer())) {
			target.hidePlayer(CurrencyPlugin.getInstance(), getPlayer());
			tell("");
		} else
			target.showPlayer(CurrencyPlugin.getInstance(), getPlayer());
	}
}
