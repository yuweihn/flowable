package com.wei.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String customerNo;
	private String enterpriseName;
	private String contacts;
	private String phoneNo;
	private String email;
	private String contacts2;
	private String phoneNo2;
	private String email2;
	private String tenantId;
	private String statusCode;
	private String typeCode;
	private String industryCode;
	private String addr;
	private String fpTitle;
	private String fpBankName;
	private String fpBankAccNo;
	private String fpPhoneNo;
	private String fpTaxNo;
	private String fpAddr;
	private Long salesUserId;
	private String salesUserName;
	private String salesNickName;
	private String salesUserPhone;
	private String salesUserEmail;
	private String remark;
	private String creator;
	private String createTime;
	private String modifier;
	private String modifyTime;
}

