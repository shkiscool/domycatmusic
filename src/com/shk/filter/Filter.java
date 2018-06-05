package com.shk.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户的过滤器（防止未登录用户进入只有已登陆用户才能登录的界面）
 * 
 * @author Administrator
 *
 */
@WebFilter(urlPatterns={"/mvc/*","/GoodsController","/TypeController"})
public class Filter implements javax.servlet.Filter {

    /**
     * Default constructor. 
     */
    public Filter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 * 执行过滤操作
	 * 
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String requestUri = req.getRequestURI();
		
		String url = requestUri.substring(requestUri.lastIndexOf("/")+1);
		
		if(null != req.getSession().getAttribute("users")) {
			chain.doFilter(request, response);
		}else {
			if("login.jsp".equals(url)) {
				chain.doFilter(request, response);
			}else if("sign_up.jsp".equals(url)){
				chain.doFilter(request, response);
			}else if("forgot.jsp".equals(url)){
				chain.doFilter(request, response);
			}else{
				res.sendRedirect("/dymmusic/login.jsp");
			}
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
