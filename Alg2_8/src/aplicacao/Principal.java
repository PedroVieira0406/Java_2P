package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Pessoa> lista= new ArrayList <Pessoa>();

		for(int i=0; i<4; i++) {	
			lista.add(Pessoa.cadastrarPessoa());
		}
		imprimirTudo(lista);
		
		List<Pessoa> copiaLista= new ArrayList <Pessoa>(lista);
		for (Pessoa pessoa : copiaLista) {
			if(pessoa.getSexo()== Sexo.HOMEM) {
				lista.remove(lista.indexOf(pessoa));
				
			}
		}
		System.out.println();
		System.out.println();
		imprimirTudo(lista);

		leia.close();
	}

	public static void imprimirTudo(List<Pessoa> lista) {
		System.out.println("Lista de pessoas: ");
		System.out.println();
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}


}
