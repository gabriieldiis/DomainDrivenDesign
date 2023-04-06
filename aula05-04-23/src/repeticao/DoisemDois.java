package repeticao;

import java.util.Scanner;

public class DoisemDois {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Antes do FOR: ");
		
		
		System.out.println("Inicio: ");
		int incio = input.nextInt();
		System.out.println("Fim");
		int fim = input.nextInt();
		
		for (int i = incio; i < fim ; i++) {
		if (i % 2 == 0) {
			System.out.println("e par: " + i);
		}
	}
	
		System.out.println("Depois do FOR: ");
}


}
