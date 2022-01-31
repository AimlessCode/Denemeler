package com.emin;

import java.io.*;
import java.util.Scanner;

public class Odev_4 {

	public static void main(String[] args) throws IOException {
		int sekiz = 8;
		int altý = 6;
		int dort = 4;
		int iki = 2;

		int secim = 6;

		System.out.println("Herhangi bir tuþa basýn :");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("Girdiðiniz metin : " + a);

		do {
			System.out.println("aaa");

		} while(a == altý);
		boolean state =false;
		switch (secim) {
		case 1:
			state= true ;
		}

	}
}
