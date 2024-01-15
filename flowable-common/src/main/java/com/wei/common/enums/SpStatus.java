package com.wei.common.enums;



/**
 * 供应商状态
 * @author yuwei
 */
public enum SpStatus {
	RESERVE((byte) 1, "资源储备"),
	WAIT_TO_OPEN((byte) 2, "资源待开通"),
	OPENED((byte) 3, "资源已开通"),
	TERMINATED((byte) 4, "资源已终止"),
	BLACKLIST((byte) 5, "黑名单");


	private byte code;
	private String name;

	SpStatus(byte code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static SpStatus getByCode(byte code) {
		for (SpStatus itm: SpStatus.values()) {
			if (itm.code == code) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(byte code) {
		for (SpStatus itm: SpStatus.values()) {
			if (itm.code == code) {
				return itm.name;
			}
		}
		return "";
	}
}
