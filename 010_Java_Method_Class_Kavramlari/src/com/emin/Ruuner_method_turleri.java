package com.emin;

public class Ruuner_method_turleri {

	public static void main(String[] args) {

		int t = toplam(36, 99);
		System.out.println("Toplam : " + t);
		Kaydet ("ahmet", "Baþ" , "66565 4545 ",1980 ,true);
	}// main

	// Method Türeleri
	// 1-
	void method_1() {

	}

	// 2-
	int method_2() {
		int sayi = 5;
		return sayi;
	}
	// 3-
	// Bu method, Dýþarýda deðer alabilen bir method tur
	// aldýðý deðerleri gövdesi içinde kullanabilir.

	static int toplam(int sayi1, int sayi2) {

		int t = sayi1 + sayi2;

		return t;
	}
	
	static boolean Kaydet(String ad,String Soyad, String telefon,int dogumyili, boolean aktif) {
		
		System.out.println(ad +" iþimli kiþi kaydedildi");
	return true;
	}
	
	

}// Class
