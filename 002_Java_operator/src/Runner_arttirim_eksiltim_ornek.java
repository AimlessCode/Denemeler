
public class Runner_arttirim_eksiltim_ornek {

	public static void main(String[] args) {

		int s1 = 8, s2 = 5;
		// Prefix . sunfix 
		//��lem s�ras� vard�r
		// + veya - ba�ta ise hemen uygulan�r 
		// sonra ise sonraki i�lemde uygunal�r
		
		//            8   +  5   +   5  -  4   +  9
		int toplam = s1++ + ++s2 + --s2 - --s2 + s1++;
		System.out.println(toplam);
	}
}
