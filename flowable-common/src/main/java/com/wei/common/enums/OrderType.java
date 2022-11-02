package com.wei.common.enums;



/**
 * 订单类型
 * @author yuwei
 */
public enum OrderType {
	FORMAL("0", "正式"),
	GREEN_CHANNEL("1", "绿色通道"),
	TEST("2", "测试");


	private String code;
	private String name;

	OrderType(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static OrderType getByCode(String code) {
		for (OrderType itm: OrderType.values()) {
			if (itm.code.equals(code)) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(String code) {
		for (OrderType itm: OrderType.values()) {
			if (itm.code.equals(code)) {
				return itm.name;
			}
		}
		return "";
	}
}
