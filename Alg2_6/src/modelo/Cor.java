package modelo;

public enum Cor {
	BRANCA (1, "Branca"),
	PRETA (2, "Preta"),
	AZUL (3, "Azul");
	
	
	private int id;
	private String descricao;
	
	private Cor(int id, String descricao) {
		this.id = id;
		this.descricao= descricao;
	}

}
