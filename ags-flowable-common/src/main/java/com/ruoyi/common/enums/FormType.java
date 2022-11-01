package com.ruoyi.common.enums;



/**
 * 表单类别
 * @author yuwei
 */
public enum FormType {
	DYNAMIC((byte) 0, "动态表单"),
	STATIC_ORDER((byte) 1, "订单表单"),
	STATIC_CONTRACT((byte) 2, "合同申请单"),
	STATIC_IMPL((byte) 3, "实施启动单");


	private byte code;
	private String name;

	FormType(byte code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static FormType getByCode(byte code) {
		for (FormType itm: FormType.values()) {
			if (itm.code == code) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(byte code) {
		for (FormType itm: FormType.values()) {
			if (itm.code == code) {
				return itm.name;
			}
		}
		return "";
	}
}
