package listaDpEc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();
        int elemento=0;

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                	System.out.print("Digite o elemento a ser inserido: ");
                    elemento = scanner.nextInt();
                    lista.inserirOrdenado(elemento);
                    System.out.println("Elemento inserido na lista.");
                    break;
                case 2:
                    System.out.println("Quantidade de nós na lista: " + lista.getTamanho());
                    break;
                case 3:
                    System.out.println("Elementos na lista:");
                    lista.imprimirLista();
                    break;
                case 4:
                    lista.limparLista();
                    System.out.println("Lista limpa.");
                    break;
                case 5:
                    System.out.print("Digite a posição do nó a ser pesquisado: ");
                    int posicao = scanner.nextInt();
                    No noPesquisado = lista.pesquisarPosicao(posicao);
                    if (noPesquisado != null) {
                        System.out.println("Elemento na posição " + posicao + ": " + noPesquisado.getElemento());
                    } else {
                        System.out.println("Posição inválida.");
                    }
                    break;
                case 6:
                	System.out.print("Digite o elemento a ser removido: ");
                    elemento = scanner.nextInt();
                    lista.remover(elemento);
                    System.out.println("Elemento inserido na lista.");
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Inserir nó");
        System.out.println("2. Quantidade de nós");
        System.out.println("3. Imprimir a lista");
        System.out.println("4. Limpar a lista");
        System.out.println("5. Pesquisar nó na posição");
        System.out.println("6. Remover da lista o nó:");
        System.out.println("0. Sair");
        System.out.println();
        System.out.print("Escolha uma opção: ");
        
    }
}
