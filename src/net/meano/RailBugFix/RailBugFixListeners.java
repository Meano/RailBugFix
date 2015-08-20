package net.meano.RailBugFix;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

public class RailBugFixListeners  implements Listener{
	RailBugFixMain RBFM;
	public RailBugFixListeners(RailBugFixMain GetPlugin){
		RBFM = GetPlugin;
	}
	//轨道掉落事件，用于防止刷铁轨
	@EventHandler
	public void onRailDrop(BlockPhysicsEvent event){
		Material BlockType = event.getBlock().getType();
		if(BlockType==Material.POWERED_RAIL||BlockType==Material.DETECTOR_RAIL||BlockType==Material.ACTIVATOR_RAIL){
			if(event.getChangedType().equals(Material.RAILS))
				event.setCancelled(true);
		}
	}
}
