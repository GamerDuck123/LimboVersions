package com.gamerduck.cache;

import java.util.HashMap;

import com.gamerduck.enums.ProtocolVersions;

public class ProtocolCache {
	public ProtocolCache() { }
    static ProtocolCache instance = new ProtocolCache();
    public static ProtocolCache instance() {return instance;}
    
	public HashMap<Integer, ProtocolVersions> protocols;
	
	public boolean setup() {
		protocols = new HashMap<Integer, ProtocolVersions>();
		for (ProtocolVersions version : ProtocolVersions.values()) {
			protocols.put(version.getProtocolVersion(), version);
		}
		return protocols.containsKey(-1);
	}
	
	public HashMap<Integer, ProtocolVersions> getCached() {return protocols;}
	
}
