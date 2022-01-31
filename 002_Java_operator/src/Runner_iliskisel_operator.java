import java.util.Scanner;

public class Runner_iliskisel_operator {
	public static void main(String[] args) {

		int s1, s2;

		// Ýki durumuda irdeliyor
		// sonuc s1 büyükse true yazýcak
		// > büyüktür , < Küçüktür , >= büyük eþitir ,<= büyük eþitir
		// == eþitir
		// ! deðillemek != Eþit deildir

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sayý : ");
		s1 = sc.nextInt();
		System.out.println("2. Sayý : ");
		s2 = sc.nextInt();

		boolean durum;
		durum = s1 > s2;
		System.out.println("Sayý 1 ve 2 Sayý büyük müdür : " + durum);

		durum = s1 == s2;
		System.out.println("Ýki Sayý Birbirine eþit midir " + durum);
		durum = s1 != s2;
		System.out.println("Ýki Sayý Birbirine eþit midir " + durum);
	}
}
