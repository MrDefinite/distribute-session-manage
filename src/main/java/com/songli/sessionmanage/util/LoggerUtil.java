package com.songli.sessionmanage.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;

public class LoggerUtil {
	private Log logger;
	
	public LoggerUtil(Log logger) {
		this.logger = logger;
	}
	
	public void info(String message) {
		if (message == null || message.isEmpty()) {
			return;
		}
		logger.info("[" + getCurrentTime() + "] " + message);
	}
	
	public void debug(String message) {
		if (message == null || message.isEmpty()) {
			return;
		}
		logger.debug("[" + getCurrentTime() + "] " + message);
	}
	
	public void warning(String message) {
		if (message == null || message.isEmpty()) {
			return;
		}
		logger.warn("[" + getCurrentTime() + "] " + message);
	}
	
	public void error(String message) {
		if (message == null || message.isEmpty()) {
			return;
		}
		logger.error("[" + getCurrentTime() + "] " + message);
	}
	
	private String getCurrentTime() {
		long currentTime = System.currentTimeMillis();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		Date date = new Date(currentTime);
		return formatter.format(date);
	}
}
