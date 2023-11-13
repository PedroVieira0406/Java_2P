package questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
    	Scanner leia= new Scanner(System.in);
    	List<Pessoa> p = new ArrayList<>();
    	int i=1;
    	
    	System.out.println("Começo do cadastro:");
    
    	while(i ==1) {
    		p.add(lerDados());
    		
    		System.out.println();
    		System.out.println("Deseja fazer outro cadastro? (1 para confirmar, 2 para recusar)");
    		
    		i=leia.nextInt();
    			
    	}
    	
    	System.out.println("Imprimindo lista de cadastros:");
    	imprimirLista(p);
        
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