package com.ruoyi.common.enums;



/**
 * 合同类型
 * @author yuwei
 */
public enum ContractType {
	NEW("0", "新增"),
	RENEWAL("1", "续约"),
	CHANGE("2", "变更"),
	STOP("3", "中止"),
	OTHER("4", "其它");


	private String code;
	private String name;

	ContractType(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static ContractType getByCode(String code) {
		for (ContractType itm: ContractType.values()) {
			if (itm.code.equals(code)) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(String code) {
		for (ContractType itm: ContractType.values()) {
			if (itm.code.equals(code)) {
				return itm.name;
			}
		}
		return "";
	}
}
