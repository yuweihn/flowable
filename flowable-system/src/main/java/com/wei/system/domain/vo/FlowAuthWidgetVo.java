package com.wei.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlowAuthWidgetVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String procCategory;
	private String code;
	private String name;
	private String creator;
	private String createTime;
	private String modifier;
	private String modifyTime;
}

