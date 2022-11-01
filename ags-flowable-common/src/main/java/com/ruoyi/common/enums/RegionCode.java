package com.ruoyi.common.enums;



/**
 * 企业所属地
 * @author yuwei
 */
public enum RegionCode {
	INSIDE((byte) 1, "国内"),
	OUTSIDE((byte) 2, "海外");


	private byte code;
	private String name;

	RegionCode(byte code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static RegionCode getByCode(byte code) {
		for (RegionCode itm: RegionCode.values()) {
			if (itm.code == code) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(byte code) {
		for (RegionCode itm: RegionCode.values()) {
			if (itm.code == code) {
				return itm.name;
			}
		}
		return "";
	}
}
