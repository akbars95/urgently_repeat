package com.mtsmda.javaQuestions;

import java.io.*;
import java.util.Date;

public class Encounters {
	
	private static final String DELIMITER_AP = "'";
	private static final String DELIMITER_TILIDA = "~";
	
	public static void main(String[] args) throws Exception {
		StringBuilder string = new StringBuilder();
		StringBuilder stringNew = new StringBuilder();
		long start = System.currentTimeMillis();
		File file = new File("E:\\work\\18052015\\11\\20112015\\#96109\\batching\\XY_1K_Encounters.dat");
		Reader reader = new FileReader(file);
		int g;
		int count = 0;
		while((g = reader.read()) != -1){
			string.append((char)g);
//			System.out.println(count++);
		}
		
//		System.out.println("Final - " + count + " =========== string.length() - " + string.length());
		System.out.println(" =========== string.length() - " + string.length());
		
//		System.out.println(string);
		
		String[] split = string.toString().split(DELIMITER_AP);
		
//		System.out.println("split.length - " + split.length);
//		int countNM185 = 0;
		for(String s : split){
			String[] split2 = s.split(DELIMITER_TILIDA);
			if(s.contains("NM1" + DELIMITER_TILIDA + "85")){
				/*System.out.println(s);
				System.out.println(split2.length);*/
				if(split2.length == 10){
					if(split2[split2.length - 2] != null && split2[split2.length - 2].equals("ZY")){
						/*split2[split2.length - 2] = "";
						split2[split2.length - 1] = "";*/
//						countNM185++;
						s = arrayToString(split2).toString();
//						System.out.println(s);
//						System.out.println(countNM185);
					}
				}
			}
			stringNew.append(s).append(DELIMITER_AP);
		}
		
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("time = " + time);
		
//		System.out.println("string = " + string);
//		System.out.println("\n");
//		System.out.println("\n\nstringNew = " + stringNew + "\n\n");

		File file1 = new File(file.getParent() + File.separator + "temp" + new Date().getTime() + ".dat");
		System.out.println(file1.getAbsoluteFile());
		file1.createNewFile();
		Writer writer = new FileWriter(file1);
		writer.write(stringNew.toString());
		writer.flush();
		writer.close();
		
//		System.out.println("countNM185 = " + countNM185);
		System.out.println("DONE");
		
		
		
		
	}
	
	private static boolean isNotBlank(String str){
		if(str != null && !str.isEmpty()){
			return true;
		}
		return false;
	}
	
	private static StringBuilder arrayToString(String [] strs){
		StringBuilder strReturn = new StringBuilder();
		if(strs != null && strs.length > 0){
			for(int i = 0; i < strs.length - 2; i++){
				strReturn.append(DELIMITER_TILIDA).append(strs[i]);
			}
			if(strReturn.charAt(0) == '~'){
				strReturn = new StringBuilder(strReturn.substring(1, strReturn.length()));
			}
		}
		return strReturn;
	}
	
	
}