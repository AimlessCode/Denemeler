package com.eminbay.veriturleri;

public class ShortVeriTurleri {

	public static void main(String[] args) {

		/*
		 * Short 16 Bit 
		 * 
		 * short min degeri: -32768 
		 * short max degeri: 32767
		 * 
		 */


		short maxShortDeger = Short.MAX_VALUE;
		short minShortDeger = Short.MIN_VALUE;

		System.out.println("short min degeri: " + minShortDeger);
		System.out.println("short max degeri: " + maxShortDeger);

		short maxDegerFazlaOlurmu = (short) (maxShortDeger + 1);
		System.out.println("Overflow kontrolü max : " + maxDegerFazlaOlurmu);
		short minDegerFazlaOlurmu = (short) (minShortDeger - 1);
		System.out.println("Overflow kontrolü min : " + minDegerFazlaOlurmu);

		

	}

}
