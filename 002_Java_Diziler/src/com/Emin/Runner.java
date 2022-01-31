package com.Emin;

public class Runner {

	public static void main(String[] args) {

		// arrays -> Diziler
		// çoklu deðer yakalamak için kullanýlýr
		// {12,24,34,95,46,743,489,4354, .....}
		int sayi = 45;

		int[] sayi_dizisi = { 1, 5, 6, 45, 3, 4, 856, 654 };
		// sayý dizisinin boyurlarýný belirleyerek default deðer atýyoruz.
		// tanýmý yapýlan deiþken türünün defauld deðeri ne ise
		// oluþan dizi içindeki tüm deðer bu þekilde oluþur.
		// int -> 0
		// double ->0.0, 0.0, 0.0, 0.0,
		// String -> null, null ,null .....
		int[] sayi_dizisi2 = new int[5]; // { 0,0,0,0,0 }
		// dizinin içinde deðer okumak
		sayi_dizisi2[0] = 05;
		sayi_dizisi2[1] = 15;
		sayi_dizisi2[2] = 25;
		sayi_dizisi2[3] = 35;
		sayi_dizisi2[4] = 45;

		// NOT !! çok önemli
		// diziler baþlangýçta olarak 0 indis deðeri ile baþlar

		System.out.println("3. index deðeri için : ");
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
