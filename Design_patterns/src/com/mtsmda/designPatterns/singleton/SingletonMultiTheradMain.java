package com.mtsmda.designPatterns.singleton;

/**
 * singleton with lazy loading protected multi thread
 */
public class SingletonMultiTheradMain {

	private static SingletonMultiTheradMain instance;

	private SingletonMultiTheradMain() {

	}

	public static SingletonMultiTheradMain getInstance() {
		if (instance == null) {
			synchronized (SingletonMultiTheradMain.class) {
				if (instance == null) {
					instance = new SingletonMultiTheradMain();
				}
			}
		}
		return instance;
	}

}