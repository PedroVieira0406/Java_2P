package aplicacao02;

public class Quadrado extends Retangulo{

	public Quadrado() {
		super (0,0);
	}
	public Quadrado(int tamanho) {
		super (tamanho,tamanho);
		System.out.println("Contruindo o Quadrado");
	}
	
	
}
