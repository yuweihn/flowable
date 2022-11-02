package com.wei.common.enums;




/**
 * 乙方企业
 * @author yuwei
 */
public enum AgsCompany {
	CHANG_NO((byte) 1, "畅诺", "畅诺网络科技（上海）有限公司", "招商银行上海分行大连路支行", "121937067010802"),
	PENG_YI ((byte) 2, "芃奕", "芃奕网络科技（上海）有限公司", "招商银行上海大连路支行", "121929860910901"),
	AGS_HK ((byte) 3, "AgsHK", "Agilenaas Global Service Co., limited", "OCBC Wing Hang Bank", "035-802-884052-831");
	
	
	private byte code;
	private String name;
	private String fullName;
	private String bankName;
	private String bankAccountNo;
	
	AgsCompany(byte code, String name, String fullName, String bankName, String bankAccountNo) {
		this.code = code;
		this.name = name;
		this.fullName = fullName;
		this.bankName = bankName;
		this.bankAccountNo = bankAccountNo;
	}
	
	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getFullName() {
		return fullName;
	}

	public String getBankName() {
		return bankName;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public static AgsCompany getByCode(byte code) {
		for (AgsCompany item: AgsCompany.values()) {
			if (item.code == code) {
				return item;
			}
		}
		return null;
	}

	public static String getNameByCode(byte code) {
		for (AgsCompany item: AgsCompany.values()) {
			if (item.code == code) {
				return item.name;
			}
		}
		return "";
	}
}
