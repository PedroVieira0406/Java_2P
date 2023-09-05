package aplicacao02;

public class Principal {
	
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(15, 20);
		
		Quadrado quadrado = new Quadrado(13);
		

		
		System.out.println(quadrado.getAltura());
		System.out.println(quadrado.getLargura());
		
		System.out.println(retangulo.getAltura());
		System.out.println(retangulo.getLargura());
		
	}
}
