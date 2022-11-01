package com.ruoyi.framework.config;


import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.common.utils.WechatUtil;
import com.yuweix.assist4j.core.cloud.CosUtil;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Constructor;


/**
 * @author yuwei
 */
@Configuration
public class SpringConf {
    @Bean
    public CosUtil cosUtil(@Value("${cos.secretId}")String secretId, @Value("${cos.secretKey}")String secretKey
            , @Value("${cos.region}")String region, @Value("${cos.protocol:}")String protocol
            , @Value("${cos.bucketName}")String bucketName) {
        return new CosUtil(secretId, secretKey, region, protocol, bucketName);
    }

    @Bean(name = "wechatUtil")
    public WechatUtil wechatUtil(@Qualifier("redisCache") RedisCache cache) {
        try {
            Class<?> clz = Class.forName(WechatUtil.class.getName());
            Constructor<?> constructor = clz.getDeclaredConstructor();
            constructor.setAccessible(true);
            WechatUtil wechatUtil = (WechatUtil) constructor.newInstance();
            wechatUtil.setCache(cache);
            return wechatUtil;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
