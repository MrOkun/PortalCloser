package com.okun.portalCloser;

import com.okun.portalCloser.events.PortalCloserEvents;
import org.bukkit.plugin.java.JavaPlugin;

public class PortalCloser extends JavaPlugin
{
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new PortalCloserEvents(), this);
        getServer().getConsoleSender().sendMessage("[PortalCloser]: Plugin is enable!");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage("[PortalCloser]: Plugin is disable!");
    }
}

