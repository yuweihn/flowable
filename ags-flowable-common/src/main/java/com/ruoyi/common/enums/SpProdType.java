package com.ruoyi.common.enums;



/**
 * 供应商产品类型
 * @author yuwei
 */
public enum SpProdType {
	INTEGRATION((byte) 1, "集成"),
	SPEC_LINE((byte) 2, "专线"),
	TRANS((byte) 3, "传输"),
	BUILD_JUMP((byte) 4, "楼内跳纤"),
	CABINET((byte) 5, "机柜"),
	ADSL((byte) 6, "ADSL上网宽带"),
	MAINTENANCE((byte) 7, "代维费"),
	CONSUMABLE((byte) 8, "耗材类"),
	LOGISTICS_TRANS((byte) 9, "物流运输费"),
	MPLS_IPSEC((byte) 10, "MPLS/IPSec"),
	MIN_BANDWIDTH((byte) 11, "保底带宽"),
	EXCESS_BANDWIDTH((byte) 12, "超量带宽"),
	LOCAL_IP((byte) 13, "本地IP"),
	BROADCAST_IP((byte) 14, "广播IP"),
	INTERNET((byte) 15, "Internet"),
	SERVICE((byte) 16, "服务"),
	IOT_CARD((byte) 17, "物联网卡");


	private byte code;
	private String name;

	SpProdType(byte code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public byte getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static SpProdType getByCode(byte code) {
		for (SpProdType itm: SpProdType.values()) {
			if (itm.code == code) {
				return itm;
			}
		}
		return null;
	}
	public static String getNameByCode(byte code) {
		for (SpProdType itm: SpProdType.values()) {
			if (itm.code == code) {
				return itm.name;
			}
		}
		return "";
	}
}
