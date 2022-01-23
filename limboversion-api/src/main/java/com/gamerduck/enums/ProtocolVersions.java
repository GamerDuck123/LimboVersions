package com.gamerduck.enums;

public enum ProtocolVersions {
	FUTURE(-1),
	v1_18_1(757),
	v1_18(757),
	v1_17_1(756),
	v1_17(755),
	v1_16_5(754),
	v1_16_4(754),
	v1_16_3(753),
	v1_16_2(751),
	v1_16_1(736),
	v1_16(735),
	v1_15_2(578),
	v1_15_1(575),
	v1_15(573),
	v1_14_4(498),
	v1_14_3(490),
	v1_14_2(485),
	v1_14_1(480),
	v1_14(477),
	v1_13_2(404),
	v1_13_1(401),
	v1_13(393),
	v1_12_2(340),
	v1_12_1(338),
	v1_12(335),
	v1_11_2(316),
	v1_11_1(316),
	v1_11(315),
	v1_10_2(210),
	v1_10_1(210),
	v1_10(210),
	v1_9_4(110),
	v1_9_3(110),
	v1_9_2(109),
	v1_9_1(108),
	v1_9(107),
	v1_8_9(47),
	v1_8_8(47),
	v1_8_7(47),
	v1_8_6(47),
	v1_8_5(47),
	v1_8_4(47),
	v1_8_3(47),
	v1_8_2(47),
	v1_8_1(47),
	v1_8(47),
	PAST(-1);
	
	public Integer protocolVersion;
	
	private ProtocolVersions(Integer protocolVersion) {
		this.protocolVersion = protocolVersion;
	}
	
	public Integer getProtocolVersion() {
		return protocolVersion;
	}
}
