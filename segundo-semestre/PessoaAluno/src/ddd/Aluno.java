package ddd;

import java.util.Date;

public class Aluno extends Pessoa{
	
	private String matricula;
	private String curso;
	private double mensalidade;
	/**
	 * @param nome
	 * @param cpf
	 * @param dataNascimento
	 * @param matricula
	 * @param curso
	 * @param mensalidade
	 */
	public Aluno(String nome, String cpf, Date dataNascimento, String matricula, String curso, double mensalidade) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
		this.curso = curso;
		this.mensalidade = mensalidade;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/**
	 * @return the mensalidade
	 */
	public double getMensalidade() {
		return mensalidade;
	}
	/**
	 * @param mensalidade the mensalidade to set
	 */
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
}
