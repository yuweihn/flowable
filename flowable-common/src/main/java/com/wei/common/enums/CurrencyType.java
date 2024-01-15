package com.wei.common.enums;



/**
 * 货币类型
 * @author yuwei
 */
public enum CurrencyType {
	CNY((byte) 1, "人民币"),
	USD((byte) 2, "美元"),
	EUR((byte) 3, "欧元"),
	HKD((byte) 4, "港币"),
	GBP((byte) 5, "英镑");


	private byte code;
	private String name;

	CurrencyType(byte code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static CurrencyType getByCode(byte code) {
		for (CurrencyType itm: CurrencyType.values()) {
			if (itm.code == code) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(byte code) {
		for (CurrencyType itm: CurrencyType.values()) {
			if (itm.code == code) {
				return itm.name;
			}
		}
		return "";
	}
}
