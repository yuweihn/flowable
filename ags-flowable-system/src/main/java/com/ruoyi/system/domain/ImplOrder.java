package com.ruoyi.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "t_impl_order")
@Data
public class ImplOrder implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	@Column(name = "impl_id")
	private long implId;

	@Column(name = "order_id")
	private long orderId;


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
