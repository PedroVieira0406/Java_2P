package aplicacao;

public enum Sexo {
	HOMEM (1,"homem"),
	MULHER (2,"mulher");
	
	private int id;
	private String genero;
	
	private Sexo(int id,String genero ) {
		this.id = id;
		this.genero= genero;
	}
	public static Sexo valueOf(int id) {
        for (Sexo sexo : values()) {
            if (sexo.id == id) {
                return sexo;
            }
        }
        throw new IllegalArgumentException("Valor invalido para genero");
    }
}
