package com.wei.system.service;


import com.wei.system.domain.Impl;
import com.wei.system.domain.vo.BizImplVo;
import com.wei.system.domain.vo.ImplVo;

import java.util.Date;
import java.util.List;


/**
 * 实施启动相关
 * @author yuwei
 */
public interface ImplService {
    long createImpl(String procInsId, ImplVo implVo, long userId, String creator);
    void updateImpl(String procInsId, ImplVo implVo, String modifier);

    Impl getImpl(String procInsId);
    String getFullImplTitle(String procInsId);

    int queryImplCount(String customerNo, Long preSalesId, String title, String fuzzyImplNo
            , Date startTime, Date endTime);
    List<BizImplVo> queryImplList(String customerNo, Long preSalesId, String title, String fuzzyImplNo,
                                  Date startTime, Date endTime, int pageNo, int pageSize);

    int queryImplOrderCount(long implId);
    List<BizImplVo.Order> queryImplOrderList(long implId, int pageNo, int pageSize);

    void deleteImpl(long implId);

    BizImplVo queryImplById(long implId);

    BizImplVo getImplInfo(long implId);
}
