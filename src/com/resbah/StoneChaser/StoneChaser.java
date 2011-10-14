package com.resbah.StoneChaser;

	import java.util.logging.Logger;

	import org.bukkit.event.Event;
	import org.bukkit.plugin.PluginManager;
	import org.bukkit.plugin.java.JavaPlugin;


	public class StoneChaser extends JavaPlugin {
		Logger log = Logger.getLogger("Minecraft");
		public void onEnable(){
			log.info("StoneChaser has been Enabled");
			PluginManager pm = this.getServer().getPluginManager();
			pm.registerEvent(Event.Type.PLAYER_MOVE, playerListener, Event.Priority.Normal, this);
		}
		 
		public void onDisable(){ 
			log.info("StoneChaser has been Disabled");
		}
		private final StoneChaserPlayerListener playerListener = new StoneChaserPlayerListener(this);
}
