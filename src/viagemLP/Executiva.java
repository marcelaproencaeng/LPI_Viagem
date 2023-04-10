package viagemLP;

import java.time.LocalDate;

public class Executiva extends Bilhete {
	public String passagemExecutiva;

	public Executiva(long id, int numero, String assento, LocalDate reservaEfetuada,
			String passagemExecutiva) {
		super(id, numero, assento, reservaEfetuada);
		this.passagemExecutiva = passagemExecutiva;
	}

	public String getPassagemExecutiva() {
		return passagemExecutiva;
	}

	public void setPassagemExecutiva(String passagemExecutiva) {
		this.passagemExecutiva = passagemExecutiva;
	}

	@Override
	public double getValor() {
		double valorBilhete = 100;
		return (valorBilhete + (0.25 * valorBilhete));
	}

	@Override
	public int getMaximoBagagens() {

		int numeroDigitado = 0;
		int maximoBagagens = 0;

		for (int i = 0; i <= numeroDigitado; i++) {
			maximoBagagens = maximoBagagens + i;

			if (maximoBagagens == 2) {

				return maximoBagagens;

			} else {
				return 0;

			}
		}

		return 0;

	}

	@Override
	public String toString() {
		return "Executiva [passagemExecutiva=" + passagemExecutiva + "]";
	}
}
