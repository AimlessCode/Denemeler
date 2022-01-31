package com.Emin;

import java.util.Random;
import java.util.Scanner;

public class Runner_dizi_Ornekler {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç tane sayý üretilsin");
		int adet = sc.nextInt();

		int[] sayi_dizisi = new int[adet];

		Random rd = new Random();

		for (int i = 0; i < adet; i++) {

			sayi_dizisi[i] = rd.nextInt(1000);

			System.out.println((i + 1) + ".Sayý : " + sayi_dizisi[i]);

		}
		int buyuk_sayi=0, enkucuk_sayi=0;
		for (int i = 0; i < adet; i++) {
			int sayi = sayi_dizisi[i];
			if (i == 0) {
				buyuk_sayi = sayi;
			   enkucuk_sayi =sayi;
			   }
			else{
			 if(buyuk_sayi<sayi)	
				 buyuk_sayi=sayi;
			 if(enkucuk_sayi>sayi)
				 enkucuk_sayi =sayi;
				
			}			
			
		}
		System.err.println("En büyük Sayý : "+ buyuk_sayi);
		System.err.println("En Küçük Sayý : "+ enkucuk_sayi);
		
	}
	

}
