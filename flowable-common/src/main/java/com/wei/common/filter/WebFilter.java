package com.wei.common.filter;


import com.wei.common.constant.Constants;
import com.yuweix.assist4j.web.filter.CacheContentHttpFilter;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author yuwei
 */
public class WebFilter extends CacheContentHttpFilter {
	public WebFilter() {

	}

	@Override
	protected Map<String, Object> postLog(HttpServletRequest request) {
		String userName = (String) request.getAttribute(Constants.LOGIN_USER_NAME_KEY);
		if (userName == null) {
			return null;
		}

		Map<String, Object> map = new LinkedHashMap<>();
		map.put("userName", userName);
		return map;
	}
}

