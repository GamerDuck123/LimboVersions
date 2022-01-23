package com.gamerduck.events;

import com.gamerduck.cache.ProtocolCache;
import com.gamerduck.converter.Converter;
import com.gamerduck.enums.ProtocolVersions;
import com.loohp.limbo.events.EventHandler;
import com.loohp.limbo.events.Listener;
import com.loohp.limbo.events.player.PlayerJoinEvent;
import com.loohp.limbo.player.Player;

public class PlayerJoinListener implements Listener {
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		ProtocolVersions version = ProtocolCache.instance().getCached().get(-1);
		new Converter(version, p).convert();
	}
}
