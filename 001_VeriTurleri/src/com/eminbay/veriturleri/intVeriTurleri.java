package com.eminbay.veriturleri;

public class intVeriTurleri {

	public static void main(String[] args) {

		/*
		 * say�lar i�in kulan�lan veri t�r�
		 * 
		 * �nt min degeri: -2147483648 
		 * �nt max degeri: 2147483647
		 */

		int intSayi = 5;
		System.out.println(intSayi);

		int mindeger = Integer.MIN_VALUE;
		int maxdeger = Integer.MAX_VALUE;

		System.out.println("�nt min degeri: " + mindeger);
		System.out.println("�nt max degeri: " + maxdeger);

		int maxDegerFazlaOlurmu = maxdeger + 1;
		System.out.println(maxDegerFazlaOlurmu);

	}

}
