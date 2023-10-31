package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

//		List<String> lista = new ArrayList<>();
//		
//		lista.add("B");
//		lista.add("A");
//		lista.add("c");
//		lista.add("F");
//		lista.add("e");
//		lista.add("d");
//		lista.add("H");
//		lista.add("g");
//		
//		for(String valor : lista) {
//			System.out.println(valor);
//		}
//	
//		System.out.println();
//		
//		Collections.sort(lista);
//		
//		for(String valor : lista) {
//			System.out.println(valor);
//		}
		
		List<Pessoa> lista = new ArrayList<>();
		
		lista.add(new Pessoa("Marco","444",20));
		lista.add(new Pessoa("Carlos","321",29));
		lista.add(new Pessoa("Mathias","123",34));
		lista.add(new Pessoa("Joao","777",64));
		lista.add(new Pessoa("Ana","222",12));
		lista.add(new Pessoa("Maria","333",45));
		
		for(Pessoa valor : lista) {
			System.out.println(valor);
		}
	
		System.out.println();
		
		//fazer a organização da lista
		lista.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
		
		//imprimir a lista
		lista.forEach(p -> System.out.println(p));
		
		System.out.println();
		
		//Cria uma lista fantasma para alguma ação
		lista.stream()
		.filter(p -> p.getIdade()>30)
		.forEach(p -> System.out.println(p))
		;
		
		System.out.println();


//		lista.sort(new Comparator<Pessoa>() {
//			
//			public int compare(Pessoa o1, Pessoa o2) {
//				return  o1.getNome().compareTo(o2.getNome());
//			}	
//		});	
//		for(Pessoa valor : lista) {
//			System.out.println(valor);
//		}
	}
}
