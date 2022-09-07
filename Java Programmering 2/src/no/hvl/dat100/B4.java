package no.hvl.dat100;

import java.util.Scanner;

public class B4 {

	public static void main(String[] args) {
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Oppgi bruttolønn:");
		i = scan.nextInt();
		scan.close();

		if (i <= 164100) {
			System.out.println("Trinn 0, 0%" + "\n"+ i*0);
		}
		else if (i >= 164101 && i <=230950) {
			System.out.println("Trinn 1, 0.93%" + "\n"+ i*0.093);
		}
		else if (i >= 230951 && i <=580560) {
			System.out.println("Trinn 2, 2,41%" + "\n"+ i*0.0241);
		}
		else if (i >= 580561 && i <=934050) {
			System.out.println("Trinn 3, 11,52%" + "\n"+ i*0.1152);
		}
		else if (i >= 9300511) {
			System.out.println("Trinn 4, 14,52%" + "\n"+ i*0.1452);
		}
	}
}
