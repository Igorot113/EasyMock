package interPagamento;

public interface ProcessarCartao {
	boolean cobrar(String numero, double valor);
}
