package com.ruoyi.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


/**
 * @author yuwei
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BizOrderVo implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String procInsId;
	private String orderNo;
	private String title;
	private String orderType;
	private String bizType;
	private Long orderId;//关联订单Id
	private String relatedOrderTitle;//关联订单标题
	private String customerNo;
	private String customerName;
	private String customerContacts;
	private String customerPhoneNo;
	private String customerEmail;
	private String enterpriseName;//企业名称
	private boolean involveNonStandard;
	private Long preSalesId;
	private String preSalesName;//售前姓名
	private String preSalesNickName;//售前姓名
	private Boolean involveOtherFee;
	private String otherFeeDesc;
	private Double otherFee;
	private String otherFeePayType;
	private String currencyType;
	private Integer serviceDuration;
	private Long userId;
	private String userName;//员工姓名
	private String userNickName;//员工姓名
	private String remarks;
	private String creator;
	private String createTime;
	private String modifier;
	private String modifyTime;
	private List<String> prdTypeList;

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
		private Long id;
		private Long orderId;
		private String portNo;
		private String siteAddr;
		private String bandwidth;
		private String popNo;
		private Integer quantity;
		private Double oneTimeFee;
		private Double oneTimeMgtFee;
		private Double price;
		private String expDeliveryDate;
		private String remarks;
		private String creator;
		private String createTime;
		private String modifier;
		private String modifyTime;
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Device implements Serializable {
		private static final long serialVersionUID = 1L;

		private Long id;
		private Long orderId;
		private String deviceNo;
		private String siteAddr;
		private Integer quantity;
		private Double oneTimeFee;
		private Double oneTimeMgtFee;
		private Double price;
		private String remarks;
		private String creator;
		private String createTime;
		private String modifier;
		private String modifyTime;
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class MplsIpsec implements Serializable {
		private static final long serialVersionUID = 1L;
		private Long id;
		private Long orderId;
		private String prodNo;
		private String isp;
		private String addr;
		private String popNo;
		private String bandwidth;
		private Double unitPrice;
		private Integer quantity;
		private Double oneTimeFee;
		private Double oneTimeMgtFee;
		private String deliveryDate;
		private String remarks;
		private String purchaseRemarks;
		private String creator;
		private String createTime;
		private String modifier;
		private String modifyTime;
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
		private Long id;
		private Long orderId;
		private String prodNo;
		private String isp;
		private String aAddr;
		private String aPortType;
		private String zAddr;
		private String zPortType;
		private String bandwidth;
		private Double unitPrice;
		private Integer quantity;
		private Double oneTimeFee;
		private Double oneTimeMgtFee;
		private String deliveryDate;
		private String remarks;
		private String creator;
		private String createTime;
		private String modifier;
		private String modifyTime;
	}
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public static class Internet implements Serializable {
		private static final long serialVersionUID = 1L;
		private Long id;
		private Long orderId;
		private String prodNo;
		private String isp;
		private String addr;
		private String portType;
		private String bandwidth;
		private Integer ipCount;
		private Boolean upDownSymmetry;
		private Integer quantity;
		private Double unitPrice;
		private Double oneTimeFee;
		private Double oneTimeMgtFee;
		private String deliveryDate;
		private String remarks;
		private String creator;
		private String createTime;
		private String modifier;
		private String modifyTime;
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
		private Long id;
		private Long orderId;
		private String prodNo;
		private String roomNo;
		private String frameNo;
		private String electricPower;
		private String addr;
		private String bandwidthType;
		private Integer ipCount;
		private String bandwidth;
		private Integer quantity;
		private Double unitPrice;
		private Double oneTimeFee;
		private Double oneTimeMgtFee;
		private String deliveryDate;
		private String remarks;
		private String creator;
		private String createTime;
		private String modifier;
		private String modifyTime;
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
		private Long id;
		private Long orderId;
		private String desc_;
		private Double unitPrice;
		private Integer quantity;
		private Double oneTimeFee;
		private Double oneTimeMgtFee;
		private String deliveryDate;
		private String remarks;
		private String creator;
		private String createTime;
		private String modifier;
		private String modifyTime;
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

		private Long id;
		private Long orderId;
		private String deviceModel;
		private String desc_;
		private Double unitPrice;
		private Integer quantity;
		private String deliveryDate;
		private String remarks;
		private String creator;
		private String createTime;
		private String modifier;
		private String modifyTime;
	}
}
