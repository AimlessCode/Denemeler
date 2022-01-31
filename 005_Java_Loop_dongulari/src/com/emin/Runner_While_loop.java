package com.emin;

import java.util.Scanner;

public class Runner_While_loop {

	public static void main(String[] args) {
		// while döngüsü daha çok belli kriterleri
		// Saglamak durumunda kullanýlýr
		// DÝKKAT !!! Tüm Döngüler bir birine yerine
		// kullanýlabilir

		// Parentez içi Dogru ise sürekli döner
		boolean kosul = false;
		while (kosul) {

					  }

		//------------------
		
		// E dersek sitem tekrar döner
		Scanner sc=new Scanner(System.in);
		
		String secim="E";
		kosul=true;
		while(secim.equals("E")) {
			System.out.println("1. sayý giriniz");
			int s1 =sc.nextInt();
			
			System.out.println("2. sayý giriniz");
			int s2 =sc.nextInt();
			int toplam =s1+s2;
			System.out.println("Toplam : " + toplam);
			sc= new Scanner(System.in); //Sitemi Ýnt'ten Stringe cevirdik
			System.out.println("Devam etmek ister misin (E/H) ");
			secim = sc.nextLine();
		}
		
		System.out.println("--------------- ");
		
		int faktoriel = 1 ;
		System.out.println("Sayý gir : ");
		int sayi = sc.nextInt();
		int sayac =sayi;
		
		while(sayac>0) {
			faktoriel*=sayac;
			sayac--;

		}

		System.out.println("Faktoriel Sayaç : "+ faktoriel);
	}
}
