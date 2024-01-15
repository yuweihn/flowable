package com.wei.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "sp_resp_bill")
@Data
public class SpRespBill implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	@Column(name = "supplier_name")
	private String supplierName;

	@Column(name = "line_no")
	private String lineNo;

	@Column(name = "bill_no")
	private String billNo;

	@Column(name = "ym")
	private Date ym;

	@Column(name = "consume_time")
	private Date consumeTime;

	/**
	 * 见 {@link com.wei.common.enums.SpProdType}
	 */
	@Column(name = "prod_type")
	private byte prodType;

	@Column(name = "node_name")
	private String nodeName;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private double price;

	/**
	 * 见 {@link com.wei.common.enums.CurrencyType}
	 */
	@Column(name = "currency_type")
	private byte currencyType;

	@Column(name = "pay_amount")
	private double payAmount;

	@Column(name = "a_addr")
	private String aAddr;

	@Column(name = "z_addr")
	private String zAddr;

	@Column(name = "one_off_pay")
	private double oneOffPay;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "start_time")
	private Date startTime;

	@Column(name = "end_time")
	private Date endTime;

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
