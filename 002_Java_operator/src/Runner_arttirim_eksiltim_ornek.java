
public class Runner_arttirim_eksiltim_ornek {

	public static void main(String[] args) {

		int s1 = 8, s2 = 5;
		// Prefix . sunfix 
		//Ýþlem sýrasý vardýr
		// + veya - baþta ise hemen uygulanýr 
		// sonra ise sonraki iþlemde uygunalýr
		
		//            8   +  5   +   5  -  4   +  9
		int toplam = s1++ + ++s2 + --s2 - --s2 + s1++;
		System.out.println(toplam);
	}
}
