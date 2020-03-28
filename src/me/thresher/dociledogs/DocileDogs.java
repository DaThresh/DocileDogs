package me.thresher.dociledogs;

import org.bukkit.plugin.java.JavaPlugin;

public class DocileDogs extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new DogHitListener(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
