package com.ruoyi.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "t_order_device")
@Data
public class OrderDevice implements Serializable {
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

	@Column(name = "device_no")
	private String deviceNo;

	@Column(name = "site_addr")
	private String siteAddr;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "one_time_fee")
	private Double oneTimeFee;

	@Column(name = "one_time_mgt_fee")
	private Double oneTimeMgtFee;

	@Column(name = "price")
	private Double price;

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
