package bot;

import java.util.Scanner;

public class Principal {
	 public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in); 
		 int opcao1, opcao2;
		 
		 Principal.inicio();
		 opcao1= leia.nextInt();
		 if(opcao1<6 && opcao1>0) {
		 alternativa1(opcao1);
		 opcao2= leia.nextInt();
		 
		 alternativa2(opcao1, opcao2);
		 }
		 else {
			 System.out.println("Opção invalida");
		 }
	 }
	 
	 public static void  inicio() {
		 System.out.println("Olá, você gostaria de veriificar: ");
		 System.out.println("1- Sua documentação");
		 System.out.println("2- Seus pagamentos");
		 System.out.println("3- Sua LTDA (Sociedade Limitada)");
		 System.out.println("4- Status do MEI (Microempreendedor Individual) ");
		 System.out.println("5- Outros");
		 System.out.println();
	 }
	 
	 public static void alternativa1(int valor) {
		 if (valor <6) {
			 if(valor ==1) {
				 System.out.println("Você gostaria de abrir:");
				 System.out.println("1--Alvara de Funcionamento");
				 System.out.println("2--Inscriçao Estadual");
				 System.out.println("3--Registro de junta comercial");
				 System.out.println("4--Contrato Social");
				 
			 } 
			 else if(valor ==2) {
				 System.out.println("Você gostaria de abrir:");
				 System.out.println("1--Pagamentos anteriores");
				 System.out.println("2--Pagementos pendentes");
				 				 
			 }
			 else if(valor ==3) {
				 System.out.println("Você gostaria de abrir:");
				 System.out.println("1--Faturamento e Atividades");
				 System.out.println("2--Tributacao");
				 System.out.println("3--Proteção Patrimonial Limitada");

			 }
			 else if(valor ==4) {
				 System.out.println("Você gostaria de abrir:");
				 System.out.println("1--Faturamento e Atividades");
				 System.out.println("2--Tributacao Simplificada");
				 System.out.println("3--Proteção Patrimonial Limitada");
				 
			 }
			 else if(valor ==5) {
				 System.out.println("Outros");
				 
			 }
		 }
	 }
	 public static void alternativa2(int valor, int valo2) {
		 
	 }

}
