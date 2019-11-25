
public class ContaCorrente extends Conta {

	@Override

	public void saque(double valorSaque) {

		super.contadorSaque++;
		if (super.contadorSaque >= 10) {
			super.taxa = 60;
		} else if (super.contadorSaque >= 5 && super.contadorSaque <= 10) {
			super.taxa = 45;
		} else {
			super.taxa = 28;
		}
		super.saque(valorSaque);
	}
}
