package modelo;

import java.util.Objects;

public class Telefone {
	
	
	
	private Integer id;
	private String nome;
	private Cor cor;
	
	@Override
	public int hashCode() {
		return Objects.hash(cor, id, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return cor == other.cor && Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
		
	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
}
