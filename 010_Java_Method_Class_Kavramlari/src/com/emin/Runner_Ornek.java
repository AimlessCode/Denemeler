package com.emin;

import java.util.Scanner;

public class Runner_Ornek {

	public static void main(String[] args) {
		// kullanýcýdan iki sayý alan aldýgý sayýlarý
		// bir method a agönderen ve sonucunu ekrana
		// yazdýran methodu bütününü kodyayýnýz

		Scanner sc = new Scanner(System.in);
		System.out.println("1. sayý gir : ");
		int s1 = sc.nextInt();
		System.out.println("2. sayý gir : ");
		int s2 = sc.nextInt();
		
		int toplam=Toplama(s1, s2);
		System.out.println("Sonuç : "+toplam );
		

	}// main

	public static int Toplama(int s1, int s2) {
		
		int toplam =s1+s2;
		
		return toplam;
	}
	
	
	
}// class
