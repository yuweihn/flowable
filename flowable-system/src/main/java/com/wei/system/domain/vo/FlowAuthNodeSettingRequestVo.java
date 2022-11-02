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
public class FlowAuthNodeSettingRequestVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long widgetId;
	private Boolean viewable;
	private Boolean editable;
}

