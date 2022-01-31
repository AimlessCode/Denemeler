package com.emin;
import java.util.Iterator;
import java.util.Scanner;

public class Runner_For_loop_Ornek {

	public static void main(String[] args) {

		// 20 ile 100 Arasý Dönen
		for (int i = 20; i <= 100; i++) {
			System.out.println(i);
		}

		System.out.println("------ * ------");

		// 40 ile 18 Arasý
		for (int i = 40; i >= 18; i--) {
			System.out.println(i);
		}

		System.out.println("------ * ------");

		// 100 ile 200 Arasýndaki 5 in katý olanlarý yazýdýr
		for (int i = 100; i <= 200; i += 5) {

			System.out.println(i);
		}
		

		System.out.println("------ * ------");
		//1 ile 40 arasýndaki tek sayýlarý bulan kodu yazdýrýn
		
		for (int i = 1; i <= 40; i +=2) {

			System.out.println(i);
		}

		System.out.println("------ * ------");
		// 1 ile arasýndaki çift sayýlarýn toplamý
		int toplam=0;
		for (int i = 0; i <= 50; i +=2) {

			toplam = toplam + i;
			// Toplam +=i ; ' de olur
			
		}
		System.out.println(toplam);
		
		System.out.println("------ * ------");
		
		
		// kullanýcýdan aldýgýmýz degeri faktöriyel hesaplamasýnýn bulunuz
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		int carp=1;
		for (int i = sayi; i > 1; i --) {

			carp *=i;
			
		}

		System.out.println(carp);
		
		
	}

}
