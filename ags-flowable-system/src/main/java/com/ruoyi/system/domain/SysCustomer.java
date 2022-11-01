package com.ruoyi.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "sys_customer")
@Data
public class SysCustomer implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	@Column(name = "customer_no")
	private String customerNo;

	@Column(name = "enterprise_name")
	private String enterpriseName;

	@Column(name = "contacts")
	private String contacts;

	@Column(name = "phone_no")
	private String phoneNo;

	@Column(name = "email")
	private String email;

	@Column(name = "contacts2")
	private String contacts2;

	@Column(name = "phone_no2")
	private String phoneNo2;

	@Column(name = "email2")
	private String email2;

	@Column(name = "tenant_id")
	private String tenantId;

	/**
	 * 客户状态(EnumCustomerStatus)
	 */
	@Column(name = "status_code")
	private Integer statusCode;

	/**
	 * 客户类型(EnumCustomerType)
	 */
	@Column(name = "type_code")
	private Integer typeCode;

	/**
	 * 客户行业(EnumCustomerIndustry)
	 */
	@Column(name = "industry_code")
	private Integer industryCode;

	@Column(name = "addr")
	private String addr;

	@Column(name = "fp_title")
	private String fpTitle;

	@Column(name = "fp_bank_name")
	private String fpBankName;

	@Column(name = "fp_bank_acc_no")
	private String fpBankAccNo;

	@Column(name = "fp_phone_no")
	private String fpPhoneNo;

	@Column(name = "fp_tax_no")
	private String fpTaxNo;

	@Column(name = "fp_addr")
	private String fpAddr;

	@Column(name = "sales_user_id")
	private Long salesUserId;

	@Column(name = "remark")
	private String remark;


	@Version
	@Column(name = "version")
	private int version;

	@Column(name = "creator")
	private String creator;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "modifier")
	private String modifier;

	@Column(name = "modify_time")
	private Date modifyTime;
}
