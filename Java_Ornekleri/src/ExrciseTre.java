

public class ExrciseTre {

	public static void main(String[] args) {

		int telefonIthalatFiyat = 10000;
		int telefonFiyati = 0;
		int gumrukVergisi = telefonIthalatFiyat / 100 * 5;
		
		telefonFiyati = telefonIthalatFiyat + gumrukVergisi;
		

		int KDV = telefonIthalatFiyat * 10 / 100;
		telefonFiyati = telefonFiyati + KDV;
		System.out.println("Telefon fiyat : "+telefonFiyati);

		
		int karPayi = telefonIthalatFiyat * 20 / 100;
		telefonFiyati = telefonFiyati + karPayi;
		System.out.println("Telefon Kar payý :  "+karPayi);
		
		
		int indirim = telefonIthalatFiyat * 20 / 100;
		System.out.println("Telefon Ýnidirim : "+indirim);
		
		 telefonFiyati = telefonFiyati -indirim;
		System.out.println("Telefon son fiyat : "+telefonFiyati);
		
		
		

	}

}
