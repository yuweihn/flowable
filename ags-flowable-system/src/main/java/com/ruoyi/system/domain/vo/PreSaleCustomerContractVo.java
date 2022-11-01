package com.ruoyi.system.domain.vo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PreSaleCustomerContractVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String customerNo;
    private String enterpriseName;
    private String contractTitle;//合同标题
    private Long preSalesId;//售前ID
    private String preSalesUserName;//售前账号
}
