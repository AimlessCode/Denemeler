import java.util.Scanner;

public class Denemeler2 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
        System.out.print("Bir Say� Girin:");

       double sayi = reader.nextInt();
       // say� 0 dan k���kse negatif
       if (sayi < 0.0)
           System.out.println(sayi + " Negatiftir.");

       // 0'dan b�y�kse pozitif
       else if ( sayi > 0.0)
           System.out.println(sayi + " Pozitiftir.");

       // aksi durumda yani 0'a e�itse
       else
           System.out.println(sayi + "  S�f�rd�r.");
       
	}

}
