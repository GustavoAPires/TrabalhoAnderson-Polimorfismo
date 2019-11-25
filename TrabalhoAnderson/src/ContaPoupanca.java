
public class ContaPoupanca extends Conta {

	@Override

	public void saque(double valorSaque) {

		super.contadorSaque++;
		if (super.contadorSaque >= 3) {
			super.taxa = 20;
		} else {
			super.taxa = 12;

			super.saque(valorSaque);
		}
	}
}
