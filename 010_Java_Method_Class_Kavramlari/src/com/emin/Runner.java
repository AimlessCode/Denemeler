package com.emin;

public class Runner {

	//1-global bir bölge
	static int global_int=5; 
	
	//2-Method
	public static void deneme_method() {
		
		System.out.println("denemee");
	}
	
	//3- Ýnner , wrapper Class Tanýmlanýr.
	class ic_sinif{
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		global_int =45;
		baska_int=5;
		
		
		
		if (global_int==50)
		{
			
		
			int yeni_sayi =534;
			global_int = yeni_sayi;
			
		}

	}

	static int baska_int;
	
}
