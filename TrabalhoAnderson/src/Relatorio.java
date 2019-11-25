import java.util.ArrayList;

public class Relatorio {

	public ArrayList<Conta> lista = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		lista.add(conta);
	}

	public double taxaRecolhida() {
		double totalTaxa = 0;
		for (int i = 0; i < lista.size(); i++) {
			totalTaxa += lista.get(i).taxa;
		}
		return totalTaxa;
	}
}
