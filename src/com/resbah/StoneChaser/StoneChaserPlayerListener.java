package com.resbah.StoneChaser;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

public class StoneChaserPlayerListener extends PlayerListener {
	
	public static StoneChaser plugin;
	
	public StoneChaserPlayerListener(StoneChaser instance) {
		plugin = instance;
	}
	
	public void onPlayerMove(PlayerMoveEvent event){
		Player player = event.getPlayer();
		Location loc = player.getLocation();
		World w = loc.getWorld();
		loc.setY(loc.getY() + 5);
		Block b = w.getBlockAt(loc);
		b.setTypeId(1);
	}
}
