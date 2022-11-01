package com.ruoyi.common.enums;



/**
 * 流程分类
 * @author yuwei
 */
public enum ProcCategory {
	ORDER("order", "订单"),
	CONTRACT("contract", "合同"),
	IMPL("impl", "实施启动单");


	private String code;
	private String name;

	ProcCategory(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static ProcCategory getByCode(String code) {
		for (ProcCategory itm: ProcCategory.values()) {
			if (itm.code.equals(code)) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(String code) {
		for (ProcCategory itm: ProcCategory.values()) {
			if (itm.code.equals(code)) {
				return itm.name;
			}
		}
		return "";
	}
}
