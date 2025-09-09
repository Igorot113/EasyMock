package interPagamento;

public class Pagamento {
	private ProcessarCartao cartao;

	public Pagamento(ProcessarCartao cartao) {
		this.cartao = cartao;
	}

	public boolean pagar(String numero, double valor) {
		if (valor <= 0) {
			return false;
		} else {
			return cartao.cobrar(numero, valor);
		}
	}
}
