package com.Emin;

public class Runner_Cokboyutlu_Diziler {

	public static void main(String[] args) {

		// Satýr - Sütun
		// Row - Column
		String[][] siniflistesi = new String[5][4];
		// 1. Ögrenci için bilgi giriþi

		siniflistesi[0][0] = "OKUL001";
		siniflistesi[0][1] = "E bay";
		siniflistesi[0][2] = "46";
		siniflistesi[0][3] = "63";

		// 2. Ögrenci için bilgi giriþi

		siniflistesi[1][0] = "OKUL002";
		siniflistesi[1][1] = "Cans Man";
		siniflistesi[1][2] = "82";
		siniflistesi[1][3] = "95";

		// 2. ögrencini bilgisini ekrana yazýrma
		
		// System.out.println("2. Ögrencini Adý");
		// System.out.println(siniflistesi[1][1]);

		// Sýnýftaki ögrencilerin bilgileri yazdýrma

		for (int i = 0; i < 2; i++) {

			
			System.out.println("okul no : "+siniflistesi[i][0]);
			System.out.println("Ad Soyad  : "+siniflistesi[i][1]);
			System.out.println("Vize Notu  : "+siniflistesi[i][2]);
			System.out.println("Final Notu : "+siniflistesi[i][3]);
			System.out.println(" ");
			
			
			
		}

	}

}
