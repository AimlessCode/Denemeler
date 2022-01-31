import java.util.Scanner;

public class Denemeler2 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayý Girin:");

       double sayi = reader.nextInt();
       // sayý 0 dan küçükse negatif
       if (sayi < 0.0)
           System.out.println(sayi + " Negatiftir.");

       // 0'dan büyükse pozitif
       else if ( sayi > 0.0)
           System.out.println(sayi + " Pozitiftir.");

       // aksi durumda yani 0'a eþitse
       else
           System.out.println(sayi + "  Sýfýrdýr.");
       
	}

}
