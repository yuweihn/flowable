package com.ruoyi.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


/**
 * 实施启动单VO
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ImplVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String implNo;//实施启动编号。后台生成
	private String title;//标题
	private String customerNo;//客户编号
	private String prjCode;//项目编码
	private Long preSalesId;//售前ID
	private Long prjManagerId;//项目经理ID
    private String solution;//实施方案
	private List<Order> orderList;//订单列表



	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Order implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private long orderId;//订单ID
	}
}
