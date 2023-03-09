package scanner_media;

import java.util.Scanner;

public class scanner_media {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("---- Calcula Média ----");
		
		System.out.println("Numero 1 :");
		float n1 = input.nextFloat();
		
		System.out.println("Numero 2 : ");
		float n2 = input.nextFloat();
		
		System.out.println("Numero 3 : ");
		float n3 = input.nextFloat();
		
		float media = (n1 + n2 + n3) /3;
		
		System.out.println("Sua media e de " + media);
	}
}
