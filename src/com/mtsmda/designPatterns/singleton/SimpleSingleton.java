package com.mtsmda.designPatterns.singleton;
/**
 * simple singleton with lazy loading
 * */
public class SimpleSingleton {
	
	private static SimpleSingleton instance;
	
	private SimpleSingleton(){
		
	}
	
	public static SimpleSingleton getInstance(){
		if(instance == null){
			instance = new SimpleSingleton();
		}
		return instance;
	}
	
}