package com.emin;

import java.util.Scanner;

public class Runner_S1 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				
				for(int k=1; k<j;k++)
				{
					
					System.out.print(" ");
					//
					//* * * *
					//*     *
					//*     *
					//* * * *
					// olucak
					
				}
				
				System.out.print("* ");
			}
			
			
			System.out.println("* ");
		}

		
		
		System.out.println("--------");
		

		for (int i = 1; i <= 4 * 4; i++) {

			System.out.print("* ");
			if (i % 4 == 0) {
				System.out.println();

			}
		}
		System.out.println("--------");
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				System.out.print("* ");
			}
			System.out.println("* ");
		}

		System.out.println("--------");

		Scanner sc = new Scanner(System.in);

		int veri=sc.nextInt();

		String devam =sc.nextLine();

		for (int i = 1; i <= veri; i++) {

			for (int j = 1; j < veri; j++) {

				System.out.print("* ");
			}
			System.out.println("* ");
		}
		
		System.out.println("--------");
		
		for (int i = 1; i < 4; i++) {

			for (int j = 1; j < 4; j++) {
				for (int k = 1; k <= 4; k++) {

					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println("* ");
		}

		
		
		
		

	}

}
