package com.ruoyi.common.core.domain.model;


import lombok.Data;
import java.io.Serializable;


/**
 * @author yuwei
 */
@Data
public class WechatLoginResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String openId;
	private String sessionKey;
	private String unionId;
	
	
	public WechatLoginResult() {
		
	}
	public WechatLoginResult(String openId, String sessionKey, String unionId) {
		this.openId = openId;
		this.sessionKey = sessionKey;
		this.unionId = unionId;
	}
}

