package ddd;

import java.util.Date;

public class Professor extends Pessoa{
	
	/**
	 * @param nome
	 * @param cpf
	 * @param dataNascimento
	 * @param disciplina
	 * @param salario
	 */
	public Professor(String nome, String cpf, Date dataNascimento, String disciplina, double salario) {
		super(nome, cpf, dataNascimento);
		this.disciplina = disciplina;
		this.salario = salario;
	}
	private String disciplina;
	private double salario;
	/**
	 * @return the disciplina
	 */
	public String getDisciplina() {
		return disciplina;
	}
	/**
	 * @param disciplina the disciplina to set
	 */
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
