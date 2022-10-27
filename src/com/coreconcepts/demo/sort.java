package com.coreconcepts.demo;

import java.util.Arrays;
import java.util.Scanner;

public class sort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		System.out.print(Upper(str));
		System.out.print(Lower(str));
		
	}
	public static String Upper(String str) {
	
		int len=str.length()/2;
		
		String str1=str.substring(0, len).toUpperCase();
		
		return str1;
}
	public static String Lower(String str) {
		{
			int len=str.length()/2;
		
		String str2=str.substring(len, str.length()).toLowerCase();
		
	  return str2;
	}
	}
}
