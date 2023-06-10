package cursojava.aulaconstrutores;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private String cpf;

	public Pessoa(String nome, String sobrenome, int idade, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}