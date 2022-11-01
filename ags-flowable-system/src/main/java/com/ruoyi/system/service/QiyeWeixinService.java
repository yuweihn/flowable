package com.ruoyi.system.service;


import java.util.List;


public interface QiyeWeixinService {
    String getAccessToken();
    void sendNewsMessage(List<String> userNames, String title);
}
