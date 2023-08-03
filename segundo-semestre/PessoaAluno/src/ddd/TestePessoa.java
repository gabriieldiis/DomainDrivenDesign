package ddd;

import java.util.Date;

public class TestePessoa {
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno("Aluno 1", "123.321.789-50", new Date(), "550949", "ADS", 500);
		System.out.println("Aluno: "+aluno.toString());
		
		
		Pessoa p = new Pessoa("Gabriel", "321.654.874-50", new Date());
		System.out.println("Pessoa" + p.toString());
	}
}
