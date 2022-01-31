package com.eminbay.veriturleri;
public class ByteVeriTurleri {

	public static void main(String[] args) {
		/*
		 * 1 Byte = 8 Bit
		 *byte min degeri: -128
		 *byte max degeri: 127 
		 * 
		 */


		byte maxByteDeger = Byte.MAX_VALUE;
		byte minByteDeger = Byte.MIN_VALUE;

		System.out.println("byte min degeri: " + minByteDeger);
		System.out.println("byte max degeri: " + maxByteDeger);

		byte maxDegerFazlaOlurmu = (byte)(maxByteDeger + 1);
		System.out.println("overflow kontrolü max : " +maxDegerFazlaOlurmu);
		byte minDegerFazlaOlurmu = (byte)(minByteDeger - 1);
		System.out.println("overflow kontrolü min : " +minDegerFazlaOlurmu);
		
		
		

	}

}
