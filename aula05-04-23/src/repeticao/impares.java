package repeticao;

import java.util.Scanner;

public class impares {	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inicio: ");
		int inicio = input.nextInt();
		System.out.println("Fim: ");
		int fim = input.nextInt();
		
		for (int i = inicio; i < fim; i++) {
			if (i % 2 == 1) {
				System.out.println("e impar: " +i);
			}
		}
		
	}

}
