package me.thresher.dociledogs;

import org.bukkit.event.Listener;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class DogHitListener implements Listener {
	@EventHandler
	public void onHitDog(EntityDamageByEntityEvent event) {
		Entity damagee = event.getEntity();
		Entity damager = event.getDamager();
		if(damagee instanceof Wolf && damager instanceof Player) {
			if(((Wolf) damagee).isTamed()) {
				event.setCancelled(true);			
			}
		} else if(damagee instanceof Wolf && damager instanceof Projectile) {
			if(((Wolf) damagee).isTamed() && ((Projectile) damager).getShooter() instanceof Player) {
				event.setCancelled(true);
			}
		}
	}
}
