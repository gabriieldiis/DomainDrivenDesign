package aprendendo_scanner;

import java.util.Scanner;

public class scanner_test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		System.out.println("Ola " +  nome);
	}
}