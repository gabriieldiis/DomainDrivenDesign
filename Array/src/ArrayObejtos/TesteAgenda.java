package ArrayObejtos;

public class TesteAgenda {

	public static void main(String[] args) {
		GerenciadorContatos gc = new GerenciadorContatos(3);
		
		Contato[] contatos = gc.adicionar();
		gc.mostraContato();
	}
}
