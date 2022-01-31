package com.emin;

import java.security.MessageDigest;
import java.util.Scanner;

public class Runner_switch_Case {

	public static void main(String[] args) {

		// if vs. Switch
		// Belii Aral�klar i�in ikullan�l�r. Switch..case Kullan�lmaz
		// Nokta At��� de�er kontrol� yapmak i�in switch..case kullan�l�r
		// switch..case ile yap�labilen her kurgu if..else ile yap�labilir
		// ancak, if..else ile yap�lan her kurgu switch..case ile yap�lmaz
		// iki durum i�inde kullan�lan bir kurguda
		// switch..case if ..else yap�s�nda daha h�zl� �al���r.
		// case i�in s�n�rlar. : ile Break: aras�nda. {} kullan�lmaz

		System.out.println("******************** ");
		System.out.println("****  ��LEMLER  **** ");
		System.out.println("******************** ");
		System.out.println("1. Toplama ");
		System.out.println("2. ��karma ");
		System.out.println("3. �arpma ");
		System.out.println("4. B�lme ");
		System.out.println("5. MOD alma ");
		System.out.println("0. � I K I � ");
		System.out.println(" ");
		System.out.println("Se�iniz : ");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt();
// switch sizden kontrol edebilegi bir deger talep eder.
		//de�er, case ile kontrol edilir. asla ayn� anda iki case e�t olmaz
		//note !! �f i�inde ayn� ko�ulu tektat yazabilir , ancak ilk ko�ul �o
		
		
		switch(secim) 
		{
		case 1: System.out.println("Toplama yap�ld�");break;
		case 2: System.out.println("��karma yap�ld�"); break;
		case 3: System.out.println("�arpma yap�ld�"); break;
		case 4: System.out.println("B�lme yap�ld�"); break;
		case 5: System.out.println("MOD yap�ld�"); break;
		case 0: System.out.println("�IKI� YAPILDI "); break;
		
		default: System.out.println("!!  L�TFEN 1 �LE 5 ARASINDA B�R DEGER G�R�N�Z  !!");
		
		
		}
		
	}

}
