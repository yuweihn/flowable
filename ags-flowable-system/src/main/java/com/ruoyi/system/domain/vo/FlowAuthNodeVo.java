package com.ruoyi.system.domain.vo;


import lombok.*;
import java.io.Serializable;


/**
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"procDefId", "nodeKey"})
@Data
public class FlowAuthNodeVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String procDefId;
	private String nodeKey;
	private String nodeName;
	/**
	 * true - 流程定义中有该节点
	 * false - 流程定义中没有该节点
	 */
	private boolean valid;
}

