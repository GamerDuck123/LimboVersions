package com.gamerduck.converter;

import com.gamerduck.enums.ProtocolVersions;
import com.loohp.limbo.player.Player;

public class Converter {
	ProtocolVersions version;
	Player p;
	
	public Converter(ProtocolVersions version, Player p) {
		this.version = version;
		this.p = p;
	}
	
	public boolean convert() {
		return false;
	}
}
