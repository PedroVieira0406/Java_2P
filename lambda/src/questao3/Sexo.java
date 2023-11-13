package questao3;

public enum Sexo {
    MASCULINO(1),
    FEMININO(2);

    private final int valor;

    Sexo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}