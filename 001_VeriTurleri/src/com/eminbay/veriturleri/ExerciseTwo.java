package com.eminbay.veriturleri;

public class ExerciseTwo {

	public static void main(String[] args) {
		
	short gelisFiyta = 7000;
	double ithalatFiyat = (100*gelisFiyta/5.0) ;
	short KDV =2000 ;
	short kar = 11000; 
	

	System.out.println("Ürünün geliþ Fiyatý : ("+ gelisFiyta +") ve Ýthalat Fiyatý : ("+ ithalatFiyat +") toplamý : "+(gelisFiyta+ithalatFiyat));

	System.out.println("Ürünün kdv : "+("Ürüne Eklenen KDV : ("+ KDV + ") ve Kar ("+ kar  +") Toplam fiyatý : "+ (KDV + kar) ));
	
	System.out.println("Ürünün Toplam ücreti :"+( gelisFiyta+ithalatFiyat+KDV + kar) );
	
	
	
	}
	
}
