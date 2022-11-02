package com.wei.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "t_impl")
@Data
public class Impl implements Serializable {
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

	@Column(name = "impl_no")
	private String implNo;

	@Column(name = "title")
	private String title;

	@Column(name = "customer_no")
	private String customerNo;

	@Column(name = "prj_code")
	private String prjCode;

	@Column(name = "pre_sales_id")
	private Long preSalesId;

	@Column(name = "prj_manager_id")
	private Long prjManagerId;

	@Column(name = "prj_manager_name")
	private String prjManagerName;

	@Column(name = "solution")
	private String solution;


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
