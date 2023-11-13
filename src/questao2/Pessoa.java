package questao2;

import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Impressao {
    private String nome;
    private int idade;
    private Sexo sexo;
    private List<Telefone> telefones;

    public Pessoa(int idade, String nome, Sexo sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
 
    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(String codigoArea, String numero) {
        Telefone telefone = new Telefone(codigoArea, numero);
        telefones.add(telefone);
    }

	@Override
	public void imprimir() {
		System.out.println("Nome='" + nome +
                ", idade= " + idade + " anos" +
                ", sexo = " + sexo +
                '}');
	}
}