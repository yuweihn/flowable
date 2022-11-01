package com.ruoyi.system.mapper;


import com.ruoyi.system.domain.OrderDevice;
import com.yuweix.assist4j.dao.mybatis.BaseMapper;
import com.yuweix.assist4j.dao.mybatis.provider.AbstractProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;


/**
 * @author yuwei
 */
public interface OrderDeviceMapper extends BaseMapper<OrderDevice, Long> {
    @SelectProvider(type = Provider.class, method = "queryOrderDeviceCount")
    int queryOrderDeviceCount(@Param("orderId")long orderId);

    @SelectProvider(type = Provider.class, method = "queryOrderDeviceList")
    List<OrderDevice> queryOrderDeviceList(@Param("orderId")long orderId
            , @Param("pageNo")Integer pageNo, @Param("pageSize")Integer pageSize);

    class Provider extends AbstractProvider {
        public String queryOrderDeviceCount(Map<String, Object> param) {
            StringBuilder builder = new StringBuilder("");
            builder.append(" select count(a.id) as cnt ");
            builder.append(" from ").append(getTableName(OrderDevice.class)).append(" a ");
            builder.append(" where a.order_id = #{orderId} ");
            return builder.toString();
        }

        public String queryOrderDeviceList(Map<String, Object> param) {
            Integer pageNo = (Integer) param.get("pageNo");
            Integer pageSize = (Integer) param.get("pageSize");

            StringBuilder builder = new StringBuilder("");
            builder.append(" select ").append(getAllColumnSql(OrderDevice.class, "a"));
            builder.append(" from ").append(getTableName(OrderDevice.class)).append(" a ");
            builder.append(" where a.order_id = #{orderId} ");
            builder.append(" order by a.id ");
            if (pageNo != null && pageSize != null) {
                builder.append(" limit ").append((pageNo - 1) * pageSize).append(", ").append(pageSize);
            }
            return builder.toString();
        }
    }
}
