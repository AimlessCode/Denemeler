package com.eminbay.veriturleri;

public class CharVeriTurleri {
	public static void main(String[] args) {

		// Char 16 Bit Büyüklügünde veri tutar
		// unicode uluslar arasýdýr
		// Unicode 65535 Deger tutuat örn : char charDeger = 'A'; a=00014
		
		char charDeger = 'A';
		System.out.println(charDeger);
		System.out.println((int)charDeger);
		
		
		int charSayisalDegeri =charDeger+1;
		charDeger=(char)charSayisalDegeri;
		System.out.println(charDeger);
		System.out.println(charSayisalDegeri);
		
		
		charDeger='\u0048';
		System.out.println(charDeger);
		System.out.println(charSayisalDegeri);
		
		
		
	}

}
