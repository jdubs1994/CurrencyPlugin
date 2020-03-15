package io.dubois.command;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;

public class SpawnEntityCommand extends SimpleCommand {

	public SpawnEntityCommand() {
		super("spawnentity|se");

		setMinArguments(1);
		setUsage("<type> [x] [y] [z]");
		setDescription("Spawns an entity at your or the given location");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		final EntityType entityType = findEnum(EntityType.class, args[0], "&cEntity named {enum} is invalid");
		checkBoolean(entityType.isAlive() && entityType.isSpawnable(), "&cEntity " + entityType + " is not spawnable");

		final Location location;
		if(args.length == 4) {
			final int x = findNumber(1, "Please specify the x coordinate as a number");
			final int y = findNumber(2, "Please specify the y coordinate as a number");
			final int z = findNumber(3, "Please specify the z coordinate as a number");

			 location = new Location(getPlayer().getWorld(), x, y, z);

		} else {
			location = getPlayer().getLocation();
		}
		location.getWorld().spawnEntity(location, entityType);
		tell("&aSpawned " + entityType + " at" + Common.shortLocation(location));
	}
}
