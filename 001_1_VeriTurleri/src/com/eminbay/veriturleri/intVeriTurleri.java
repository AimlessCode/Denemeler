package com.eminbay.veriturleri;

public class intVeriTurleri {

	public static void main(String[] args) {

		/*
		 * sayýlar için kulanýlan veri türü
		 * 
		 * Ýnt min degeri: -2147483648 
		 * Ýnt max degeri: 2147483647
		 */

		int intSayi = 5;
		System.out.println(intSayi);

		int mindeger = Integer.MIN_VALUE;
		int maxdeger = Integer.MAX_VALUE;

		System.out.println("Ýnt min degeri: " + mindeger);
		System.out.println("Ýnt max degeri: " + maxdeger);

		int maxDegerFazlaOlurmu = maxdeger + 1;
		System.out.println(maxDegerFazlaOlurmu);

	}

}
