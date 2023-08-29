
package sistema;

import java.util.Scanner;

public class Interface {
	
	 public static void main(String[] args) {
		 
		 Latinha fanta = new Latinha("Fanta");
		 Latinha coca = new Latinha("Coca-cola");
		 Latinha guarana = new Latinha("Guarana");
		 Latinha jesus = new Latinha("Guarana Jesus");
		 Latinha soda = new Latinha("Soda");
		 
		 Scanner leia = new Scanner(System.in);
		 
		 int quantidade; 

		 menu(fanta, coca, guarana, jesus, soda);
		 quantidade=  escolha(leia.nextInt());
		 
		 if(0<quantidade && Latinha.getEstoque()>quantidade ) {
			 pagamento(quantidade);
		 }
		 else {
			 System.out.println("");
			 System.out.println("Quantia ou tipo requisitado indisponível");
		 }
		 
		 System.out.println("Compra finalizada");
		 leia.close();
	 }
	 
	public static void pagamento(int quantidade) {
		Scanner leia = new Scanner(System.in); 
		
		Pagamento.pagar(quantidade);
			 
		System.out.println("Valor total da compra: "+ Pagamento.getValorTotal());
		System.out.println("Deposite o valor pago:");
		
		Pagamento.setValorPago(leia.nextDouble());
		Pagamento.setTroco();
		
		if(Pagamento.getTroco()>=0) {
			System.out.println("Entregando o troco de: "+ Pagamento.getTroco());
			System.out.println("Entregando as "+ quantidade + " unidades de refrigerante lata");
				 
		}
		else {
			System.out.println("Valor insuficiente");
			System.out.println("Devolvendo valor pago " + Pagamento.getValorPago());
		} 
	}
	 
	 public static int escolha (int acao) {
		 Scanner leia = new Scanner(System.in); 
		 
		 int quantidade =0;
		 
		 if(acao<=6) {
			if(acao==1) {
				 System.out.println("Quantas latas de Fanta você quer? ");
				 quantidade=leia.nextInt();
				 Latinha.setEstoque(quantidade);
			}
			else if (acao ==2) {
				System.out.println("Quantas latas de Coca-Cola você quer? ");
				quantidade=leia.nextInt();
				Latinha.setEstoque(quantidade);
			}
			else if (acao ==3) {
				System.out.println("Quantas latas de Guaraná você quer? ");
				quantidade=leia.nextInt();
				Latinha.setEstoque(quantidade);
			}
			else if (acao ==4) {
				System.out.println("Quantas latas de Guaraná Jesus você quer? ");
				quantidade=leia.nextInt();
				Latinha.setEstoque(quantidade);
			 }
			 else if (acao ==5) {
				System.out.println("Quantas latas de Soda você quer? ");
				quantidade=leia.nextInt();
				Latinha.setEstoque(quantidade); 
			 }
			 else if (acao ==6) {
				 System.out.println("Entendido");
			 }
		 }
		 
		 else {
			 System.out.println("ERROR");
		 }
		
		 return quantidade;
	 }
	 
	 public static void menu(Latinha fanta, Latinha coca, Latinha guarana, Latinha jesus, Latinha soda) {
		 System.out.println("-----------------------------");
		 System.out.println("Escolha oque irá pegar:");
		 System.out.println("Obs: Todos são latinhas e custam R$4,50");
		 System.out.println("Só é possivel pegar um tipo por vez");
		 System.out.println("-----------------------------");
		 System.out.println("1--" + fanta.getNome() + ". Estoque= " +fanta.getEstoque());
		 System.out.println("2--" + coca.getNome() + ". Estoque= " +coca.getEstoque());
		 System.out.println("3--" + guarana.getNome()+ ". Estoque= " +guarana.getEstoque());
		 System.out.println("4--" + jesus.getNome()+ ". Estoque= " +jesus.getEstoque());
		 System.out.println("5--" + soda.getNome()+ ". Estoque= " +soda.getEstoque());
		 System.out.println("6--Cancelar compra");
		 
	 }
}