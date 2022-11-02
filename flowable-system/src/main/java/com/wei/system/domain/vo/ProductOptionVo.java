package com.wei.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductOptionVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String value;
	private String label;
	@Builder.Default
	private List<ProductOptionVo> children = new ArrayList<>();

	public ProductOptionVo addChild(ProductOptionVo child) {
		if (children == null) {
			children = new ArrayList<>();
		}
		children.add(child);
		return this;
	}


	/**
	 * 标准端口产品
	 */
	public static final List<ProductOptionVo> PORT_LIST = new ArrayList<>();
	/**
	 * 标准设备产品
	 */
	public static final List<ProductOptionVo> DEVICE_LIST = new ArrayList<>();
	static {
		PORT_LIST.add(ProductOptionVo.builder().value("AN-Port-CH").label("AN-Port-CH").build()
				.addChild(ProductOptionVo.builder().value("AN-Port-CH-10M").label("AN-Port-CH-10M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-CH-30M").label("AN-Port-CH-30M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-CH-50M").label("AN-Port-CH-50M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-CH-100M").label("AN-Port-CH-100M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-CH-300M").label("AN-Port-CH-300M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-CH-500M").label("AN-Port-CH-500M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-CH-1000M").label("AN-Port-CH-1000M").build()));
		PORT_LIST.add(ProductOptionVo.builder().value("AN-Port-AS").label("AN-Port-AS").build()
				.addChild(ProductOptionVo.builder().value("AN-Port-AS-10M").label("AN-Port-AS-10M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-AS-30M").label("AN-Port-AS-30M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-AS-50M").label("AN-Port-AS-50M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-AS-100M").label("AN-Port-AS-100M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-AS-300M").label("AN-Port-AS-300M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-AS-500M").label("AN-Port-AS-500M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-AS-1000M").label("AN-Port-AS-1000M").build()));
		PORT_LIST.add(ProductOptionVo.builder().value("AN-Port-EU").label("AN-Port-EU").build()
				.addChild(ProductOptionVo.builder().value("AN-Port-EU-10M").label("AN-Port-EU-10M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-EU-30M").label("AN-Port-EU-30M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-EU-50M").label("AN-Port-EU-50M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-EU-100M").label("AN-Port-EU-100M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-EU-300M").label("AN-Port-EU-300M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-EU-500M").label("AN-Port-EU-500M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-EU-1000M").label("AN-Port-EU-1000M").build()));
		PORT_LIST.add(ProductOptionVo.builder().value("AN-Port-NA").label("AN-Port-NA").build()
				.addChild(ProductOptionVo.builder().value("AN-Port-NA-10M").label("AN-Port-NA-10M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-NA-30M").label("AN-Port-NA-30M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-NA-50M").label("AN-Port-NA-50M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-NA-100M").label("AN-Port-NA-100M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-NA-300M").label("AN-Port-NA-300M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-NA-500M").label("AN-Port-NA-500M").build())
				.addChild(ProductOptionVo.builder().value("AN-Port-NA-1000M").label("AN-Port-NA-1000M").build()));
		PORT_LIST.add(ProductOptionVo.builder().value("AN-GIA-HK").label("AN-GIA-HK").build()
				.addChild(ProductOptionVo.builder().value("AN-GIA-HK-10M").label("AN-GIA-HK-10M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-HK-30M").label("AN-GIA-HK-30M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-HK-50M").label("AN-GIA-HK-50M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-HK-100M").label("AN-GIA-HK-100M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-HK-300M").label("AN-GIA-HK-300M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-HK-500M").label("AN-GIA-HK-500M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-HK-1000M").label("AN-GIA-HK-1000M").build()));
		PORT_LIST.add(ProductOptionVo.builder().value("AN-GIA-CH").label("AN-GIA-CH").build()
				.addChild(ProductOptionVo.builder().value("AN-GIA-CH-10M").label("AN-GIA-CH-10M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-CH-30M").label("AN-GIA-CH-30M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-CH-50M").label("AN-GIA-CH-50M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-CH-100M").label("AN-GIA-CH-100M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-CH-300M").label("AN-GIA-CH-300M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-CH-500M").label("AN-GIA-CH-500M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-CH-1000M").label("AN-GIA-CH-1000M").build()));
		PORT_LIST.add(ProductOptionVo.builder().value("AN-GIA-GLO").label("AN-GIA-GLO").build()
				.addChild(ProductOptionVo.builder().value("AN-GIA-GLO-10M").label("AN-GIA-GLO-10M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-GLO-30M").label("AN-GIA-GLO-30M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-GLO-50M").label("AN-GIA-GLO-50M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-GLO-100M").label("AN-GIA-GLO-100M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-GLO-300M").label("AN-GIA-GLO-300M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-GLO-500M").label("AN-GIA-GLO-500M").build())
				.addChild(ProductOptionVo.builder().value("AN-GIA-GLO-1000M").label("AN-GIA-GLO-1000M").build()));


		DEVICE_LIST.add(ProductOptionVo.builder().value("AN-CPE").label("AN-CPE").build()
				.addChild(ProductOptionVo.builder().value("CPE-C-10M").label("CPE-C-10M").build())
				.addChild(ProductOptionVo.builder().value("CPE-C-25M").label("CPE-C-25M").build())
				.addChild(ProductOptionVo.builder().value("CPE-C-50M").label("CPE-C-50M").build())
				.addChild(ProductOptionVo.builder().value("CPE-C-100M").label("CPE-C-100M").build())
				.addChild(ProductOptionVo.builder().value("CPE-C-250M").label("CPE-C-250M").build())
				.addChild(ProductOptionVo.builder().value("CPE-C-500M").label("CPE-C-500M").build())
				.addChild(ProductOptionVo.builder().value("CPE-C-1G").label("CPE-C-1G").build())
				.addChild(ProductOptionVo.builder().value("CPE-A-A300-LTE").label("CPE-A-A300-LTE").build()));
		DEVICE_LIST.add(ProductOptionVo.builder().value("AA-Additional-IP").label("AA-Additional-IP").build()
				.addChild(ProductOptionVo.builder().value("AA-Additional-IP-CH").label("AA-Additional-IP-CH").build())
				.addChild(ProductOptionVo.builder().value("AA-Additional-IP-GO").label("AA-Additional-IP-GO").build()));
		DEVICE_LIST.add(ProductOptionVo.builder().value("RA-Account-Package").label("RA-Account-Package").build()
				.addChild(ProductOptionVo.builder().value("RA-Account-Package-5").label("RA-Account-Package-5").build()));
		DEVICE_LIST.add(ProductOptionVo.builder().value("RA-Account-ADD").label("RA-Account-ADD").build()
				.addChild(ProductOptionVo.builder().value("RA-Account-ADD-1").label("RA-Account-ADD-1").build()));
	}
}

