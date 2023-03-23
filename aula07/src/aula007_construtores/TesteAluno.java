package aula007_construtores;

public class TesteAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		System.out.println("Matricula: " + a1.getMatricula());
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Curso: " + a1.getCurso());
		System.out.println("Status: " + a1.isStatus());
		System.out.println("Media: " + a1.getMediaGeral());
		
		System.out.println();
		
		Aluno a2 = new Aluno (123, "Java");
		System.out.println("Matricula: " + a2.getMatricula());
		System.out.println("Nome: " + a2.getNome());
		System.out.println("Curso: " + a2.getCurso());
		System.out.println("Status: " + a2.isStatus());
		System.out.println("Media: " + a2.getMediaGeral());
		
		System.out.println();
		
		Aluno a3 = new Aluno (321, "João", "ADS", true);
		System.out.println("Matricula: " + a3.getMatricula());
		System.out.println("Nome: " + a3.getNome());
		System.out.println("Curso: " + a3.getCurso());
		System.out.println("Status: " + a3.isStatus());
		System.out.println("Media: " + a3.getMediaGeral());
		
	}
}
