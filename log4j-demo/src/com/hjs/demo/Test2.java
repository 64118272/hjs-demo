package com.hjs.demo;

public class Test2 extends TestBase{

	public void testLog4j(){
		logger.debug("test2 this is debug ");
		logger.info("test2 this is info ");
		logger.warn("test2 this is warn ");
		logger.error("test2 this is error ");
	}
	
	public void testLogException(){
		try{
			int x = 1/0;
		}catch (Exception exception) {
			logger.error(exception.getMessage() + "\n" + exception);
		}
	}
}
