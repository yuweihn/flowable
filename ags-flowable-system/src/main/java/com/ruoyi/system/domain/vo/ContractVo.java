package com.ruoyi.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


/**
 * 合同VO
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContractVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String contractNo;//合同编号。后台生成
	private String title;//标题
	private String contractType;//合同类型
	private String customerNo;//客户编号
	private String customerContacts;//客户联系人
	private String customerPhoneNo;//客户电话
	private String customerEmail;//客户邮箱
	private byte agsCompanyCode;//乙方企业编号
	private String authSigner;//授权签字人
	private String agsPhoneNo;//联系电话
	private String signDate;//合同签订日期(yyyy-MM-dd)
	private String contractStartDate;//合同开始日期(yyyy-MM-dd)
	private String contractEndDate;//合同结束日期(yyyy-MM-dd)
	private String remarks;//备注
	private String fpTitle;//发票抬头
	private String fpBankName;//开户行
	private String fpTaxNo;//税号
	private String fpBankAccNo;//银行账号
	private String fpAddr;//开票地址
	private String fpPhoneNo;//开票电话
	private List<Attach> contractAttaches;//合同附件
	private List<Attach> orderAttaches;//订单附件
	private String suppleAgreement;//补充协议

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
		private Long orderId;//订单ID
	}

	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Attach implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String url;//附件地址
		private String fileName;
	}
}
