package com.wei.common.constant;



/**
 * 流程常量信息
 *
 * @author Xuan xuan
 * @date 2021/4/17 22:46
 */
public class ProcessConstants {

    /**
     * 动态数据
     */
    public static final String DATA_TYPE = "dynamic";

    /**
     * 单个审批人
     */
    public static final String USER_TYPE_ASSIGNEE = "assignee";


    /**
     * 候选人
     */
    public static final String USER_TYPE_USERS = "candidateUsers";


    /**
     * 审批组
     */
    public static final String USER_TYPE_ROUPS = "candidateGroups";

    /**
     * 单个审批人
     */
    public static final String PROCESS_APPROVAL = "approval";

    /**
     * 会签人员
     */
    public static final String PROCESS_MULTI_INSTANCE_USER = "userList";

    /**
     * nameapace
     */
    public static final String NAMASPASE = "http://flowable.org/bpmn";

    /**
     * 会签节点
     */
    public static final String PROCESS_MULTI_INSTANCE = "multiInstance";

    /**
     * 自定义属性 dataType
     */
    public static final String PROCESS_CUSTOM_DATA_TYPE = "dataType";

    /**
     * 自定义属性 userType
     */
    public static final String PROCESS_CUSTOM_USER_TYPE = "userType";

    /**
     * 初始化人员
     */
    public static final String PROCESS_INITIATOR = "INITIATOR";
    public static final String PROCESS_INITIATOR_2 = "#{INITIATOR}";

    /**
     * 部门负责人
     */
    public static final String DEPT_LEADER = "deptLeader";
    public static final String DEPT_LEADER_2 = "#{deptLeader}";

    /**
     * 订单流程是否涉及非标产品
     */
    public static final String PROCESS_ORDER_INVOLVE_NON_STANDARD = "ORDER_INVOLVE_NON_STANDARD";

    /**
     * 流程跳过
     */
    public static final String FLOWABLE_SKIP_EXPRESSION_ENABLED = "_FLOWABLE_SKIP_EXPRESSION_ENABLED";

    /**
     * 流程启动节点Key
     */
    public static final String PROCESS_START_TASK_KEY = "startTaskKeyOfProc";

    /**
     * 是否涉及非标 involveNonStandard
     */
    public static final String INVOLVE_NON_STANDARD = "involveNonStandard";
}
