package com.wei.flowable.service;


import java.util.List;
import com.wei.flowable.domain.dto.SysFormDto;


public interface ISysFormService {
    /**
     * 查询流程表单
     * 
     * @param formId 流程表单ID
     * @return 流程表单
     */
    SysFormDto selectSysFormById(Long formId);

    int findFormCount(String formName);
    /**
     * 查询流程表单列表
     */
    List<SysFormDto> findFormList(String formName, Integer pageNo, Integer pageSize);

    /**
     * 新增流程表单
     */
    long insertSysForm(String formName, byte formType, String formContent, String remark, String accountNo);

    /**
     * 修改流程表单
     */
    void updateSysForm(long id, String formName, byte formType, String formContent, String remark, String accountNo);

    /**
     * 删除流程表单信息
     * 
     * @param formId 流程表单ID
     * @return 结果
     */
    int deleteSysFormById(Long formId);
}
