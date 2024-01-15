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
public class BizContractVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String procInsId;
    private String contractNo;
    private String title;
    private String contractType;
    private String customerNo;
    private String customerName;
    private String customerContacts;
    private String customerPhoneNo;
    private String customerEmail;
    private String enterpriseName;//企业名称
    private byte agsCompanyCode;
    private String agsCompanyName;

    private String authSigner;
    private String agsPhoneNo;
    private String signDate;
    private String contractStartDate;
    private String contractEndDate;
    private String remarks;
    private String fpTitle;
    private String fpBankName;
    private String fpTaxNo;
    private String fpBankAccNo;
    private String fpAddr;
    private String fpPhoneNo;
    private String suppleAgreement;
    private Long userId;
    private String userName;//员工姓名
    private String userNickName;//员工姓名
    private String creator;
    private String createTime;
    private String modifier;
    private String modifyTime;
    private List<Attach> attachList;
    private List<Order> orderList;

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Attach implements Serializable {
        private static final long serialVersionUID = 1L;
        private Long id;
        private Long contractId;
        private String attachUrl;//附件url
        private String fileName;
        private Byte type;
        private String typeName;
        private String creator;
        private String createTime;
        private String modifier;
        private String modifyTime;
    }
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Order implements Serializable {
        private static final long serialVersionUID = 1L;
        private String title;
        private String relationTitle;
        private String creator;
        private String createTime;
        private String modifier;
        private String modifyTime;
    }
}
