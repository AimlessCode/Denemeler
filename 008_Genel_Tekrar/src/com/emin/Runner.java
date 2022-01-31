package com.emin;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		int ogrenci_sayisi = 0;
		String[][] siniflistesi = null;

		int secim = 0;

		
		do {

			System.out.println("*************************");
			System.out.println("* �GRENC� TAK�P S�STEM� *");
			System.out.println("*************************");
			System.out.println();
			System.out.println("1- S�n�f Olu�turma ");
			System.out.println("2- S�n�f Listesi ");
			System.out.println("3- Not Gir ");
			System.out.println("4- S�n�f Not Ortalamas� ");
			System.out.println("0- ��k�� ");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			

			do {

				System.out.print("Secim Yap�n�z : ");

				secim = sc.nextInt();
			} while (secim < 0 || secim > 4);
			boolean state =false;
			switch (secim) {
			case 1:
				state= true ;
				
				if (ogrenci_sayisi == 0) {
					// �grenci ekleme K�sm�

					state=true;
					}
					
				 else {
					
					System.err.println("****  D�KKAT   ****");
					System.err.println("DAHA �NCEDEN SINIF OLU�TURULMU�");
					System.out.print(" E / H ");
					String devam =sc.nextLine();
					if (devam.equals("E"));
					state=true;
				}
				
				if (state)
				{
					System.out.print("S�n�f Mevcudu : ");
					ogrenci_sayisi = sc.nextInt();
					siniflistesi = new String[ogrenci_sayisi][3];

					for (int i = 0; i < ogrenci_sayisi; i++) {

						System.out.print((i + 1) + ". �grenci Ad� : ");

						// NOT !! scanner tip dei�imlerinde sorun c�kart�r
						// bu nedenle burada new yapmak gereklidir

						sc = new Scanner(System.in);

						siniflistesi[i][0] = sc.nextLine();
						siniflistesi[i][1] = "0";
						siniflistesi[i][1] = "0";
						
					}
					System.out.println(" �grenci bilgilerin tamamland�");
				}break; 
				
			case 2:

				System.out.println("*************************");
				System.out.println("***** SINIF L�STES� *****");
				System.out.println("*************************");
				System.out.println("S.NO  | �grenci Ad� Soyad� ");

				for (int i = 0; i < ogrenci_sayisi; i++) {

					System.out.println("  " +(i + 1)+ "    ");
					System.out.print(" �grenci Ad Soyad : ");
					System.out.print(siniflistesi[i][0]);
					System.out.println(" ");
				}

				break;
			case 3:

				System.out.println("***** NOT G�R��� *****");
				System.out.println();
				for (int i = 0; i < ogrenci_sayisi; i++) {
					sc = new Scanner(System.in);

					System.err.println("*********");
					System.out.println((i + 1) + ". �grenci " + siniflistesi[i][0]);
					System.out.print(" Vize Notu:");
					siniflistesi[i][1] = sc.nextLine();
					System.out.print(" Final Notu:");
					siniflistesi[i][2] = sc.nextLine();
				}

				break;
			case 4:

				System.out.println("*** SINIF �GRENC� NOTLARI ***");
				System.out.println();
				for (int i = 0; i < ogrenci_sayisi; i++) {

					System.out.println("Ad Soyad    : " + siniflistesi[i][0]);
					System.out.println("Vize Notu   : " + siniflistesi[i][1]);
					System.out.println("Final Notu  : " + siniflistesi[i][2]);
					// D�KKAT !!!!
					// bir birine benzeyen t�rlerin fe�i�mine t�r d�n���m� denir
					// parsel terimsel ifadesi kulln�l�r.
					// �rk : byte 1 =b , int =2; // byte< int < shot ...
					// i = b olur
					// b = i OLMAZ
					double vize_notu = Double.parseDouble(siniflistesi[i][1]);
					double final_notu = Double.parseDouble(siniflistesi[i][2]);
					double ortlama = vize_notu * 0.35 + final_notu * 0.65;
					System.out.println("Ortalama Not   : " + ortlama);

					System.out.println("* * * * * * * * * ");

				}

				break;

			default:
				System.err.println("��k�� Yap�ld� ");
				break;

			}

		} while (secim != 0);

	}

}
