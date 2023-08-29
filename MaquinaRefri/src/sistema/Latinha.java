package sistema;

public class Latinha {
	private  String nome;
	private  static int estoque;
	
	public Latinha(String nome) {
		this.nome= nome;
		estoque=30;
	}
	
	public String getNome() {
		return nome;
	}
	
	public static int getEstoque() {
		return estoque;
	}
	
	public static void setEstoque( int retirada) {
		estoque-= retirada;
	}
}

