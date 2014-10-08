package com.songli.sessionmanage.servlet.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.LogFactory;

import com.songli.sessionmanage.util.LoggerUtil;

public abstract class BaseFilter implements Filter {

	protected FilterConfig filterConfig;
	protected LoggerUtil logger;
	
	public BaseFilter() {
		logger = new LoggerUtil(LogFactory.getLog(BaseFilter.class));
	}
	
	public void destroy() {
		logger.info("Destroy filter.");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		logger.info("Init filter now.");
	}

}
