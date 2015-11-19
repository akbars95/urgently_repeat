package com.mtsmda.javaQuestions.javaClassLoader;

public class ClassLoaderE {
	
	public static void main(String[] args) {
		String string = new String("text");
		
		System.out.println(string.getClass().getClassLoader());
		
		Integer i23 = 23;
		System.out.println(i23.getClass().getClassLoader() == null ? "bootsrap loader" : "user loader - " + i23.getClass().getClassLoader());
	}
	
}

class AClassLoader{
	
	
}