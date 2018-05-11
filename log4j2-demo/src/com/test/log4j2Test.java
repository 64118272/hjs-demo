package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2Test {

	static Logger logger = LogManager.getLogger(log4j2Test.class);

	public void testLevel() {
		logger.trace("this is trace");
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is error");
		logger.fatal("this is fatal");
	}
}
