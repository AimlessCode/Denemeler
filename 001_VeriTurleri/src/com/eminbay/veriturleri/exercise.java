package com.eminbay.veriturleri;
import java.util.*;
import java.util.Scanner;

public class exercise {

	public static void main(String[] args) 
	{
		/*
	Scanner Veri = new Scanner(System.in);
		System.out.print("Boy	  : ");
		String Boy1 = Veri.next();
		System.out.print("Kilo : ");
		String Kilo1 = Veri.next();

		System.out.println("Boyu    : "+Boy1+"\nKilosu : "+Kilo1);
		
*/
	

		short boy = 180;
		byte yil = 5;
		byte topuk = 3;

		System.out.println("Boyunuz : " + boy);
		System.out.println("Topuklu giyilirse boyunuz  : " + (boy + topuk));
		System.out.println("20 Sene sonra boyunuz  : " + (boy - yil));

	}

}
