package com.eminbay.veriturleri;

public class LongVeriTurleri {

	public static void main(String[] args) {
		/*
		 * long min de�eri: -9223372036854775808
		 * long max de�eri: 9223372036854775807
		 * 2 �st� (min -263 max de�er 263-1)
		 *
		 *long maxdeger = 9223372036854775807L; *sonuna "L" koyduk*
		 */

		long mindeger = Long.MIN_VALUE;
		long maxdeger = Long.MAX_VALUE;
		
		

		System.out.println("long min degeri: " + mindeger);
		System.out.println("long max degeri: " + maxdeger);

		long maxDegerFazlaOlurmu = maxdeger + 1;
		System.out.println(maxDegerFazlaOlurmu);

		long minDegerFazlaOlurmu = mindeger - 1;
		System.out.println(minDegerFazlaOlurmu);

		System.out.println("Float ");

		
	}

}
