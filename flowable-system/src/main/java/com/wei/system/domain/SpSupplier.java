package com.wei.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "sp_supplier")
@Data
public class SpSupplier implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	@Column(name = "enterprise_name")
	private String enterpriseName;

	/**
	 * 见 {@link com.wei.common.enums.SpStatus}
	 */
	@Column(name = "status")
	private byte status;

	@Column(name = "cust_manager")
	private String custManager;

	@Column(name = "phone_no")
	private String phoneNo;

	@Column(name = "email")
	private String email;

	@Column(name = "addr")
	private String addr;

	/**
	 * 见 {@link com.wei.common.enums.RegionCode}
	 */
	@Column(name = "region_code")
	private Byte regionCode;

	/**
	 * 见 {@link com.wei.common.enums.SpType}
	 */
	@Column(name = "sp_type")
	private byte spType;

	/**
	 * 见 {@link com.wei.common.enums.SpProdType}
	 */
	@Column(name = "coop_type")
	private byte coopType;

	@Column(name = "fp_title")
	private String fpTitle;

	@Column(name = "fp_bank_name")
	private String fpBankName;

	@Column(name = "fp_bank_acc_no")
	private String fpBankAccNo;

	@Column(name = "fp_addr")
	private String fpAddr;

	@Column(name = "fp_phone_no")
	private String fpPhoneNo;

	@Column(name = "attach_url")
	private String attachUrl;


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
