package com.ruoyi.system.service;


import com.ruoyi.system.domain.Order;
import com.ruoyi.system.domain.vo.*;

import java.util.Date;
import java.util.List;


/**
 * 订单相关
 * @author yuwei
 */
public interface OrderService {
    long createOrder(String procInsId, OrderVo orderVo, long userId, String creator);
    void updateOrder(String procInsId, OrderVo orderVo, String modifier);

    List<OrderDropDownVo> getOrderDropDownList(String customerNo, Long userId, String keywords, int pageNo, int pageSize);

    /**
     * 查询指定客户未绑定合同的订单列表
     */
    List<OrderDropDownVo> getUnboundContractOrderListByCustomerNo(String customerNo, String title, int pageNo, int pageSize);

    /**
     * 根据合同ID查询订单列表
     */
    List<OrderDropDownVo> getOrderDropDownListByContractId(long contractId, String title, int pageNo, int pageSize);

    Order getOrder(String procInsId);

    String getFullOrderTitle(String procInsId);

    int queryOrderCount(String customerNo, Long userId, String keywords, String fuzzyOrderNo
            , Date startTime, Date endTime);
    List<BizOrderVo> queryOrderList(String customerNo, Long userId, String keywords, String fuzzyOrderNo
            , Date startTime, Date endTime, int pageNo, int pageSize);

    int queryOrderPortCount(long orderId);
    List<BizOrderVo.Port> queryOrderPortList(long orderId, int pageNo, int pageSize);

    int queryOrderDeviceCount(long orderId);
    List<BizOrderVo.Device> queryOrderDeviceList(long orderId, int pageNo, int pageSize);

    int queryOrderMplsIpsecCount(long orderId);
    List<BizOrderVo.MplsIpsec> queryOrderMplsIpsecList(long orderId, int pageNo, int pageSize);

    int queryOrderSpecialLineCount(long orderId);
    List<BizOrderVo.SpecialLine> queryOrderSpecialLineList(long orderId, int pageNo, int pageSize);

    int queryOrderInternetCount(long orderId);
    List<BizOrderVo.Internet> queryOrderInternetList(long orderId, int pageNo, int pageSize);

    int queryOrderIdcCount(long orderId);
    List<BizOrderVo.Idc> queryOrderIdcList(long orderId, int pageNo, int pageSize);

    int queryOrderSrvCount(long orderId);
    List<BizOrderVo.Srv> queryOrderSrvList(long orderId, int pageNo, int pageSize);

    int queryOrderIntegrationCount(long orderId);
    List<BizOrderVo.Integration> queryOrderIntegrationList(long orderId, int pageNo, int pageSize);

    void deleteOrder(long orderId);

    BizOrderVo getOrderInfo(long orderId);
}
