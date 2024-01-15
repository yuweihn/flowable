package com.wei.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "t_contract")
@Data
public class Contract implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	@Column(name = "proc_ins_id")
	private String procInsId;

	@Column(name = "contract_no")
	private String contractNo;

	@Column(name = "title")
	private String title;

	@Column(name = "contract_type")
	private String contractType;

	@Column(name = "customer_no")
	private String customerNo;

	@Column(name = "customer_contacts")
	private String customerContacts;

	@Column(name = "customer_phone_no")
	private String customerPhoneNo;

	@Column(name = "customer_email")
	private String customerEmail;

	/**
	 * {@link com.wei.common.enums.AgsCompany}
	 */
	@Column(name = "ags_company_code")
	private byte agsCompanyCode;

	@Column(name = "auth_signer")
	private String authSigner;

	@Column(name = "ags_phone_no")
	private String agsPhoneNo;

	@Column(name = "sign_date")
	private Date signDate;

	@Column(name = "contract_start_date")
	private Date contractStartDate;

	@Column(name = "contract_end_date")
	private Date contractEndDate;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "fp_title")
	private String fpTitle;

	@Column(name = "fp_bank_name")
	private String fpBankName;

	@Column(name = "fp_tax_no")
	private String fpTaxNo;

	@Column(name = "fp_bank_acc_no")
	private String fpBankAccNo;

	@Column(name = "fp_addr")
	private String fpAddr;

	@Column(name = "fp_phone_no")
	private String fpPhoneNo;

	@Column(name = "supple_agreement")
	private String suppleAgreement;

	@Column(name = "user_id")
	private long userId;


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
