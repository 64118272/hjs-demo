package com.hjs.demo;


public class Test1 extends TestBase {
	
	static Test2 test2 = new Test2();
	static Test3 test3 = new Test3();
	
	public static void main(String[] args){
				
		test2.testLog4j();
		test3.testLog4j();
		
		test2.testLogException();
	}
}
