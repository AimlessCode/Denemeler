package com.emin;
import java.util.Iterator;
import java.util.Scanner;

public class Runner_For_loop_Ornek {

	public static void main(String[] args) {

		// 20 ile 100 Aras� D�nen
		for (int i = 20; i <= 100; i++) {
			System.out.println(i);
		}

		System.out.println("------ * ------");

		// 40 ile 18 Aras�
		for (int i = 40; i >= 18; i--) {
			System.out.println(i);
		}

		System.out.println("------ * ------");

		// 100 ile 200 Aras�ndaki 5 in kat� olanlar� yaz�d�r
		for (int i = 100; i <= 200; i += 5) {

			System.out.println(i);
		}
		

		System.out.println("------ * ------");
		//1 ile 40 aras�ndaki tek say�lar� bulan kodu yazd�r�n
		
		for (int i = 1; i <= 40; i +=2) {

			System.out.println(i);
		}

		System.out.println("------ * ------");
		// 1 ile aras�ndaki �ift say�lar�n toplam�
		int toplam=0;
		for (int i = 0; i <= 50; i +=2) {

			toplam = toplam + i;
			// Toplam +=i ; ' de olur
			
		}
		System.out.println(toplam);
		
		System.out.println("------ * ------");
		
		
		// kullan�c�dan ald�g�m�z degeri fakt�riyel hesaplamas�n�n bulunuz
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		int carp=1;
		for (int i = sayi; i > 1; i --) {

			carp *=i;
			
		}

		System.out.println(carp);
		
		
	}

}
