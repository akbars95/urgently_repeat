package com.mtsmda.designPatterns.creatinal.singleton;
/**
 * singleton with eager loading final instance variable 
 * */
public class EagerFinalSingleton {
	
	private static final EagerFinalSingleton instance = new EagerFinalSingleton();
	
	private EagerFinalSingleton(){
		
	}
	
	public static EagerFinalSingleton getInstance(){
		return instance;
	}
	
}