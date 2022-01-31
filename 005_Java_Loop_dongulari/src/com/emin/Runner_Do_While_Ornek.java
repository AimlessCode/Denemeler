package com.emin;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Runner_Do_While_Ornek {

	public static void main(String[] args) {

		// 0-8 tahmin oyunu
		Random rd = new Random();
		int sayi = rd.nextInt(10);
		Scanner sc =new Scanner(System.in);
		boolean buldunmu;
		int tahminsayisi=0;
		
		do {
			System.out.println("Tahim Griniz : ");
			int tahmin =sc.nextInt();
			buldunmu = sayi==tahmin;
			tahminsayisi++;
			
		}while(!buldunmu);

		
		System.out.println("Aferin Buldun "+tahminsayisi+". Tahminde bulun ");
	}

}
