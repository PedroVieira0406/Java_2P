package questao5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import questao3.Pessoa;
import questao3.Sexo;
import questao3.Telefone;

public class Principal {

    public static void main(String[] args) {
    	Scanner leia= new Scanner(System.in);
    	
    	List<Pessoa> teste = new ArrayList<>();
    	
    	Pessoa pessoa1 = new Pessoa(30, "João Silva", Sexo.MASCULINO);
    	pessoa1.adicionarTelefone("0123", "456789");
    	pessoa1.adicionarTelefone("0456", "987654");
    	teste.add(pessoa1);

    	Pessoa pessoa2 = new Pessoa(25, "Maria Oliveira", Sexo.FEMININO);
    	pessoa2.adicionarTelefone("0345", "123456");
    	teste.add(pessoa2);

    	Pessoa pessoa3 = new Pessoa(28, "Carlos Souza", Sexo.MASCULINO);
    	pessoa3.adicionarTelefone("0789", "654321");
    	teste.add(pessoa3);
        
    	imprimirListaOrdenadaPorIdade(teste);
    	imprimirListaOrdenadaPorNome(teste);
    	imprimirListaOrdenadaPorSexo(teste);

    	
    }
    
     public static Pessoa lerDados() {
    	Scanner leia= new Scanner(System.in);
    	Pessoa p = new Pessoa(0, "null", Sexo.MASCULINO);
        int i;

    	System.out.println("Digite seu nome:");
    	p.setNome(leia.next());
       
    	System.out.println("Qual sua idade?");
    	p.setIdade(leia.nextInt());
       
    	System.out.println("Qual seu genero? (respoda com 1 para Masculino e 2 para FEMININO)");
    	i= leia.nextInt();
    	if(i==2) {
    		p.setSexo(Sexo.FEMININO);
    	}
    	
    	System.out.println("Deseja adicionar um numero? (1 para confirmar e 2 para recusar");
    	i= leia.nextInt();
    	
    	while(i != 2){
    		String cd, num;
    		
    		System.out.println("Digite o codigo de area:");
    		cd=leia.next();
    		System.out.println("Digite o resto do numero");
    		num=leia.next();
    		
    		p.adicionarTelefone(cd, num);
    		
    		System.out.println("Deseja adicionar outro numero? (1 para confirmar e 2 para recusar");
        	i= leia.nextInt();
    	}
    	
        return p;
    }
     
    public static void imprimirLista(List<Pessoa> lista, Sexo sexo) {
    	for (Pessoa pessoa : lista) {
    		if(pessoa.getSexo()== sexo) {
    			
    			System.out.println();
    			System.out.println("Informações da Pessoa:");
    			pessoa.imprimir();

    			for (Telefone telefone : pessoa.getTelefones()) {
    				telefone.imprimir();
    			}
            }
    	}
    }

    public static void imprimirLista(List<Pessoa> lista) {
    	
    	for (Pessoa pessoa : lista) {
    		System.out.println();
            System.out.println("Informações da Pessoa:");
            pessoa.imprimir();

            for (Telefone telefone : pessoa.getTelefones()) {
                telefone.imprimir();
            }
    	}
    }

    public static void imprimirListaOrdenadaPorNome(List<Pessoa> lista) {
    	
    	lista.sort(new Comparator<Pessoa>() {
    		@Override
    		public int compare(Pessoa o1, Pessoa o2) {
    			// TODO Auto-generated method stub
    			return o1.getNome().compareTo(o2.getNome());
    		}
		});
    	
    	imprimirLista(lista);
    }
    
    public static void imprimirListaOrdenadaPorIdade(List<Pessoa> lista) {
    	
    	lista.sort(new Comparator<Pessoa>() {
    		
    		public int compare(Pessoa o1, Pessoa o2) {
    			if (o1.getIdade() < o2.getIdade())
    				return -1;
    			
    			else if (o1.getIdade() == o2.getIdade())
    				return 0;
    			
    			else
    				return 1;
    			}
    			});
    		
    		imprimirLista(lista);
    	}
    	
    public static void imprimirListaOrdenadaPorSexo(List<Pessoa> lista) {
    	
    	lista.sort(new Comparator<Pessoa>() {
    		@Override
    		public int compare(Pessoa o1, Pessoa o2) {
    			// TODO Auto-generated method stub
    			return o1.getSexo().compareTo(o2.getSexo());
    		}
		});
    	
    	imprimirLista(lista);
    	
    }
}
