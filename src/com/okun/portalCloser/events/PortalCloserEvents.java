package com.okun.portalCloser.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PortalCloserEvents implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer(); //получаем обьект игрока.

        Location loc = new Location(player.getWorld(), player.getLocation().getBlockX(),player.getLocation().getBlockY(), player.getLocation().getBlockZ());//текущая позиция игрока.
        Block block = loc.getBlock();//блок в координатах игрока.

        if(block.getType() == Material.NETHER_PORTAL){//если этот блок - портал, то...
            block.setType(Material.AIR); //замена блока на пустоту. (если заменить один блок портала, сломаются все)
        }
    }
}
