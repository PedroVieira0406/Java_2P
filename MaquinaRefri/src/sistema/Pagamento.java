package sistema;

public class Pagamento {
	private static Double valorTotal;
	private static Double valorPago;
	private static Double troco;
	
	
	public static Double pagar(int quantidade) {
		return valorTotal = 4.50* quantidade;
	}
	
	
	public static Double getValorTotal() {
		return valorTotal;
	}
	
	public static Double getValorPago() {
		return valorPago;
	}
	
	public static Double getTroco() {
		return troco;
	}
	
	
	public static void setValorPago( Double pagamento) {
		valorPago= pagamento;
	}
	
	public static void setTroco() {
		troco=  valorPago -valorTotal ;
	}
	
}
