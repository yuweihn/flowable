package com.ruoyi.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "t_order")
@Data
public class Order implements Serializable {
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

	@Column(name = "order_no")
	private String orderNo;

	@Column(name = "title")
	private String title;

	@Column(name = "order_type")
	private String orderType;

	@Column(name = "biz_type")
	private String bizType;

	@Column(name = "related_order_id")
	private Long relatedOrderId;

	@Column(name = "customer_no")
	private String customerNo;

	@Column(name = "customer_contacts")
	private String customerContacts;

	@Column(name = "customer_phone_no")
	private String customerPhoneNo;

	@Column(name = "customer_email")
	private String customerEmail;

	@Column(name = "involve_non_standard")
	private boolean involveNonStandard;

	@Column(name = "pre_sales_id")
	private Long preSalesId;

	@Column(name = "involve_other_fee")
	private boolean involveOtherFee;

	@Column(name = "other_fee_desc")
	private String otherFeeDesc;

	@Column(name = "other_fee")
	private Double otherFee;

	@Column(name = "other_fee_pay_type")
	private String otherFeePayType;

	@Column(name = "currency_type")
	private String currencyType;

	@Column(name = "service_duration")
	private Integer serviceDuration;

	@Column(name = "user_id")
	private long userId;

	@Column(name = "remarks")
	private String remarks;


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
