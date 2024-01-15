package com.wei.system.service;


import com.wei.system.domain.vo.CustomerDropDownVo;
import com.wei.system.domain.vo.CustomerVo;

import java.util.List;


/**
 * 岗位信息 服务层
 * 
 * @author ruoyi
 */
public interface ISysCustomerService {
    int queryCustomerCount(Long id, String customerNo, String enterpriseName, Long salesUserId
            , String keywords, Integer statusCode);
    List<CustomerVo> queryCustomerList(Long id, String customerNo, String enterpriseName, Long salesUserId
            , String keywords, Integer statusCode, int pageNo, int pageSize);
    List<CustomerDropDownVo> getCustomerOptionList(Long salesId, String keywords, int pageNo, int pageSize);

    CustomerVo findCustomerById(long id);
    CustomerVo findCustomerByNo(String customerNo);
    long createCustomer(String enterpriseName, String contacts, String phoneNo, String email
            , String contacts2, String phoneNo2, String email2
            , String tenantId, Integer statusCode, Integer typeCode, Integer industryCode, String addr
            , String fpTitle, String fpBankName, String fpBankAccNo, String fpPhoneNo, String fpTaxNo
            , String fpAddr, Long salesUserId, String remark, String accountNo);

    void updateCustomer(long id, String enterpriseName, String contacts, String phoneNo, String email
            , String contacts2, String phoneNo2, String email2
            , String tenantId, Integer statusCode, Integer typeCode, Integer industryCode, String addr
            , String fpTitle, String fpBankName, String fpBankAccNo, String fpPhoneNo, String fpTaxNo
            , String fpAddr,  String remark, String accountNo);
    void deleteCustomer(long id);

    /**
     * 生成客户编号
     */
    String generateCustomerNo();
}
