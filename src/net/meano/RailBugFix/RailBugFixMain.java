package net.meano.RailBugFix;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RailBugFixMain extends JavaPlugin {
	public void onEnable(){
		//Log开始记录
		getLogger().info("RailBugFix 0.1,by Meano. 正在载入.");
		PluginManager PM = Bukkit.getServer().getPluginManager();
		PM.registerEvents(new RailBugFixListeners(this), this);
	}
}
