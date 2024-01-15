package com.wei.framework.interceptor;


import com.wei.common.constant.Constants;
import com.wei.common.core.domain.model.LoginUser;
import com.wei.framework.web.service.TokenService;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author yuwei
 */
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
	@Resource
	private TokenService tokenService;


	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		LoginUser loginUser = tokenService.getLoginUser(request);
		if (loginUser != null) {
			request.setAttribute(Constants.LOGIN_USER_NAME_KEY, loginUser.getUsername());
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
}
