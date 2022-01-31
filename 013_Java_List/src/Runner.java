import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Runner {
	public static void main(String[] args) {

		String[] dizi =new String[5];
		//bir koleksiyon tanımlama işlemidir
		List<String> ogrenciler;
		//Koleksiyonu initialize(başlatma)
		ogrenciler =new ArrayList<>();
		//arralist in belli bir genişligi yoktur
		//eklemek yaptıkça hacmi genişler
		// Ekleme 
		 ogrenciler.add("ögrenciler-1");
		 ogrenciler.add("ögrenciler-2");
		 ogrenciler.add("ögrenciler-3");
		 ogrenciler.add("ögrenciler-4");
// Silmek
		 //1. opsiyonel
		 ogrenciler.remove ("ögrenciler-2");
		 //2. opsiyonel
		 ogrenciler.remove(0);
		 //bir kaydı almak
		 System.out.printæln(ogrenciler.get(0));

		 ogrenciler.add(2,"ögrenciler-10");
	}

}
