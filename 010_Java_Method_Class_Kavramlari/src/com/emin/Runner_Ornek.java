package com.emin;

import java.util.Scanner;

public class Runner_Ornek {

	public static void main(String[] args) {
		// kullan�c�dan iki say� alan ald�g� say�lar�
		// bir method a ag�nderen ve sonucunu ekrana
		// yazd�ran methodu b�t�n�n� kodyay�n�z

		Scanner sc = new Scanner(System.in);
		System.out.println("1. say� gir : ");
		int s1 = sc.nextInt();
		System.out.println("2. say� gir : ");
		int s2 = sc.nextInt();
		
		int toplam=Toplama(s1, s2);
		System.out.println("Sonu� : "+toplam );
		

	}// main

	public static int Toplama(int s1, int s2) {
		
		int toplam =s1+s2;
		
		return toplam;
	}
	
	
	
}// class
