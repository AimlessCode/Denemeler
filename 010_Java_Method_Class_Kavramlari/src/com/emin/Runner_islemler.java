package com.emin;

import java.util.Scanner;

public class Runner_islemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void Uygulama() {
		boolean cikis=false;
		do {
			Ekranayaz();

			switch (secim_methodu()) {
			case 1:
				Toplama();
				break;
			case 2:
				Carpma();
				break;
			default:
				
				cikis=true;
				System.out.println("ÇIKTI");
				break;
			}
			
		}while(!cikis);
	}
	
	public static void Toplama() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Sayýyý Giriniz");
		double s1 = sc.nextDouble();
		System.out.println("1. Sayýyý Giriniz");
		double s2 = sc.nextDouble();
		double toplam = s1 + s2;
		System.out.println("Ýki sayýnýn Toplamý : " + toplam);

	}

	public static void Carpma() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Sayýyý Giriniz");
		double s1 = sc.nextDouble();
		System.out.println("1. Sayýyý Giriniz");
		double s2 = sc.nextDouble();
		double carp = s1 * s2;
		System.out.println("Ýki sayýnýn Çarpmasý : " + carp);

	}

	public static int secim_methodu() {
		int secim;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Seçizi : ");

			secim = sc.nextInt();

		} while (secim < 0 || secim > 2);
		return secim;
	}

//METHOD TANIMLAMA
//eriþim Berliteci -> Opsiyonel dir. olmasada olur
//KeyWord'ler (Static,Final) -> Opsiyonel dir.
// Geri Dönüþ tipi -> Zorunludur. void ya da digðer bir deiþken türü
//Method Adý -> Zorunludur. her method için bir isim vermelisiniz
//Argüman parabtezleri ->Zorunludur, içinde deðer girmek opsiyonel dir.
//mMethod Gövdesi Sslü Parantezleri -> Zorunludur. Kodlar Buraya yazýlýr

	public static void Ekranayaz() {

		System.out.println("**********************");
		System.out.println("***** ÝÞLEMLER *******");
		System.out.println("**********************");
		System.out.println();
		System.out.println("1-Toplama");
		System.out.println("2-Carpma");
		System.out.println("0-ÇIKIÞ");
		System.out.println(" ");
	}

}
