package com.jodexindustries.dcblockanimations.bootstrap;

import com.jodexindustries.donatecase.api.CaseManager;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.util.logging.Logger;

public interface Main {
    Plugin getPlugin();
    Logger getLogger();
    File getDataFolder();
    CaseManager getCaseManager();
    void saveResource(String resource, boolean replace);
}
