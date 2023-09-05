package aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		LocalDateTime dataHora = LocalDateTime.now();
		
		DateTimeFormatter formatter= 
				DateTimeFormatter.ofPattern("dd/MMMM/yy hh:mm");
		
		System.out.println("Horario formatado: ");
		System.out.println(dataHora.format(formatter));
		System.out.println();
		
		
//		LocalTime tempo= LocalTime.now();
//		
//		DateTimeFormatter formatter= 
//				DateTimeFormatter.ofPattern("hh:mm:ss");
//		
//		System.out.println("Horario: ");
//		System.out.println(tempo);
//		System.out.println();
//		
//		System.out.println("Horario formatado: ");
//		System.out.println(tempo.format(formatter));
//		System.out.println();
		
//		Scanner leia= new Scanner(System.in);
//		
//		System.out.println("Informe uma data no seguinte formato:"+
//				"Ex. 01/12/2020");
//		String dataEntrada= leia.next();
//		
//		LocalDate data= LocalDate.parse(dataEntrada,
//			DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		
//		System.out.println("data: ");
//		System.out.println(data);
//		System.out.println();
		
		
		
//		LocalDate data= LocalDate.parse("2031-09-05");
//		
//		System.out.println("data: ");
//		System.out.println(data);
//		System.out.println();
		
		
	
//		Scanner leia= new Scanner(System.in);
//		
//		System.out.println("Informe a data de aniversário: ");
//		System.out.println("Informe o dia: ");
//		int dia= leia.nextInt();
//		
//		System.out.println("Informe o mes");
//		int mes= leia.nextInt();
//		
//		System.out.println("Informe o ano");
//		int ano= leia.nextInt();
//		
//		LocalDate data= LocalDate.of(ano, mes, dia);
//		
//		System.out.println("data: ");
//		System.out.println(data);
//		System.out.println();
		
		
		
//		Scanner leia= new Scanner(System.in);LocalDate data= LocalDate.now();
//		LocalDate data= LocalDate.of(2023, 11, 20);
//		
//		LocalDate novaData=  data.plusDays(45);
//		LocalDate dataAntiga= data.minusWeeks(3);
//		
//		DateTimeFormatter formatter =
//				DateTimeFormatter.ofPattern("dd/M/yyyy");
//		
//		String dataFormatada= data.format(formatter);
//		
//		System.out.println("data: ");
//		System.out.println(data);
//		System.out.println();
//		System.out.println("data antiga: ");
//		System.out.println(dataAntiga);
//		System.out.println();
//		System.out.println("nova data: ");
//		System.out.println(novaData);
//		System.out.println();
//		System.out.println("data formatada: ");
//		System.out.println(dataFormatada);
//		System.out.println();
		
	}

}
