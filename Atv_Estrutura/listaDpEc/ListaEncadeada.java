package listaDpEc;

public class ListaEncadeada {
    private No primeiroNo;
    private No ultimoNo;
    private int tamanho;
    private int indice = 0;

    public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public ListaEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
    }
	 
    public void inserirOrdenado(Integer elemento) {
    No novoNo = new No(elemento);

    if (tamanho == 0 || elemento.compareTo(primeiroNo.getElemento()) < 0) {
        novoNo.setProximo(primeiroNo);
        primeiroNo = novoNo;
    } else {
        No noAtual = primeiroNo;
        while (noAtual.getProximo() != null && elemento.compareTo(noAtual.getProximo().getElemento()) >= 0) {
            noAtual = noAtual.getProximo();
        }
        novoNo.setProximo(noAtual.getProximo());
        noAtual.setProximo(novoNo);
    }
    if (novoNo.getProximo() == null) {
        ultimoNo = novoNo;
    }
    tamanho++;
    }

        public No pesquisarPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null; // Posição inválida
        }

        No noAtual = primeiroNo;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }
        return noAtual;
    }
        
    public void limparLista() {
        primeiroNo = null;
        ultimoNo = null;
        tamanho = 0;
    }

        public void percorrerLista() {
        No noAuxiliar = primeiroNo;
        while (noAuxiliar != null) {
            System.out.println(noAuxiliar.getElemento());
            noAuxiliar = noAuxiliar.getProximo();
        }
    }

    public void imprimir(){
        No noAuxiliar = this.primeiroNo;
        System.out.println(noAuxiliar.getElemento());

        while (noAuxiliar.getProximo() != null){
            noAuxiliar = noAuxiliar.getProximo();
        }
    }

    public void imprimir(int indice) {
    	if(this.indice == indice) {
   		System.out.println(this.toString());
    	}
    	
    }
    
    public No getPrimeiroNo() {
        return primeiroNo;
    }

    public No getUltimoNo() {
        return ultimoNo;
    }

    public void setUltimoNo(No ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public void setPrimeiroNo(No primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

        public int getTamanho() {
        return tamanho;
    }

		@Override
		public String toString() {
			return "ListaEncadeada [primeiroNo=" + primeiroNo + ", ultimoNo=" + ultimoNo + ", tamanho=" + tamanho + "]";
		}
        
        

}
