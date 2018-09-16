package com.wyh.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CrosFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest requ, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response= (HttpServletResponse) resp;
        HttpServletRequest request=(HttpServletRequest) requ;
        response.setHeader("Access-Control-Allow-Origin",request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods","GET,POST,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age","2000");
        response.setHeader("Access-Control-Allow-Headers","Origin,X-Requested-with,Content-Type,Accept");
        response.setHeader("Access-Control-Allow-Credentials","true");
        
        chain.doFilter(requ,resp);
	}

	@Override
	public void destroy() {

	}

}
