package com.emin;

import java.util.Scanner;

public class Runner_While_loop {

	public static void main(String[] args) {
		// while d�ng�s� daha �ok belli kriterleri
		// Saglamak durumunda kullan�l�r
		// D�KKAT !!! T�m D�ng�ler bir birine yerine
		// kullan�labilir

		// Parentez i�i Dogru ise s�rekli d�ner
		boolean kosul = false;
		while (kosul) {

					  }

		//------------------
		
		// E dersek sitem tekrar d�ner
		Scanner sc=new Scanner(System.in);
		
		String secim="E";
		kosul=true;
		while(secim.equals("E")) {
			System.out.println("1. say� giriniz");
			int s1 =sc.nextInt();
			
			System.out.println("2. say� giriniz");
			int s2 =sc.nextInt();
			int toplam =s1+s2;
			System.out.println("Toplam : " + toplam);
			sc= new Scanner(System.in); //Sitemi �nt'ten Stringe cevirdik
			System.out.println("Devam etmek ister misin (E/H) ");
			secim = sc.nextLine();
		}
		
		System.out.println("--------------- ");
		
		int faktoriel = 1 ;
		System.out.println("Say� gir : ");
		int sayi = sc.nextInt();
		int sayac =sayi;
		
		while(sayac>0) {
			faktoriel*=sayac;
			sayac--;

		}

		System.out.println("Faktoriel Saya� : "+ faktoriel);
	}
}
