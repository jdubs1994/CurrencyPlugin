package io.dubois.event;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class ProjectileListener implements Listener {

	private final Set<UUID> shotEggs = new HashSet<>();

	@EventHandler
	public void onProjectileLaunch(final ProjectileLaunchEvent event) {
		final Projectile projectile = event.getEntity();

		if(isEgg(projectile) && projectile.getShooter() instanceof Player) {
			shotEggs.add(projectile.getUniqueId());
		}
	}

	@EventHandler
	public void onProjectileHit(final ProjectileHitEvent event) {
		final Projectile projectile = event.getEntity();

		if(isEgg(projectile) && shotEggs.contains(projectile.getUniqueId())) {
			shotEggs.remove(projectile.getUniqueId());
			projectile.getWorld().spawn(projectile.getLocation(), Creeper.class);
		}
	}

	private boolean isEgg(final Projectile projectile) {
		return projectile instanceof Egg;
	}

}
