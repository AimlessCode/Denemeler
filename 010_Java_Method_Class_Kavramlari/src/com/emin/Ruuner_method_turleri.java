package com.emin;

public class Ruuner_method_turleri {

	public static void main(String[] args) {

		int t = toplam(36, 99);
		System.out.println("Toplam : " + t);
		Kaydet ("ahmet", "Ba�" , "66565 4545 ",1980 ,true);
	}// main

	// Method T�releri
	// 1-
	void method_1() {

	}

	// 2-
	int method_2() {
		int sayi = 5;
		return sayi;
	}
	// 3-
	// Bu method, D��ar�da de�er alabilen bir method tur
	// ald��� de�erleri g�vdesi i�inde kullanabilir.

	static int toplam(int sayi1, int sayi2) {

		int t = sayi1 + sayi2;

		return t;
	}
	
	static boolean Kaydet(String ad,String Soyad, String telefon,int dogumyili, boolean aktif) {
		
		System.out.println(ad +" i�imli ki�i kaydedildi");
	return true;
	}
	
	

}// Class
