package com.gamerduck;

import com.gamerduck.cache.ProtocolCache;
import com.gamerduck.configs.Config;
import com.gamerduck.configs.ConfigYAML;
import com.loohp.limbo.plugins.LimboPlugin;

public class LimboVersionMain extends LimboPlugin {
	
	public static LimboVersionMain instance;
	public LimboVersionMain() {}
	
	@Override
	public void onEnable() {
		instance = this;
		ConfigYAML.instance().setup(this);
		ProtocolCache.instance().setup();
	}
	
	public static LimboVersionMain instance() {return instance;}
	public Config getConfig() {return ConfigYAML.instance().getConfig();}
}
