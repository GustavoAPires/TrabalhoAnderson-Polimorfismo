
public class Conta {

	public String agencia;
	public String numeroConta;
	public String nomeTitular;
	double saldo;

	protected int contadorSaque = 0;
	double taxa;

	public void saque(double valorSaque) {
		this.saldo -= valorSaque;
		contadorSaque++;
	}

	public void deposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public double getSaldo() {
		this.saldo -= taxa;
		return saldo;
	}

}
