import java.util.Scanner;

public class Runner1 {

	public static void main(String[] args) {
		Scanner Veri = new Scanner(System.in);

		System.out.print("Boy	  : ");
		String Boy1 = Veri.next();
		System.out.print("Kilo : ");
		String Kilo1 = Veri.next();

		
		System.out.println("Boyu    : " + Boy1 + "\nKilosu : " + Kilo1);

		
		Veri = new Scanner(System.in);
		double dsayi;
		System.out.println("Double Deger Giriniz :  ");
		dsayi = Veri.nextDouble();
		System.out.println("Double Sayýnýz : " + dsayi);


	}

}
