package com.ruoyi.common.enums;




/**
 * 合同附件类型
 * @author yuwei
 */
public enum ContractAttachType {
	CONTRACT((byte) 1, "合同附件"),
	ORDER ((byte) 2, "订单附件");


	private byte code;
	private String name;

	ContractAttachType(byte code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static ContractAttachType getByCode(byte code) {
		for (ContractAttachType item: ContractAttachType.values()) {
			if (item.code == code) {
				return item;
			}
		}
		return null;
	}

	public static String getNameByCode(byte code) {
		for (ContractAttachType item: ContractAttachType.values()) {
			if (item.code == code) {
				return item.name;
			}
		}
		return "";
	}
}
