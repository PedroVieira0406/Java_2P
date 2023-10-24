package aplicacao;

import java.util.Objects;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String cpf;
	private Sexo sexo;
	
	public static Pessoa cadastrarPessoa() {
		Pessoa p= new Pessoa();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		p.nome=leia.next();
		System.out.println("Digite seu cpf:");
		p.cpf=leia.next();
		System.out.println("Qual seu genero?");
		System.out.println("1-- Masculino \n"
						   + "2-- Feminio");
		p.sexo=Sexo.valueOf(leia.nextInt());
		
		return p;
	}
	
	
	@Override
	public String toString() {
		return "Nome=" + nome + ".\n cpf=" + cpf + ".\n  Sexo=" + sexo + ".\n ------------------------------- ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, sexo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome) && sexo == other.sexo;
		
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
