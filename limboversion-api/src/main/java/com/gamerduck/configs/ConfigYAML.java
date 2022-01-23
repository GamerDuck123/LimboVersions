package com.gamerduck.configs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import com.loohp.limbo.file.FileConfiguration;
import com.loohp.limbo.plugins.LimboPlugin;

public class ConfigYAML {
	public ConfigYAML() { }
    static ConfigYAML instance = new ConfigYAML();
    public static ConfigYAML instance() {return instance;}
	
    Config config;
    
	public boolean setup(LimboPlugin plug) {
		if (!plug.getDataFolder().exists()) {plug.getDataFolder().mkdir();}
		File configFile = new File(plug.getDataFolder() + "/" + "config.yml");
        FileConfiguration temp = null;
        if (!configFile.exists()) {
        	try (InputStream in = getClass().getClassLoader().getResourceAsStream("config.yml")) {
                Files.copy(in, configFile.toPath());
                temp = new FileConfiguration(configFile);
            } catch (IOException e) {e.printStackTrace();}
        } else {
            try {temp = new FileConfiguration(configFile);
			} catch (IOException e) {e.printStackTrace();}
        }
        config = new Config(temp, configFile);
        return config != null;
	}
	
	public Config getConfig() {return config;}
	public void reloadConfig() {config.reload();}
	public void saveConfig() {config.save();}
	
}
