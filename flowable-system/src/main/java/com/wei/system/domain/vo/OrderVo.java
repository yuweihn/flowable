package com.wei.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


/**
 * 订单VO
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String orderNo;//订单编号。后台生成
	private String title;//标题
	private String orderType;//订单类型
	private String bizType;//业务类型
	private Long orderId;//关联订单ID
	private String customerNo;//客户编号
	private String customerContacts;//客户联系人
	private String customerPhoneNo;//客户电话
	private String customerEmail;//客户邮箱
	private Boolean involveNonStandard;//是否涉及非标产品
	private Long preSalesId;//售前ID
	private Boolean involveOtherFee;//是否涉及其它费用
	private String otherFeeDesc;//其它费用说明
	private Double otherFee;//其它费用金额
	private String otherFeePayType;//其它费用支付方式
	private String currencyType;//结算货币类型
	private Integer serviceDuration;//服务期(月)
	private String remarks;//备注

	private List<Port> portList;//标准产品(端口)
	private List<Device> deviceList;//标准产品(设备)
	private List<MplsIpsec> mplsIpsecList;//非标准产品(MPLS/IPSec)
	private List<SpecialLine> specialLineList;//非标准产品(专线)
	private List<Internet> internetList;//非标准产品(Internet)
	private List<Idc> idcList;//非标准产品(IDC)
	private List<Srv> srvList;//非标准产品(服务)
	private List<Integration> integrationList;//非标准产品(集成)


	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Port implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String portNo;//产品编号
		private String siteAddr;//站点地址
		private String bandwidth;//带宽(Mbps)
		private String popNo;//接入POP
		private Integer quantity;//数量(项)
		private Double oneTimeFee;//一次性费用(元)
		private Double oneTimeMgtFee;//一次性费用管理价(元)
		private Double price;//销售价(元/月)
		private String expDeliveryDate;//期望交付日期(yyyy-MM-dd)
		private String remarks;//备注
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Device implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String deviceNo;//设备产品编号
		private String siteAddr;//站点地址
		private Integer quantity;//数量(个)
		private Double oneTimeFee;//一次性费用(元)
		private Double oneTimeMgtFee;//一次性费用管理价(元)
		private Double price;//销售价(元/月)
		private String remarks;//备注
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class MplsIpsec implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String prodNo;//产品编码
		private String isp;//运营商
		private String addr;//接入地址
		private String popNo;//接入POP
		private String bandwidth;//带宽(Mbps)
		private Double unitPrice;//VPN销售单价(元/项/月)
		private Integer quantity;//数量(项)
		private Double oneTimeFee;//VPN一次性费用(元)
		private Double oneTimeMgtFee;//VPN一次性费用管理价(元)
		private String deliveryDate;//交付截止日期(yyyy-MM-dd)
		private String remarks;//备注
		private String purchaseRemarks;//采购备注信息
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class SpecialLine implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String prodNo;//产品编码
		private String isp;//运营商
		private String aAddr;//A端地址
		private String aPortType;//A端端口类型
		private String zAddr;//Z端地址
		private String zPortType;//Z端端口类型
		private String bandwidth;//带宽(Mbps)
		private Double unitPrice;//专线销售单价(元/项/月)
		private Integer quantity;//专线数量
		private Double oneTimeFee;//专线一次性费用(元)
		private Double oneTimeMgtFee;//专线一次性费用管理价(元)
		private String deliveryDate;//交付截止日期(yyyy-MM-dd)
		private String remarks;//备注
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Internet implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String prodNo;//产品编码
		private String isp;//运营商
		private String addr;//站点地址
		private String portType;//端口类型
		private String bandwidth;//带宽(Mbps)
		private Integer ipCount;//IP数量
		private Boolean upDownSymmetry;//上下行对称
		private Integer quantity;//数量
		private Double unitPrice;//销售单价(元/项/月)
		private Double oneTimeFee;//一次性费用(元)
		private Double oneTimeMgtFee;//一次性费用管理价(元)
		private String deliveryDate;//交付截止日期(yyyy-MM-dd)
		private String remarks;//备注
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Idc implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String prodNo;//产品编码
		private String roomNo;//机房编码
		private String frameNo;//机框编码
		private String electricPower;//电力(KVA)
		private String addr;//机房地址
		private String bandwidthType;//带宽类型
		private Integer ipCount;//IP数量
		private String bandwidth;//带宽(Mbps)
		private Integer quantity;//数量
		private Double unitPrice;//销售单价(元/项/月)
		private Double oneTimeFee;//一次性费用(元)
		private Double oneTimeMgtFee;//一次性费用管理价(元)
		private String deliveryDate;//交付截止日期(yyyy-MM-dd)
		private String remarks;//备注
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Srv implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String desc;//服务描述
		private Double unitPrice;//销售单价(元/月)
		private Integer quantity;//数量
		private Double oneTimeFee;//一次性费用(元)
		private Double oneTimeMgtFee;//一次性费用管理价(元)
		private String deliveryDate;//交付截止日期(yyyy-MM-dd)
		private String remarks;//备注
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Integration implements Serializable {
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private String deviceModel;//设备型号
		private String desc;//产品描述
		private Double unitPrice;//销售单价(元/月)
		private Integer quantity;//数量
		private String deliveryDate;//交付截止日期(yyyy-MM-dd)
		private String remarks;//备注
	}
}
