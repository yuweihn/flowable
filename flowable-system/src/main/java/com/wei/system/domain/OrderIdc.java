package com.wei.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "t_order_idc")
@Data
public class OrderIdc implements Serializable {
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

	@Column(name = "room_no")
	private String roomNo;

	@Column(name = "frame_no")
	private String frameNo;

	@Column(name = "electric_power")
	private String electricPower;

	@Column(name = "addr")
	private String addr;

	@Column(name = "bandwidth_type")
	private String bandwidthType;

	@Column(name = "ip_count")
	private Integer ipCount;

	@Column(name = "bandwidth")
	private String bandwidth;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "unit_price")
	private Double unitPrice;

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
