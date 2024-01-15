package com.wei.system.domain.vo;


import lombok.*;
import java.io.Serializable;


/**
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlowAuthNodeTaskSettingVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String widgetCode;
	private String widgetName;
	private Boolean viewable = false;
	private Boolean editable = false;
}
