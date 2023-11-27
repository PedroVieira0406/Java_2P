package musica;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Principal {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Musica> meuMap = new HashMap<>();
        int opcao1, chave = 0;

        inicio();
        opcao1 = tratarValor();

        while (opcao1 != 5) {
            if (opcao1 < 5 && opcao1 > 0) {
                if (opcao1 == 1)
                    chave++;
                inicio();
                alternativa1(opcao1, meuMap, chave);
                opcao1 = tratarValor();
            } else {
                System.out.println("Opção inválida");
            }
        }
        System.out.println("Finalizando operação");

        leia.close();
    }

    public static void inicio() {
        System.out.println("Olá, você gostaria de verificar: ");
        System.out.println("1- Adicionar uma musica");
        System.out.println("2- Ver a lista de musicas salvas");
        System.out.println("3- Atualizar uma musica");
        System.out.println("4- Deletar uma musica");
        System.out.println("5- Finalizar operacao");
        System.out.println();
    }

    public static Integer tratarValor() {
        int tentativas = 3;

        while (tentativas >= 1) {
            try {
                System.out.println();
                return leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite um numero!!");
            } finally {
                leia.nextLine();
            }
            System.out.println(--tentativas + " tentativas restantes!");
        }
        System.out.print("\n3 tentativas inválidas! Saindo do Sistema!");
        return 0;
    }
    
    public static Integer tratarValor2() {
        int tentativas = 3;

        while (tentativas >= 1) {
            try {
            	int j =leia.nextInt();
            	if( j ==2 || j==1)
                return j;
            	else return 2;
            } catch (InputMismatchException e) {
                System.out.println("Digite um numero!!");
            } finally {
                leia.nextLine();
            }
            System.out.println(--tentativas + " tentativas restantes!");
        }
        System.out.print("\n3 tentativas inválidas! Saindo do Sistema!");
        return 0;
    }
	 
	 public static void alternativa1(int valor,Map<Integer,Musica> mapa,Integer chave) {
		 if (valor <5) {
			 if(valor ==1) {
				 //creat
				 mapa.put(chave, adicionarMusica());	
				 
			 }
			 else if(valor ==2) {
				 //read
				 lerMapa(mapa);
				 
			 }
			 
			 else if(valor ==3) {
				 //update
				 int j=0;
				 
				 lerMapa(mapa);
				 System.out.println("Qual musica vc quer editar? (escreva a chave)");
				 j=tratarValor();
				 if(j!=0) {
					 System.out.println("Lembrando que a musica será deletada e voce tera que preencher todas as informcoes dela, dejesa confirmar? ");
					 System.out.println("(escreva 1 para sim e 2 para nao)");
					 if(tratarValor2()!=2) {
						 mapa.remove(j);
						 System.out.println("Musica removida");
						 System.out.println("Coloque os dados dela:");
						 mapa.put(j, adicionarMusica());
						 System.out.println("musica adicionada");
						 System.out.println();
					 }
				 }
				 
			 }

			 }
			 
			 else if(valor ==4) {
				 //delete
				 int f=0;
				 
				 lerMapa(mapa);
				 System.out.println("Qual musica vc quer deletar? (escreva a chave)");
				 f=tratarValor();
				 if(f!=0) {
					 System.out.println("Você tem certeza de remover a musica numero " +f+"?  (escreva 1 para sim e 2 para nao)" );
					 if(tratarValor()==1) {
						 mapa.remove(f);
						 System.out.println("Musica removida");
						 System.out.println();
					 }
				 }
			 }
		 }

	 public static void lerMapa(Map<Integer,Musica> mapa) {
		for (Entry<Integer, Musica> entry : mapa.entrySet()) {
	            Integer chave = entry.getKey();
	            Musica valores = entry.getValue();
	            System.out.println("Chave "+ chave +", Musica: " + valores);
		}
		System.out.println();
	 }
	 
	 public static Musica adicionarMusica() {
		 int i;
		 Musica musica = new Musica(null, 0, null);
		 
		 System.out.println("Qual o nome da musica?");
		 musica.setNome(leia.nextLine());
		 leia.nextLine();
		 
		 System.out.println("Qual o tempo da musica em segundos:");
		 musica.setDuracao(tratarValor());
		 
		 System.out.println("O Copyright dela é pago?  (digite 1 para sim e 2 para não)");
		 i=tratarValor2();
		 if (i!=2) {
			 musica.setCopyright(Copyright.pago);
		 }
		 else {
			 musica.setCopyright(Copyright.livre);
		 }
		 
		 i=1;
		 while (i != 2){
			 String nm, cargo;
			 System.out.println("Coloque o nome do musico:");
			 nm=leia.nextLine();
			 leia.nextLine();
			 
			 System.out.println("Coloque a funcao do musico:");
			 cargo=leia.nextLine();
			 leia.nextLine();
			 
			 musica.adicionarMusico(nm, cargo);
			 
			 System.out.println("Deseja adicionar outro musico?  (digite 1 para sim e 2 para não)");
			 i = tratarValor2();
		 }
		 
		 return musica;
		 
	 }

}
