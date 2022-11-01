package com.ruoyi.system.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * @author yuwei
 */
@Table(name = "t_contract_attach")
@Data
public class ContractAttach implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "hehe")
	private long id;

	@Column(name = "contract_id")
	private long contractId;

	@Column(name = "attach_url")
	private String attachUrl;

	@Column(name = "file_name")
	private String fileName;

	/**
	 * {@link com.ruoyi.common.enums.ContractAttachType}
	 */
	@Column(name = "type_")
	private byte type_;


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
