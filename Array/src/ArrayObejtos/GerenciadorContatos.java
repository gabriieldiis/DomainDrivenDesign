package ArrayObejtos;

import java.util.Scanner;

public class GerenciadorContatos {
	
	private Contato[] agenda;
	
	public GerenciadorContatos(int tamanho){
		agenda = new Contato[tamanho];
	}
	
	public Contato[] adicionar(){
		
		// preenchendo os dados do vetor
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < agenda.length; i ++){
			System.out.println("Nome");
			String nome = input.next();
			System.out.println("Telefone: ");
			String telefone = input.next();
			Contato c = new Contato(nome, telefone);
			agenda[i] = c;
		}
		
		return agenda;
	}
	

	public void mostraContato(){
		for (int i=0; i<agenda.length; i++){
			System.out.println("Nome: " + agenda[i].getNome());
			System.out.println("Telefone: " + agenda [i].getTelefone());
		}
	}
}
