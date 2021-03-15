package com.inhouse.utillogging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class UtilLoggingEx {
	private static Logger logger = Logger.getLogger(UtilLoggingEx.class.getName());
	public static void main(String[] args) {
		try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("C:\\Sandip-Data\\Study\\java-repository\\UtilLoggging\\src\\log.properties"));
			logger.setLevel(Level.FINE);
			
			// FileHandler file name with max size and number of log files limit
			Handler fileHandler = new FileHandler("C:\\Sandip-Data\\Study\\java-repository\\UtilLoggging\\src\\application.log");
			fileHandler.setFormatter(new CustomLogFormatter());
			
			// Custom log formatter			
			fileHandler.setFilter(new CustomLogFilter());
		
			// adding custom handler
			logger.addHandler(new ConsoleHandler());
			logger.addHandler(new CustomLogHandler());
			logger.addHandler(fileHandler);
			
			for(int i=0;i<10;i++) {
				logger.log(Level.INFO,"Message : " + i);
			}
			logger.log(Level.CONFIG,"Configuration data"); // filtered log record
			
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

}
