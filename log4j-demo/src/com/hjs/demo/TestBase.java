package com.hjs.demo;

import org.apache.log4j.Logger;

public class TestBase {
	static Logger logger = Logger.getLogger(TestBase.class);

//	static Logger getInstance(){
//		if(logger == null){
//			logger = Logger.getLogger(TestBase.class);
//		}
//		
//		return logger;
//	}
//	
//	public void addDebug(String debugString){
//		Logger logger = TestBase.getInstance();
//		logger.debug(debugString);
//	}
//	
//	public void addInfo(String infoString){
//		Logger logger = TestBase.getInstance();
//		logger.info(infoString);
//	}
//	
//	public void addWarn(String warnString){
//		Logger logger = TestBase.getInstance();
//		logger.warn(warnString);
//	}
//	
//	public void addError(String errorString){
//		Logger logger = TestBase.getInstance();
//		logger.error(errorString);
//	}
//	
//	public void addError(Exception exception){
//		Logger logger = TestBase.getInstance();
//		logger.error(exception.getMessage() + "\n" + exception);
//	}
}
