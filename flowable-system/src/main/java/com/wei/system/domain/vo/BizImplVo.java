package com.wei.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


/**
 * WX742241103
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BizImplVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String procInsId;
    private String implNo;
    private String title;
    private String customerNo;
    private String customerName;
    private String enterpriseName;//企业名称
    private String prjCode;
    private Long preSalesId;
    private String preSalesName;//售前姓名
    private String preSalesNickName;//售前姓名
    private Long prjManagerId;
    private String prjManagerName;
    private String solution;//实施方案
    private String creator;
    private String createTime;
    private String modifier;
    private String modifyTime;
    private List<Order> orderList;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Order implements Serializable {
        private static final long serialVersionUID = 1L;
        private Long orderId;
        private String title;
        private String creator;
        private String createTime;
        private String modifier;
        private String modifyTime;
    }
}
