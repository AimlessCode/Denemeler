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
				System.out.println("�IKTI");
				break;
			}
			
		}while(!cikis);
	}
	
	public static void Toplama() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Say�y� Giriniz");
		double s1 = sc.nextDouble();
		System.out.println("1. Say�y� Giriniz");
		double s2 = sc.nextDouble();
		double toplam = s1 + s2;
		System.out.println("�ki say�n�n Toplam� : " + toplam);

	}

	public static void Carpma() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Say�y� Giriniz");
		double s1 = sc.nextDouble();
		System.out.println("1. Say�y� Giriniz");
		double s2 = sc.nextDouble();
		double carp = s1 * s2;
		System.out.println("�ki say�n�n �arpmas� : " + carp);

	}

	public static int secim_methodu() {
		int secim;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Se�izi : ");

			secim = sc.nextInt();

		} while (secim < 0 || secim > 2);
		return secim;
	}

//METHOD TANIMLAMA
//eri�im Berliteci -> Opsiyonel dir. olmasada olur
//KeyWord'ler (Static,Final) -> Opsiyonel dir.
// Geri D�n�� tipi -> Zorunludur. void ya da dig�er bir dei�ken t�r�
//Method Ad� -> Zorunludur. her method i�in bir isim vermelisiniz
//Arg�man parabtezleri ->Zorunludur, i�inde de�er girmek opsiyonel dir.
//mMethod G�vdesi Ssl� Parantezleri -> Zorunludur. Kodlar Buraya yaz�l�r

	public static void Ekranayaz() {

		System.out.println("**********************");
		System.out.println("***** ��LEMLER *******");
		System.out.println("**********************");
		System.out.println();
		System.out.println("1-Toplama");
		System.out.println("2-Carpma");
		System.out.println("0-�IKI�");
		System.out.println(" ");
	}

}
