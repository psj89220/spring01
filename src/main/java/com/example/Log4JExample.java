package com.example;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Log4JExample {
	/*
	 * 1. Java 내장 Logger
	 * 2. Apache Commons Logger(Logger 자동으로 찾아줌: 현재 Log4J, 권장)
	 * 3. Log4J Logger(Direct)
	 */
	static Logger log1 = Logger.getLogger(Log4JExample.class.getName());
	static Log log2 = LogFactory.getLog(Log4JExample.class);
	static org.apache.log4j.Logger log3 = org.apache.log4j.Logger.getLogger(Log4JExample.class);
	
	public static void main(String[] args) {
		// 1
		log1.info("########################");
		log1.info("util logging...");
		log1.info("########################");
		
		// 2
		log2.info("########################");
		log2.info("commons logging...");
		log2.info("########################");
		
		// 3
		log3.info("########################");
		log3.info("log4j logging...");
		log3.info("########################");
		
	}

}
