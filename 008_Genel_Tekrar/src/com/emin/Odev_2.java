package com.emin;

import java.util.Scanner;

public class Odev_2 {

	public static void main(String[] args) {

		boolean var_mi_top = false;
		double toplam = 0;
		double toplam1 = 0;
		// ---
		boolean var_mi_c�k = false;
		double cikarma = 0;
		double cikarma1 = 0;
		// --
		boolean var_mi_carp = false;
		double carpma = 0;
		double carpma1 = 0;
		// --
		boolean var_mi_bol = false;
		double bolme = 0;
		double bolme1 = 0;
		// ------
		Scanner sc = new Scanner(System.in);

		System.out.println("***********************");
		System.out.println("SAYIM �EKL�N�Z : ");
		System.out.print("SAYI ");
		System.out.print(" ' carp , b�l , c�kar , topla ' ");
		System.out.println(" SAYI");
		System.out.println("�EKL�NDE OLMALI");
		System.out.println("***********************");

		System.out.println("��LEM ���N SAYI VE ��LEM T�R� YAZINIZ : ");

		String kullanici_veri = sc.nextLine();
		System.out.println("***********************");
		String[] veri_ayirma = kullanici_veri.split("\\s");
		int ayrilmis_kelime = veri_ayirma.length;

		var_mi_top = kullanici_veri.contains("topla");
		if (var_mi_top == true) {

			for (int i = 0; i < ayrilmis_kelime; i++) {

				if (i == 0) {

					toplam = (Integer.valueOf(veri_ayirma[i]));
				}
				if (i == 2) {

					toplam1 = (Integer.valueOf(veri_ayirma[i]));
					System.out.println(toplam + toplam1);
				}
			}
		}

		var_mi_c�k = kullanici_veri.contains("c�kar");
		if (var_mi_c�k == true) {

			for (int i = 0; i < ayrilmis_kelime; i++) {

				if (i == 0) {

					cikarma = (Integer.valueOf(veri_ayirma[i]));
				}
				if (i == 2) {

					cikarma1 = (Integer.valueOf(veri_ayirma[i]));
					System.out.println(cikarma - cikarma1);
				}
			}
		}

		var_mi_carp = kullanici_veri.contains("carp");
		if (var_mi_carp == true) {

			for (int i = 0; i < ayrilmis_kelime; i++) {

				if (i == 0) {

					carpma = (Integer.valueOf(veri_ayirma[i]));
				}
				if (i == 2) {

					carpma1 = (Integer.valueOf(veri_ayirma[i]));
					System.out.println(carpma * carpma1);
				}
			}
		}

		var_mi_bol = kullanici_veri.contains("b�l");
		if (var_mi_bol == true) {

			for (int i = 0; i < ayrilmis_kelime; i++) {

				if (i == 0) {

					bolme = (Integer.valueOf(veri_ayirma[i]));
				}
				if (i == 2) {

					bolme1 = (Integer.valueOf(veri_ayirma[i]));
					System.out.println(bolme / bolme1);
				}
			}
		}

	}

}
