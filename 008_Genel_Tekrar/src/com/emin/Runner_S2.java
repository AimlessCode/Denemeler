package com.emin;

import java.util.Scanner;

public class Runner_S2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int veri = sc.nextInt();

		System.out.println("--------");

		for (int i = 1; i <= veri; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("--------");

		for (int i = 1; i <= veri; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
		

		//
		// 		1
		//	   2 2
		//    3 3 3
		//	 4 4 4 4
		//  5 5 5 5 5
		//kullanýcý giricek 
	}

}
