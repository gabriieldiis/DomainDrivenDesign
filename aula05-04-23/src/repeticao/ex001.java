package repeticao;

import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Antes do FOR: ");
		
		
		System.out.println("Inicio: ");
		int incio = input.nextInt();
		System.out.println("Fim");
		int fim = input.nextInt();
		
		if(incio < fim) {
			for (int i = incio; i < fim ; i++) {
				if (i % 2 == 0) {
					System.out.println("e par: " + i);
			}
		}
	}else {
			for (int i = fim; i < fim ; i--) {
				if (i % 2 == 1) {
					System.out.println("e impar: " + i);
				}
		}
	}
	System.out.println("Depois do FOR: ");
}


}
