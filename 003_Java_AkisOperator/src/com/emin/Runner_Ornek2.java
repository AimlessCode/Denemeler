package com.emin;

import java.util.Scanner;

public class Runner_Ornek2 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int s1, s2, s3;
		//3 sayımız olsun sayıları kullancıdan
		//girdi olarak alalım
		System.out.println("1. sayıyı giriniz : ");
		s1 = sc.nextInt(); 
		System.out.println("2. sayıyı giriniz : ");
		s2 = sc.nextInt(); 
		System.out.println("3. sayıyı giriniz : ");
		s3 = sc.nextInt(); 
		
		int buyuk_Say , kucuk_say;
		
	if(s1>s2 && s1>s3) buyuk_Say=s1;
	else if(s2>s1 && s2>s3) buyuk_Say=s2;
	else buyuk_Say=s3;
	
	
	
	if(s1<s2 && s1<s3) kucuk_say=s1;
	else if(s2<s1 && s2<s3) kucuk_say=s2;
	else kucuk_say=s3;
	
	
	System.out.println("Büyük sayı :  "+buyuk_Say );
	System.out.println("Küçük sayı :  "+ kucuk_say);
	
	
		
		
	}

}
