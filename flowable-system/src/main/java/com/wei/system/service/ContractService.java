package com.wei.system.service;


import com.wei.system.domain.Contract;
import com.wei.system.domain.vo.*;

import java.util.Date;
import java.util.List;


/**
 * 合同相关
 * @author yuwei
 */
public interface ContractService {
    long createContract(String procInsId, ContractVo contractVo, long userId, String creator);
    void updateContract(String procInsId, ContractVo contractVo, String modifier);

    List<ContractDropDownVo> getContractDropDownList(String customerNo, Long userId, String title, int pageNo, int pageSize);

    Contract getContract(String procInsId);

    String getFullContractTitle(String procInsId);

    int queryContractCount(String customerNo, Long userId, String title, String fuzzyContractNo
            , Date startTime, Date endTime);

    List<BizContractVo> queryContractList(String customerNo, Long userId, String title, String fuzzyContractNo
            , Date startTime, Date endTime, int pageNo, int pageSize);

    void deleteContract(long contractId);

    int queryContractAttachCount(long contractId);
    List<BizContractVo.Attach> queryContractAttachList(long contractId, int pageNo, int pageSize);

    int queryContractOrderCount(long contractId);
    List<BizContractVo.Order> queryContractOrderList(long contractId, int pageNo, int pageSize);

    BizContractVo findContractById(long contractId);

    BizContractVo getContractInfo(long contractId);
}
