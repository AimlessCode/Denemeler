package com.Emin;

public class Runner_Cokboyutlu_Diziler {

	public static void main(String[] args) {

		// Sat�r - S�tun
		// Row - Column
		String[][] siniflistesi = new String[5][4];
		// 1. �grenci i�in bilgi giri�i

		siniflistesi[0][0] = "OKUL001";
		siniflistesi[0][1] = "E bay";
		siniflistesi[0][2] = "46";
		siniflistesi[0][3] = "63";

		// 2. �grenci i�in bilgi giri�i

		siniflistesi[1][0] = "OKUL002";
		siniflistesi[1][1] = "Cans Man";
		siniflistesi[1][2] = "82";
		siniflistesi[1][3] = "95";

		// 2. �grencini bilgisini ekrana yaz�rma
		
		// System.out.println("2. �grencini Ad�");
		// System.out.println(siniflistesi[1][1]);

		// S�n�ftaki �grencilerin bilgileri yazd�rma

		for (int i = 0; i < 2; i++) {

			
			System.out.println("okul no : "+siniflistesi[i][0]);
			System.out.println("Ad Soyad  : "+siniflistesi[i][1]);
			System.out.println("Vize Notu  : "+siniflistesi[i][2]);
			System.out.println("Final Notu : "+siniflistesi[i][3]);
			System.out.println(" ");
			
			
			
		}

	}

}
