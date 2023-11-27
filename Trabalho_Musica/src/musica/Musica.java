package musica;

import java.util.ArrayList;
import java.util.List;

public class Musica {
	private String nome;
	private int duracao;
	private Copyright copyright ;
	private List<Musico> musicos;
	
	public Musica (String nome,int duracao,Copyright copyright){
		
		this.nome=nome;
		this.duracao= duracao;
		this.copyright= copyright;
		this.musicos = new ArrayList<>();
		
	}
	
	public void adicionarMusico(String nome, String cargo) {
        Musico musico = new Musico(nome, cargo);
        musicos.add(musico);
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Copyright getCopyright() {
		return copyright;
	}
	public void setCopyright(Copyright copyright) {
		this.copyright = copyright;
	}
	public List<Musico> getMusicos() {
		return musicos;
	}
	public void setMusicos(List<Musico> musicos) {
		this.musicos = musicos;
	}

	@Override
	public String toString() {
	    StringBuilder builder = new StringBuilder();
	    builder.append("Musica= ").append(nome)
	           .append(", duracao= ").append(duracao)
	           .append(", copyright ").append(copyright)
	           .append(", musicos=");
	    
	    for (Musico musico : musicos) {
	        builder.append("{Nome= ").append(musico.getNome())
	               .append(", cargo= ").append(musico.getCargo())
	               .append("}");
	    }
	    
	    return builder.toString();
	}
	
	

}
