import java.util.Scanner;

public class Runner_iliskisel_operator {
	public static void main(String[] args) {

		int s1, s2;

		// �ki durumuda irdeliyor
		// sonuc s1 b�y�kse true yaz�cak
		// > b�y�kt�r , < K���kt�r , >= b�y�k e�itir ,<= b�y�k e�itir
		// == e�itir
		// ! de�illemek != E�it deildir

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Say� : ");
		s1 = sc.nextInt();
		System.out.println("2. Say� : ");
		s2 = sc.nextInt();

		boolean durum;
		durum = s1 > s2;
		System.out.println("Say� 1 ve 2 Say� b�y�k m�d�r : " + durum);

		durum = s1 == s2;
		System.out.println("�ki Say� Birbirine e�it midir " + durum);
		durum = s1 != s2;
		System.out.println("�ki Say� Birbirine e�it midir " + durum);
	}
}
