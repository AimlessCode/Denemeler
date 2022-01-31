package com.emin;

import java.util.Scanner;

public class Runner_if_elself {

	public static void main(String[] args) {

		double vize_not, final_not, ort;
		String ort_hrf = "a";
		String aciklama = "Not Ortalaman: ";

		Scanner sc = new Scanner(System.in);

		System.out.println("Vize Notu : ");
		vize_not = sc.nextDouble();

		System.out.println("Final Notu : ");
		final_not = sc.nextDouble();

		ort = vize_not * 0.30 + final_not * 0.65;

		// 0-10 FF ,11-20 FD, 21-30 DD, 31-40 DC,41-50 CC ...90-100 AA

		if (ort >= 0.0 && ort <= 10.0) {

			ort_hrf = "FF";

		} else if (ort >= 11.0 && ort <= 20.0) {

			ort_hrf = "FD";
		} else if (ort >= 21.0 && ort <= 30.0) {

			ort_hrf = "DD";

		} else if (ort >= 31.0 && ort <= 40.0) {

			ort_hrf = "CD";

		} else if (ort >= 41.0 && ort <= 50.0) {

			ort_hrf = "CC";

		} else if (ort >= 51.0 && ort <= 60.0) {

			ort_hrf = "BC";

		} else if (ort >= 61.0 && ort <= 70.0) {

			ort_hrf = "BB";

		} else if (ort >= 71.0 && ort <= 80.0) {

			ort_hrf = "AB";

		} else if (ort >= 81.0 && ort <= 100.0) {

			ort_hrf = "AA";

		}

		else if (ort > 100.0 || ort < 0) {

			System.out.println("Not Ortalaman : " + ort);
			System.out.println("Bir Problem var");
		}

		System.out.println(aciklama + ort_hrf);

		// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-

		if (ort <= 10)
			ort_hrf = "FF";
		else if (ort <= 20)
			ort_hrf = "FD";
		else if (ort <= 30)
			ort_hrf = "DD";
		else if (ort <= 40)
			ort_hrf = "CD";
		else if (ort <= 50)
			ort_hrf = "CC";
		else if (ort <= 60)
			ort_hrf = "BC";
		else if (ort <= 70)
			ort_hrf = "BB";
		else if (ort <= 80)
			ort_hrf = "AB";
		else if (ort <= 100)
			ort_hrf = "AA";
		
		System.out.println(aciklama + ort_hrf);
		
		// -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
	}

}
