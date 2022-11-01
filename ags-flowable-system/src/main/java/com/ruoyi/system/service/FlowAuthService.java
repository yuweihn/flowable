package com.ruoyi.system.service;


import com.ruoyi.system.domain.vo.*;
import java.util.List;


/**
 * 流程权限
 * @author yuwei
 */
public interface FlowAuthService {
    int queryFlowAuthWidgetCount(String procCategory);
    List<FlowAuthWidgetVo> queryFlowAuthWidgetList(String procCategory, int pageNo, int pageSize);

    long createFlowAuthWidget(String procCategory, String code, String name, String creator);
    void updateFlowAuthWidget(long id, String procCategory, String code, String name, String modifier);
    void deleteFlowAuthWidget(long id);

    /**
     * 查询流程权限相关的节点列表
     */
    List<FlowAuthNodeVo> queryFlowAuthNodeList(String deployId);
    void deleteFlowAuthNode(String procDefId, String nodeKey);

    List<FlowAuthNodeSettingVo> queryFlowAuthNodeSettingList(String procDefId, String nodeKey);
    void saveFlowAuthNodeSetting(String procDefId, String nodeKey, List<FlowAuthNodeSettingRequestVo> dataList, String creator);
    void deleteFlowAuthNodeSetting(long settingId);
    List<FlowAuthNodeTaskSettingVo> queryFlowAuthSettingListByTaskId(String taskId);

    /**
     * 根据taskId查询起始节点权限列表
     */
    List<FlowAuthNodeTaskSettingVo> queryStartNodeFlowAuthSettingListByTaskId(String taskId);
}
