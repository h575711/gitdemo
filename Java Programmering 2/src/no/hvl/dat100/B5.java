package no.hvl.dat100;

import java.util.Scanner;

public class B5 {

	public static void main(String[] args) {
		
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Oppgi poengsum:");
		i = scan.nextInt();
		scan.close();
		
		if (i>=90 && i<=100) {
			System.out.println("Karakter A" + "\n"+ i);
		}
		else if (i>=80 && i<=89) {
			System.out.println("Karakter B" + "\n"+ i);
		}
		else if (i>=60 && i<=79) {
			System.out.println("Karakter C" + "\n"+ i);
		}
		else if (i>=50 && i<=59) {
			System.out.println("Karakter D" + "\n"+ i);
		}
		else if (i>=40 && i<=49) {
			System.out.println("Karakter E" + "\n"+ i);
		}
		else if (i<=39 && i>=0) {
			System.out.println("Karakter f" + "\n"+ i);
		}
		else {
			System.out.println("Den opgitte poengsum er ikke gyldig");
			
		}
	}

}
