package br.edu.fatecgru.model;

public class Aluno {
	private int caAlunos;
	private String nomeAluno;
	private String emailAluno;
	private String dataNascimento;
	private String enderecoAluno;
	private int idadeAluno;
	
	//Construtores
	public Aluno() {
		
	}

	public Aluno(int caAlunos, String nomeAluno, String emailAluno, String dataNascimento, String enderecoAluno,
			int idadeAluno) {
		super();
		this.caAlunos = caAlunos;
		this.nomeAluno = nomeAluno;
		this.emailAluno = emailAluno;
		this.dataNascimento = dataNascimento;
		this.enderecoAluno = enderecoAluno;
		this.idadeAluno = idadeAluno;
	}
	//getters e setters
	
	public int getCaAlunos() {
		return caAlunos;
	}

	public void setCaAlunos(int caAlunos) {
		this.caAlunos = caAlunos;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(String enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	public int getIdadeAluno() {
		return idadeAluno;
	}

	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}
	
	
}
