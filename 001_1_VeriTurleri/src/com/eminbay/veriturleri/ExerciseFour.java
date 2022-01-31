package com.eminbay.veriturleri;

public class ExerciseFour {
	public static void main(String[] args) {

		double telefonIhtalF = 10000d;
		double telefonFiyati = 0;
		double gumrukFiyati = (telefonIhtalF / 100 * 5);
		telefonFiyati = telefonIhtalF + gumrukFiyati;

		System.out.println(telefonFiyati);

		double KDV = (telefonIhtalF / 100 * 10);
		telefonFiyati = telefonFiyati + KDV;
		System.out.println(telefonFiyati);

		double kar = (telefonIhtalF / 100 * 20);
		telefonFiyati = telefonFiyati + kar;
		System.out.println(telefonFiyati);

		double indirim = (telefonIhtalF / 100 * 15);
		telefonFiyati = telefonFiyati - indirim;
		System.out.println(telefonFiyati);
		
		
		
		

	}
}
