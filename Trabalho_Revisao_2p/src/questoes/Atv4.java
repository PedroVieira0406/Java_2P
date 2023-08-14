package questoes;

import java.util.Scanner;

public class Atv4 {
    
    public static void main(String[] args) {

        Atv4 programa = new Atv4();        
        Aluno[] alunos = new Aluno[10];
        float media=0;
        
        for (int i = 0; i < alunos.length; i++) { 
        	
        	System.out.println("Cadastro do Aluno " + (i + 1));

        	alunos[i] = programa.lerAluno();
        }

        Atv4.imprimir(alunos);
    }
    
    public Aluno lerAluno() {
        Scanner leia = new Scanner(System.in);
        Aluno individuo1 = new Aluno();
            
        System.out.print("Nome: ");
        individuo1.nome = leia.next();

        System.out.print("Matéria: ");
        individuo1.materia = leia.next();
            
        System.out.print("A1: ");
        individuo1.a1 = leia.nextInt();
        
        System.out.print("A2: ");
        individuo1.a2 = leia.nextInt();
        
        individuo1.media=Atv4.media(individuo1);
        individuo1.aprovado= Atv4.aprovado(individuo1);
            
        return individuo1;
    }
    public static float media(Aluno aluno) {
    	
		return (aluno.a1 + aluno.a2)/2;
		
	}
    
	public static String aprovado(Aluno aluno) {
		
		float media = media(aluno);
		
		if( media >=6) {
			return "Aprovado";
		}
		else {
			return "Reprovado";
		}
		
	}
    
    public static void  imprimir(Aluno[] vetAluno) {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : vetAluno) {
        	System.out.println("---------------------------------------------------------------------");
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Matéria: " + aluno.materia);
            System.out.println("Nota da a1: " + aluno.a1);
            System.out.println("Nota da a2: " + aluno.a2);
            System.out.println("Média: " + aluno.media );
            System.out.println("Condição "+ aluno.aprovado);

        }
    }

	public class Aluno {
		public String nome;
		public String materia;
		public int a1;
		public int a2;
		public float media;
		public String aprovado;
		
	}
}

