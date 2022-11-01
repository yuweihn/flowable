package com.ruoyi.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * 流程权限相关节点配置
 * @author yuwei
 */
@Table(name = "t_flow_auth_node_setting")
@Data
public class FlowAuthNodeSetting implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	@Column(name = "proc_def_id")
	private String procDefId;

	@Column(name = "node_key")
	private String nodeKey;

	@Column(name = "node_name")
	private String nodeName;

	@Column(name = "auth_widget_id")
	private long widgetId;

	@Column(name = "viewable")
	private boolean viewable;

	@Column(name = "editable")
	private boolean editable;


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
