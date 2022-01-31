package com.emin;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		int ogrenci_sayisi = 0;
		String[][] siniflistesi = null;

		int secim = 0;

		
		do {

			System.out.println("*************************");
			System.out.println("* ÖGRENCÝ TAKÝP SÝSTEMÝ *");
			System.out.println("*************************");
			System.out.println();
			System.out.println("1- Sýnýf Oluþturma ");
			System.out.println("2- Sýnýf Listesi ");
			System.out.println("3- Not Gir ");
			System.out.println("4- Sýnýf Not Ortalamasý ");
			System.out.println("0- Çýkýþ ");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			

			do {

				System.out.print("Secim Yapýnýz : ");

				secim = sc.nextInt();
			} while (secim < 0 || secim > 4);
			boolean state =false;
			switch (secim) {
			case 1:
				state= true ;
				
				if (ogrenci_sayisi == 0) {
					// Ögrenci ekleme Kýsmý

					state=true;
					}
					
				 else {
					
					System.err.println("****  DÝKKAT   ****");
					System.err.println("DAHA ÖNCEDEN SINIF OLUÞTURULMUÞ");
					System.out.print(" E / H ");
					String devam =sc.nextLine();
					if (devam.equals("E"));
					state=true;
				}
				
				if (state)
				{
					System.out.print("Sýnýf Mevcudu : ");
					ogrenci_sayisi = sc.nextInt();
					siniflistesi = new String[ogrenci_sayisi][3];

					for (int i = 0; i < ogrenci_sayisi; i++) {

						System.out.print((i + 1) + ". Ögrenci Adý : ");

						// NOT !! scanner tip deiþimlerinde sorun cýkartýr
						// bu nedenle burada new yapmak gereklidir

						sc = new Scanner(System.in);

						siniflistesi[i][0] = sc.nextLine();
						siniflistesi[i][1] = "0";
						siniflistesi[i][1] = "0";
						
					}
					System.out.println(" Ögrenci bilgilerin tamamlandý");
				}break; 
				
			case 2:

				System.out.println("*************************");
				System.out.println("***** SINIF LÝSTESÝ *****");
				System.out.println("*************************");
				System.out.println("S.NO  | Ögrenci Adý Soyadý ");

				for (int i = 0; i < ogrenci_sayisi; i++) {

					System.out.println("  " +(i + 1)+ "    ");
					System.out.print(" Ögrenci Ad Soyad : ");
					System.out.print(siniflistesi[i][0]);
					System.out.println(" ");
				}

				break;
			case 3:

				System.out.println("***** NOT GÝRÝÞÝ *****");
				System.out.println();
				for (int i = 0; i < ogrenci_sayisi; i++) {
					sc = new Scanner(System.in);

					System.err.println("*********");
					System.out.println((i + 1) + ". Ögrenci " + siniflistesi[i][0]);
					System.out.print(" Vize Notu:");
					siniflistesi[i][1] = sc.nextLine();
					System.out.print(" Final Notu:");
					siniflistesi[i][2] = sc.nextLine();
				}

				break;
			case 4:

				System.out.println("*** SINIF ÖGRENCÝ NOTLARI ***");
				System.out.println();
				for (int i = 0; i < ogrenci_sayisi; i++) {

					System.out.println("Ad Soyad    : " + siniflistesi[i][0]);
					System.out.println("Vize Notu   : " + siniflistesi[i][1]);
					System.out.println("Final Notu  : " + siniflistesi[i][2]);
					// DÝKKAT !!!!
					// bir birine benzeyen türlerin feðiþmine tür dönüþümü denir
					// parsel terimsel ifadesi kullnýlýr.
					// örk : byte 1 =b , int =2; // byte< int < shot ...
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
				System.err.println("Çýkýþ Yapýldý ");
				break;

			}

		} while (secim != 0);

	}

}
