package com.mtsmda.designPatterns.singleton;
/**
 * singleton with lazy loading protected multi thread
 * */
public class SingletonMultiTherad {
	
	private static SingletonMultiTherad instance;
	
	private SingletonMultiTherad(){
		
	}
	
	public static synchronized SingletonMultiTherad getInstance(){
		if(instance == null){
			instance = new SingletonMultiTherad();
		}
		return instance;
	}
	
}