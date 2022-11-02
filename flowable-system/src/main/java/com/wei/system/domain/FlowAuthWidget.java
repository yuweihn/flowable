package com.wei.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * 流程权限相关组件
 * @author yuwei
 */
@Table(name = "t_flow_auth_widget")
@Data
public class FlowAuthWidget implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	/**
	 * 见{@link com.wei.common.enums.ProcCategory}
	 */
	@Column(name = "proc_category")
	private String procCategory;

	@Column(name = "widget_code")
	private String code;

	@Column(name = "widget_name")
	private String name;


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
