package com.eminbay.veriturleri;

public class StringVeriTurleri {

	public static void main(String[] args) {

		// String -> Referans Data Type
		// Karakter Dizi �eklinde �fade edilir

		// D�KKAT String Methodu ile i�lem yapt�g�n�zda
		// String ifade dei�mez ;

		String ifade = "Havalar �ok g�zel";

		System.out.println(ifade.charAt(5));
		// Haval" a "r �ok g�zel
		// 1.bit iki de�er al�r ancak 0,1 olabilir
		// charAt -> index De�eri Verilen karakter verir

		// ---------------------------------------------------

		// concat -> String Bir �fade eklemek i�in

		System.out.println(ifade.concat(" Bu g�n hava g�zel"));
		System.out.println(ifade + " Yeni ��erik");

		// ---------------------------------------------------

		// Contains �fade i�erisinde istenen deger var m� onu kontrol ediyor
		// "varsa -> True , yoksa -> False " yazd�r�r
		System.out.println(ifade.contains("Hava"));

		// ---------------------------------------------------

		// equals -> ifadenin iki String ifadenin e�itligini kontrol eder

		// "E�it ise -> True , E�it degilse -> False " yazd�r�r

		String KAd� = "Admin";
		System.out.println(KAd�.equals("Admin"));

		System.out.println(KAd�.equals("Adminstrator"));

		// ---------------------------------------------------
		// degeri arar yoksa -1 d�ner
		System.out.println(ifade.indexOf("�"));
		System.out.println(ifade.indexOf("hav"));
		System.out.println(ifade.indexOf("���"));

		// ---------------------------------------------------

		// Bir Degeri ba�ka bir deger ile dei�tirir

		String resim_url = "Yeni evim ve i�yeri fotosu.jpg";

		System.out.println(resim_url.replace(" ", "-").replace("�", "s"));

	}

}
