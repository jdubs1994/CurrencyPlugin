package io.dubois.command.firstgroup;

import org.mineacademy.fo.command.SimpleCommandGroup;

public class FirstCommandGroup extends SimpleCommandGroup {

	@Override
	protected void registerSubcommands() {

		registerSubcommand(new StrikeCommand(this));
	}

	@Override
	protected String getCredits() {
		return "Yo this is DuBois' plugin, whats good yo!";
	}
}
