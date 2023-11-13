package questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import questao3.Pessoa;
import questao3.Sexo;
import questao3.Telefone;

public class Principal {

    public static void main(String[] args) {
    	Scanner leia= new Scanner(System.in);
    	List<Pessoa> p = new ArrayList<>();
    	int i=1; 
    	
//    	List<Pessoa> teste = new ArrayList<>();
//    	
//    	Pessoa pessoa1 = new Pessoa(30, "João Silva", Sexo.MASCULINO);
//      pessoa1.adicionarTelefone("0123", "456789");
//      pessoa1.adicionarTelefone("0456", "987654");
//      teste.add(pessoa1);
//
//      Pessoa pessoa2 = new Pessoa(25, "Maria Oliveira", Sexo.FEMININO);
//      pessoa2.adicionarTelefone("0345", "123456");
//      teste.add(pessoa2);
//
//      Pessoa pessoa3 = new Pessoa(28, "Carlos Souza", Sexo.MASCULINO);
//      pessoa3.adicionarTelefone("0789", "654321");
//      teste.add(pessoa3);
//        
//      imprimirLista(teste,Sexo.MASCULINO);
//    	imprimirLista(,Sexo.FEMININO)
        

    	System.out.println("Começo do cadastro:");
    
    	while(i ==1) {
    		p.add(lerDados());
    		
    		System.out.println();
    		System.out.println("Deseja fazer outro cadastro? (1 para confirmar, 2 para recusar)");
    		
    		i=leia.nextInt();
    			
    	}
    	
    	System.out.println("Imprimindo lista de cadastros:");
    	imprimirLista(p);

    	System.out.println();
    	System.out.println("Deseja imprimir a lista de apenas um genero? (1 para confirmar, 2 para recusar)");
    	i=leia.nextInt();
    	
    	if(i==1) {
    		System.out.println("Qual genero? (1 para MASCULINO, 2 para FEMININO)");
    		i=leia.nextInt();
    		if(i==1) {
    			imprimirLista(p,Sexo.MASCULINO);
    			
    		}
    		else if(i==2) {
    			imprimirLista(p,Sexo.FEMININO);
    			
    		}
    	}
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

}
