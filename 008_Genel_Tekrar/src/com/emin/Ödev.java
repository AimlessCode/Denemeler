package com.emin;

import java.util.Scanner;

public class Ödev {

	public static void main(String[] args) {

		// Ýçi boþ bir kare 
		int sayi;
		 System.out.println("Sayi Giriniz :");
		 Scanner sc = new Scanner(System.in);
		 sayi =0;
		 sayi = sc.nextInt();
		 for(int sutun=0;sutun<sayi;sutun++)
		 {
			 
		    if(sutun==0 || sutun ==sayi-1)
		    	for(int satir=0;satir<sayi+1;satir++)
		    		System.out.print("*");
		    else
		    {
		    	for(int satir=0;satir<sayi;satir++)
				 {
		    		if(satir==0 || satir==sayi-1)
		    			System.out.print("*"); 
		    		else
		    			System.out.print("");
		    		System.out.print(" "); 	
				 }	
		    }
		    System.out.println("");
		}
		 
		 
		 //*********************************************************
		 System.out.println(" ");
		 System.out.println("***********************************");
		 System.out.println(" ");
		 int sayih=0;
		 sayih = sc.nextInt();
		 int i,j,k;
	        for (i=1; i<=sayih; i++) {
	           for(j=i; j<=sayih;j++) {
	               System.out.print(" ");
	           }
	           for (k=1; k<=i; k++) {
	               System.out.print(i);
	               System.out.print(" ");
	           }
	            System.out.println(" ");
	        }
		 
			 //*********************************************************
			 System.out.println(" ");
			 System.out.println("***********************************");
			 System.out.println(" ");
		 
	}

}
