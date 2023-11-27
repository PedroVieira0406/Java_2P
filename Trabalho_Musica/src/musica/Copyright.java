package musica;

public enum Copyright{
	livre(1),
	pago(2);
	
	private final int valor;

	Copyright(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
	

}
