package com.wei.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "t_order_special_line")
@Data
public class OrderSpecialLine implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	@Column(name = "order_id")
	private long orderId;

	@Column(name = "prod_no")
	private String prodNo;

	@Column(name = "isp")
	private String isp;

	@Column(name = "a_addr")
	private String aAddr;

	@Column(name = "a_port_type")
	private String aPortType;

	@Column(name = "z_addr")
	private String zAddr;

	@Column(name = "z_port_type")
	private String zPortType;

	@Column(name = "bandwidth")
	private String bandwidth;

	@Column(name = "unit_price")
	private Double unitPrice;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "one_time_fee")
	private Double oneTimeFee;

	@Column(name = "one_time_mgt_fee")
	private Double oneTimeMgtFee;

	@Column(name = "delivery_date")
	private Date deliveryDate;

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
