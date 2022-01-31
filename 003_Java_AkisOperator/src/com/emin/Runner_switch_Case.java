package com.emin;

import java.security.MessageDigest;
import java.util.Scanner;

public class Runner_switch_Case {

	public static void main(String[] args) {

		// if vs. Switch
		// Belii Aralýklar için ikullanýlýr. Switch..case Kullanýlmaz
		// Nokta Atýþý deðer kontrolü yapmak için switch..case kullanýlýr
		// switch..case ile yapýlabilen her kurgu if..else ile yapýlabilir
		// ancak, if..else ile yapýlan her kurgu switch..case ile yapýlmaz
		// iki durum içinde kullanýlan bir kurguda
		// switch..case if ..else yapýsýnda daha hýzlý çalýþýr.
		// case için sýnýrlar. : ile Break: arasýnda. {} kullanýlmaz

		System.out.println("******************** ");
		System.out.println("****  ÝÞLEMLER  **** ");
		System.out.println("******************** ");
		System.out.println("1. Toplama ");
		System.out.println("2. Çýkarma ");
		System.out.println("3. Çarpma ");
		System.out.println("4. Bölme ");
		System.out.println("5. MOD alma ");
		System.out.println("0. Ç I K I Þ ");
		System.out.println(" ");
		System.out.println("Seçiniz : ");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
// switch sizden kontrol edebilegi bir deger talep eder.
		//deðer, case ile kontrol edilir. asla ayný anda iki case eþt olmaz
		//note !! Ýf içinde ayný koþulu tektat yazabilir , ancak ilk koþul ço
		
		
		switch(secim) 
		{
		case 1: System.out.println("Toplama yapýldý");break;
		case 2: System.out.println("Çýkarma yapýldý"); break;
		case 3: System.out.println("Çarpma yapýldý"); break;
		case 4: System.out.println("Bölme yapýldý"); break;
		case 5: System.out.println("MOD yapýldý"); break;
		case 0: System.out.println("ÇIKIÞ YAPILDI "); break;
		
		default: System.out.println("!!  LÜTFEN 1 ÝLE 5 ARASINDA BÝR DEGER GÝRÝNÝZ  !!");
		
		
		}
		
	}

}
