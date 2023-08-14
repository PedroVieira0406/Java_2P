package questoes;

import dados.Aluno;
import dados.Telefone;
import java.util.Scanner;

public class Atv3 {
    
    public static void main(String[] args) {

      
        Aluno[] alunos = new Aluno[10];
        
        for (int i = 0; i < alunos.length; i++) { 
        	
        	System.out.println("Cadastro do Aluno " + (i + 1));

        	alunos[i] = lerAluno();
        	alunos[i].telefone = lerTelefone();
        }

        imprimir(alunos);
    }
    
    public static Aluno lerAluno() {
        Scanner leia = new Scanner(System.in);
        Aluno individuo1 = new Aluno();
            
        System.out.print("Nome: ");
        individuo1.nome = leia.next();

        System.out.print("Matéria: ");
        individuo1.materia = leia.next();
            
        System.out.print("Nota: ");
        individuo1.nota = leia.nextInt();
            
        return individuo1;
    }
    
    public static Telefone lerTelefone() {
        Scanner leia = new Scanner(System.in);
        Telefone individuo2 = new Telefone();
            
        System.out.print("Número de Telefone: ");
        individuo2.numero = leia.nextInt();
            
        return individuo2;
    }
    
    public static void  imprimir(Aluno[] vetAluno) {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : vetAluno) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Matéria: " + aluno.materia);
            System.out.println("Nota: " + aluno.nota);
            System.out.println("Telefone: " + aluno.telefone.numero);
            System.out.println();
        }
    }
}
