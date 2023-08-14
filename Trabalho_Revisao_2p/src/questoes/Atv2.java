package questoes;

import dados.Aluno;
import dados.Telefone;
import java.util.Scanner;

public class Atv2 {
    
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];
        
        for (int i = 0; i < alunos.length; i++) {
        	
        	alunos[i] = new Aluno();
        	alunos[i].telefone = new Telefone();
        	
            System.out.println("Cadastro do Aluno " + (i + 1));

            System.out.print("Nome: ");
            alunos[i].nome = leia.next();

            System.out.print("Matéria: ");
            alunos[i]. materia = leia.next();
            
            System.out.print("Nota: ");
            alunos[i].nota = leia.nextInt();

            System.out.print("Número de Telefone: ");
            alunos[i].telefone.numero = leia.nextInt();

        }
        leia.close();
        
        System.out.println("Lista de Alunos:");
        
        for (Aluno aluno : alunos) {
        	
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Matéria: " + aluno.materia);
            System.out.println("Nota: " + aluno.nota);
            System.out.println("Telefone: " + aluno.telefone.numero);
            System.out.println();
        }
    }
}