package com.eminbay.veriturleri;

public class StringVeriTurleri {

	public static void main(String[] args) {

		// String -> Referans Data Type
		// Karakter Dizi Þeklinde Ýfade edilir

		// DÝKKAT String Methodu ile iþlem yaptýgýnýzda
		// String ifade deiþmez ;

		String ifade = "Havalar çok güzel";

		System.out.println(ifade.charAt(5));
		// Haval" a "r çok güzel
		// 1.bit iki deðer alýr ancak 0,1 olabilir
		// charAt -> index Deðeri Verilen karakter verir

		// ---------------------------------------------------

		// concat -> String Bir Ýfade eklemek için

		System.out.println(ifade.concat(" Bu gün hava güzel"));
		System.out.println(ifade + " Yeni Ýçerik");

		// ---------------------------------------------------

		// Contains Ýfade içerisinde istenen deger var mý onu kontrol ediyor
		// "varsa -> True , yoksa -> False " yazdýrýr
		System.out.println(ifade.contains("Hava"));

		// ---------------------------------------------------

		// equals -> ifadenin iki String ifadenin eþitligini kontrol eder

		// "Eþit ise -> True , Eþit degilse -> False " yazdýrýr

		String KAdý = "Admin";
		System.out.println(KAdý.equals("Admin"));

		System.out.println(KAdý.equals("Adminstrator"));

		// ---------------------------------------------------
		// degeri arar yoksa -1 döner
		System.out.println(ifade.indexOf("ü"));
		System.out.println(ifade.indexOf("hav"));
		System.out.println(ifade.indexOf("ÞÞÞ"));

		// ---------------------------------------------------

		// Bir Degeri baþka bir deger ile deiþtirir

		String resim_url = "Yeni evim ve iþyeri fotosu.jpg";

		System.out.println(resim_url.replace(" ", "-").replace("þ", "s"));

	}

}
