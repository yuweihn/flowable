package com.ruoyi.system.service.impl;


import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.system.service.QiyeWeixinService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.List;


@Service
public class QiyeWeixinServiceImpl implements QiyeWeixinService {
    @Value("${qiye.weixin.weixinApi}")
    private String weixinApi;
    @Value("${qiye.weixin.sendNewsApi}")
    private String sendNewsApi ;
    @Value("${qiye.weixin.qiyeSecret}")
    private String qiyeSecret ;
    @Value("${qiye.weixin.qiyeAppId}")
    private String qiyeAppId;


    @Override
    public String getAccessToken() {
        String url = this.weixinApi + "/gettoken?corpid=" + qiyeAppId + "&corpsecret=" + qiyeSecret;
        HttpRequest request = HttpUtil.createGet(url);
        HttpResponse response = request.execute();
        JSONObject data = this.getBody(response);
        return data.get("access_token").toString();
    }

    @Override
    public void sendNewsMessage(List<String> userNames, String title) {
        String ACCESS_TOKEN = this.getAccessToken();
        String requestUrl = this.sendNewsApi + ACCESS_TOKEN;
        HttpRequest request = HttpRequest.of(requestUrl);
        request.method(cn.hutool.http.Method.POST);
        JSONObject json = new JSONObject();
        StringBuilder toUser = new StringBuilder();
        for (String username : userNames) {
            toUser.append(username).append("|");
        }
        json.put("touser", toUser.toString());
        json.put("toparty", "@all");
        json.put("totag", "@all");
        json.put("msgtype", "text");
        json.put("agentid", 1000004);
        Map<String, Object> map = new HashMap<>();
        map.put("content", title);
        json.put("text", map);
        request.body(String.valueOf(json)).timeout(30000).execute().body();
    }

    private JSONObject getBody(HttpResponse response) {
        if (response.getStatus() != 200) {
            throw new RuntimeException(response.getStatus() + "" +response.body());
        }
        String respBody = response.body();
        return JSON.parseObject(respBody);
    }
}
