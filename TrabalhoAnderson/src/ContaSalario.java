
public class ContaSalario extends Conta {

	@Override

	public void saque(double valorSaque) {

		super.contadorSaque++;
		if (super.contadorSaque >= 1) {
			super.taxa = 50.00;
		} else {
			super.taxa = 0;
		}
		super.saque(valorSaque);
	}
}
