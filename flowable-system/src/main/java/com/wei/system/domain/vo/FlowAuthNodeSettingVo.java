package com.wei.system.domain.vo;


import lombok.*;
import java.io.Serializable;


/**
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"procDefId", "nodeKey", "widgetId"})
@Data
public class FlowAuthNodeSettingVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String procDefId;
	private String nodeKey;
	private String nodeName;
	private Long widgetId;
	private String widgetCode;
	private String widgetName;
	private Boolean viewable;
	private Boolean editable;
	private boolean valid;
}

