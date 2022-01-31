import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		boolean error = false;
		do {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("1. sayýyý giriniz : ");
				int s1 = sc.nextInt();
				System.out.println("2. sayýyý giriniz : ");
				int s2 = sc.nextInt();
				int toplam = s1 + s2;
				System.out.println("Toplam  : " + toplam);
				error = false;

			} catch (InputMismatchException exception) {

				System.err.println("Tip uyuþmazlýgý , lütfen sayýsal deger giriniz. ");
				//System.out.println(exception.toString());
				error = true;
			}catch (ArithmeticException exception) {
				
				System.err.println("Beklenmedik iþlem hattasý, girilen deðeri kontrol edin ");
				error = true;
			}catch (Exception exception) {
				System.err.println("Bilinmiyen Bir Hatta ");
				error = true;
			}finally {
				
				System.err.println("Her Zaman Çalýþýr");
			}
			
			
		} while (error);
	}// main
}// class
