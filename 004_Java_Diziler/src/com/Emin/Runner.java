package com.Emin;

public class Runner {

	public static void main(String[] args) {

		// arrays -> Diziler
		// �oklu de�er yakalamak i�in kullan�l�r
		// {12,24,34,95,46,743,489,4354, .....}
		int sayi = 45;

		int[] sayi_dizisi = { 1, 5, 6, 45, 3, 4, 856, 654 };
		// say� dizisinin boyurlar�n� belirleyerek default de�er at�yoruz.
		// tan�m� yap�lan dei�ken t�r�n�n defauld de�eri ne ise
		// olu�an dizi i�indeki t�m de�er bu �ekilde olu�ur.
		// int -> 0
		// double ->0.0, 0.0, 0.0, 0.0,
		// String -> null, null ,null .....
		int[] sayi_dizisi2 = new int[5]; // { 0,0,0,0,0 }
		// dizinin i�inde de�er okumak
		sayi_dizisi2[0] = 05;
		sayi_dizisi2[1] = 15;
		sayi_dizisi2[2] = 25;
		sayi_dizisi2[3] = 35;
		sayi_dizisi2[4] = 45;

		// NOT !! �ok �nemli
		// diziler ba�lang��ta olarak 0 indis de�eri ile ba�lar

		System.out.println("3. index de�eri i�in : ");
		System.out.println(sayi_dizisi2[3]);

		System.out.println("Dizimde ne var : " + sayi_dizisi[0]);

		// Nelerin dizisi olur
		// all

		String[] ifade_dizisi;
		Double[] ondalik_dizisi;
		boolean[] secim_dizisi;
		Runner[] sinif_dizisi;

		
		
		
	}

}
