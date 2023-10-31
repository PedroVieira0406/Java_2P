package aplicacao;

import java.util.Comparator;
import java.util.List;

public class Pessoa implements Comparable<Pessoa>{
	public String nome;
	public String cpf;
	public int idade;
	
	Pessoa(String nome, String cpf, int idade){
		this.nome=nome;
		this.cpf=cpf;
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void ordenarPorNome(List<Pessoa> lista){ // Bom método. Pequeno e faz o que o nome dele diz
        lista.sort(new Comparator<Pessoa>() {  // Interface Funcional: Apenas 1 método abstrato
            // Criei método de forma anônima, não tem dono, não tem classe. Criei uma instância dessa interface e agora preciso implementar
            // os métodos dela, como se tivesse implementando em uma classe
            // Espera comparator (interface). Posso criar uma classe e implementar essa interface e passar isso. Ou instancio a interface e passo o método dela
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        }); 
    }

    public static void ordenarPorCpf(List<Pessoa> lista){
        lista.sort(new Comparator<Pessoa>() { 
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getCpf().compareTo(o2.getCpf());
            }
        }); 
    }

    public static void ordenarPorIdade(List<Pessoa> lista){
        lista.sort(new Comparator<Pessoa>() { 
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                Integer valor = o1.getIdade(); // Já faz o casting automático. Não tem compareTo em int, mas tem em Integer
                // Se fosse pra ser decrescente: Integer valor = o2.getIdade(); return valor.compareTo(o1.getIdade()); Leitura seria da direita para a esquerda
                return valor.compareTo(o2.getIdade());
            }
        }); 
    }

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.getNome());
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
	
}
