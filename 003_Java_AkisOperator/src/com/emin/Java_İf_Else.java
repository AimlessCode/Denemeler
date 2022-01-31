package com.emin;

import java.util.Scanner;

public class Java_Ýf_Else {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		String ad="emin";
		String sifre="123";
		
		System.out.println("K Adý.");
		String k_ad =sc.nextLine();
		
		System.out.println("K Sifre.");
		String k_sf =sc.nextLine();
		
		if(ad.equals(k_ad) && sifre.equals(k_sf))
		{
			
			
		System.out.println("Koþul dogru ! ");
		
		}
		
		
		else 
		{
			
			System.out.println("Koþul Yanlýþ ! ");
			
		}
		
		
		
		
		
		
	}	
}
