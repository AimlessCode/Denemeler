import java.util.Scanner;

public class OkulOtomasyon {

	String[] sinifListesi = null;
	int sinifSayisi = 0;

	public void sinifekle(String sinifadi) {
		if (sinifSayisi == 0) {
			sinifListesi = new String[1];
			sinifSayisi++;
			sinifListesi[1] = sinifadi;

		} else {
			// as�l dizinin i�inde olan bilgileri tutucak
			String[] gecicidizi = new String[sinifSayisi];
			//
			gecicidizi = sinifListesi;
			//S�n�f� 1 art�r�yor
			sinifSayisi++;
			sinifListesi = new String[sinifSayisi];
			for (int i = 0; i < sinifSayisi; i++) {
				if (i == sinifSayisi - 1) {
					sinifListesi[i] = sinifadi;

				} else {
					sinifListesi[i] = gecicidizi[i];
				}

			}

		}

	}

	public void Run() {

		int secim;
		do {
			Ekran();
			secim = Seciniz();
			switch (secim) {
			case 1:
				SinifTanimlama();

				break;
			case 2:
				OgrenciTanimlama();

				break;
			case 3:
				OgrenciAtama();

				break;
			case 4:
				SinifListesi();

				break;
			case 5:
				DersTanimlama();

				break;
			case 6:
				NotEkleme();

				break;
			case 7:
				NotGoruntuleme();

				break;
			case 8:
				OgrenciArama();

				break;
			default:
				System.out.print("Uygulama kapat�ld�");
				break;

			}
		} while (secim != 0);

	}

	public void SinifTanimlama() {

		System.out.println("*******************************");
		System.out.println("***** SINIF EKLEME EKRANI *****");
		System.out.println();
		Scanner sc =new Scanner(System.in);
		System.out.println("S�n�f Ad� Giriniz");
		String sinifadi =sc.nextLine();
		sinifekle(sinifadi);
		System.out.println("S�n�f Ba�ar�l� �ekilde eklendi... ");
		
	}

	public void OgrenciTanimlama() {

	}

	public void OgrenciAtama() {

	}

	public void SinifListesi() {

	}

	public void DersTanimlama() {

	}

	public void NotEkleme() {

	}

	public void NotGoruntuleme() {

	}

	public void OgrenciArama() {

	}

	public int Seciniz() {

		int secim = 0;

		do {
			System.out.print("Se�iniz : ");

			secim = tamsayiAl();

		} while (secim < 0 || secim > 8);

		return secim;
	}

	public int tamsayiAl() {
		int sayi = 0;
		Scanner sc;
		boolean error = false;
		do {
			try {
				sc = new Scanner(System.in);
				sayi = sc.nextInt();
				error = false;

			} catch (Exception e) {

				System.out.println("L�tfen tam say� giriniz....!");
				error = true;
			}
		} while (error);

		return sayi;
	}

	public void Ekran() {
		System.out.println("*******************************");
		System.out.println("******* OKUL OTOMASYONU *******");
		System.out.println("*******************************");
		System.out.println();
		System.out.println("1- S�n�f Tan�mla ");
		System.out.println("2- �grenci Tan�mla ");
		System.out.println("3- �grenci Atama ");
		System.out.println("4- S�n�f Listesi ");
		System.out.println("5- Ders Tan�mlama ");
		System.out.println("6- Not Ekleme ");
		System.out.println("7- Not G�r�nt�leme ");
		System.out.println("8- �grenci Arama ");
		System.out.println("0- �IKI�  ");


	}

}// class
