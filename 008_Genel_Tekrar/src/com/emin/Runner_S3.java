package com.emin;

import java.util.Scanner;

public class Runner_S3 {

	public static void main(String[] args) {

		
        System.out.println("Kaç Tane sayý gireceksin = ");
        Scanner sc = new Scanner(System.in);
        int sayiSayisi = sc.nextInt();
        int sayiDizisi[ ] = new int [ sayiSayisi ]; 
        int bakildimi[ ] = new int [ sayiSayisi ]; 
        for (int i = 0; i < sayiSayisi; i++) {
            System.out.println((i+1) + ". Sayýyý gir = > ");
            sayiDizisi[i] = sc.nextInt();
            
       }
        int bakilansayi = 0;
        for (int i = 0; i < sayiSayisi; i++) {
            int a = 0;
            for (int j = 0; j < sayiSayisi; j++) {
                if(sayiDizisi[i]==bakildimi[j])
                {
                    a++;
                }
            }
            if(a == 0 )
            {
                int sayiAdedi = 0;
                for (int t = 0; t < sayiSayisi; t++) {
                    if(sayiDizisi[i]== sayiDizisi[t])
                    {
                        sayiAdedi ++;
                    }
                }
                bakildimi[bakilansayi] = sayiDizisi[i];
                bakilansayi ++;
                System.out.println(sayiDizisi[i] + " Sayýsýndan " + sayiAdedi + " tane var ");
                
                    
            }
       }
	}
}
