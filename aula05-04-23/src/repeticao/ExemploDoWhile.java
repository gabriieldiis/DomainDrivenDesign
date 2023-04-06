package repeticao;

import java.util.Scanner;

public class ExemploDoWhile {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in); 
	int op;
	
		do {
	
			System.out.println("1 -- Add");
			System.out.println("2 -- Sub");
			System.out.println("3 -- Multi");
			System.out.println("4 -- Div");
			System.out.println("Operacao: ");
			op = input.nextInt();
			
		}while(op < 1 || op > 4 );	
	
		System.out.println("Fora do While");
	}
}
