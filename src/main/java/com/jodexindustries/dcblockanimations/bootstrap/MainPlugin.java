package com.jodexindustries.dcblockanimations.bootstrap;

import com.jodexindustries.dcblockanimations.utils.Tools;
import com.jodexindustries.donatecase.api.CaseManager;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class MainPlugin extends JavaPlugin implements Main {
    private Tools t;
    private CaseManager caseManager;

    @Override
    public void onEnable() {
        caseManager = new CaseManager(this);
        t = new Tools(this);
        t.load();
    }

    @Override
    public void onDisable() {
        t.unload();
    }

    @Override
    public Plugin getPlugin() {
        return this;
    }

    @Override
    public CaseManager getCaseManager() {
        return caseManager;
    }
}
