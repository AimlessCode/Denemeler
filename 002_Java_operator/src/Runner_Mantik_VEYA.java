import java.util.Scanner;

public class Runner_Mantik_VEYA {

	public static void main(String[] args) {

		// Kontrol edilmesi istenilen durumlarda
		// Herhangi birinin dogru olmas� durumunda

		// �nternet Site Giri�leri Kural�
		// Sadece Kad�nlar
		// ya da 20 ya� ile 40 ya� aras� olanlar [20,40]Dahil - (20,40)Dahil de�il
		// ya da 100 ya� ve �zeri olanlar
		System.out.println("Site Giri�i :  ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Cinsiyet (E/ K) : ");
		String cinsiyet = sc.nextLine();

		System.out.println("Ya� :  ");
		int yas = sc.nextInt();

		boolean kural1 = cinsiyet.equals("K") || cinsiyet.contains("Kad�n");
		// D�KKAT ! 4 ayr� giri� durumu i�in Y�NTEM -1
		kural1 = cinsiyet.equals("k") || cinsiyet.equals("K") || cinsiyet.equals("KADIN");
		
		// Y�NTEM - 2
		// Not : LowerCase -> bir string ifadede olan t�m karakterlieri k���k yapar
		kural1 = cinsiyet.toLowerCase().equals("k") || cinsiyet.toLowerCase().equals("Kad�n");
		
		// Y�NTEM - 3
		
		boolean kural2 = yas >= 20 && yas <= 40;
		boolean kural3 = yas > 100;

		boolean giris_onay = kural1 || kural2 || kural3;

		System.out.println("Siteye giri� : " + giris_onay);

	}

}
