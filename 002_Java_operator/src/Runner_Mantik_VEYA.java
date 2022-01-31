import java.util.Scanner;

public class Runner_Mantik_VEYA {

	public static void main(String[] args) {

		// Kontrol edilmesi istenilen durumlarda
		// Herhangi birinin dogru olmasý durumunda

		// Ýnternet Site Giriþleri Kuralý
		// Sadece Kadýnlar
		// ya da 20 yaþ ile 40 yaþ arasý olanlar [20,40]Dahil - (20,40)Dahil deðil
		// ya da 100 yaþ ve üzeri olanlar
		System.out.println("Site Giriþi :  ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Cinsiyet (E/ K) : ");
		String cinsiyet = sc.nextLine();

		System.out.println("Yaþ :  ");
		int yas = sc.nextInt();

		boolean kural1 = cinsiyet.equals("K") || cinsiyet.contains("Kadýn");
		// DÝKKAT ! 4 ayrý giriþ durumu için YÖNTEM -1
		kural1 = cinsiyet.equals("k") || cinsiyet.equals("K") || cinsiyet.equals("KADIN");
		
		// YÖNTEM - 2
		// Not : LowerCase -> bir string ifadede olan tüm karakterlieri küçük yapar
		kural1 = cinsiyet.toLowerCase().equals("k") || cinsiyet.toLowerCase().equals("Kadýn");
		
		// YÖNTEM - 3
		
		boolean kural2 = yas >= 20 && yas <= 40;
		boolean kural3 = yas > 100;

		boolean giris_onay = kural1 || kural2 || kural3;

		System.out.println("Siteye giriþ : " + giris_onay);

	}

}
