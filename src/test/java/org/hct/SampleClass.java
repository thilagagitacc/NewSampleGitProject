package org.hct;

public class SampleClass {

	public static void main(String[] args) {
		String str="hello0";
		StringBuilder sb=new StringBuilder(); 
		for(int i=0;i<str.length();i++){ 
			sb.append((char)(str.charAt(i)+1)); 
		} 
		
		System.out.println(sb); 
	}
}
