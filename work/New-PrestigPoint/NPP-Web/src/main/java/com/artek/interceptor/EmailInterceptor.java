package com.artek.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class EmailInterceptor extends HandlerInterceptorAdapter
{
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
	System.out.println("In Email pre Handler ");
	//return super.preHandle(request, response, handler);
	return true;
}
@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	System.out.println("In Email post Handler ");
		super.postHandle(request, response, handler, modelAndView);
	}
@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	System.out.println("In Email after Completion ");
		super.afterCompletion(request, response, handler, ex);
	}
}
