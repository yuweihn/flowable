package com.wei.common.enums;



/**
 * 供应商类型
 * @author yuwei
 */
public enum SpType {
	TELECOM((byte) 1, "电信运营商"),
	UNICOM((byte) 2, "联通运营商"),
	MOBILE((byte) 3, "移动运营商"),
	THIRD_PARTY((byte) 4, "第三方供应商"),
	FACT((byte) 5, "厂商");


	private byte code;
	private String name;

	SpType(byte code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static SpType getByCode(byte code) {
		for (SpType itm: SpType.values()) {
			if (itm.code == code) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(byte code) {
		for (SpType itm: SpType.values()) {
			if (itm.code == code) {
				return itm.name;
			}
		}
		return "";
	}
}
