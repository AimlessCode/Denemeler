package com.emin;

import java.util.Scanner;

public class Runner_Ornek2 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int s1, s2, s3;
		//3 say�m�z olsun say�lar� kullanc�dan
		//girdi olarak alal�m
		System.out.println("1. say�y� giriniz : ");
		s1 = sc.nextInt(); 
		System.out.println("2. say�y� giriniz : ");
		s2 = sc.nextInt(); 
		System.out.println("3. say�y� giriniz : ");
		s3 = sc.nextInt(); 
		
		int buyuk_Say , kucuk_say;
		
	if(s1>s2 && s1>s3) buyuk_Say=s1;
	else if(s2>s1 && s2>s3) buyuk_Say=s2;
	else buyuk_Say=s3;
	
	
	
	if(s1<s2 && s1<s3) kucuk_say=s1;
	else if(s2<s1 && s2<s3) kucuk_say=s2;
	else kucuk_say=s3;
	
	
	System.out.println("B�y�k say� :  "+buyuk_Say );
	System.out.println("K���k say� :  "+ kucuk_say);
	
	
		
		
	}

}
