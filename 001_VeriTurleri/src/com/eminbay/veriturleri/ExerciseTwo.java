package com.eminbay.veriturleri;

public class ExerciseTwo {

	public static void main(String[] args) {
		
	short gelisFiyta = 7000;
	double ithalatFiyat = (100*gelisFiyta/5.0) ;
	short KDV =2000 ;
	short kar = 11000; 
	

	System.out.println("�r�n�n geli� Fiyat� : ("+ gelisFiyta +") ve �thalat Fiyat� : ("+ ithalatFiyat +") toplam� : "+(gelisFiyta+ithalatFiyat));

	System.out.println("�r�n�n kdv : "+("�r�ne Eklenen KDV : ("+ KDV + ") ve Kar ("+ kar  +") Toplam fiyat� : "+ (KDV + kar) ));
	
	System.out.println("�r�n�n Toplam �creti :"+( gelisFiyta+ithalatFiyat+KDV + kar) );
	
	
	
	}
	
}
