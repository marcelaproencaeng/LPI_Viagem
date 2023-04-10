package viagemLP;

import java.time.LocalDate;

public class Economica extends Bilhete {

	public String classeEconomica;
	public int bagagemClasseEconomica;
	public String companhiaAerea;
	public String destino;

	public Economica(long id, int numero, String assento, LocalDate reservaEfetuada, String classeEconomica,
			int bagagemClasseEconomica, String companhiaAerea, String destino) {
		super(id, numero, assento, reservaEfetuada);
		this.classeEconomica = classeEconomica;
		this.bagagemClasseEconomica = bagagemClasseEconomica;
		this.companhiaAerea = companhiaAerea;
		this.destino = destino;

	}

	public String getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(String classeEconomica) {
		this.classeEconomica = classeEconomica;
	}

	public int getBagagemClasseEconomica() {
		return bagagemClasseEconomica;
	}

	public void setBagagemClasseEconomica(int bagagemClasseEconomica) {
		this.bagagemClasseEconomica = bagagemClasseEconomica;
	}

	public String getCompanhiaAerea() {
		return companhiaAerea;
	}

	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public double getValor() {
		double valorBilhete = 100;
		return valorBilhete;
	}

	@Override
	public int getMaximoBagagens() {

		int maximoBagagens = 0;
		int numeroDigitado = 0;

		for (int i = 0; i <= numeroDigitado; i++) {

			maximoBagagens = maximoBagagens + i;

			if (maximoBagagens == 1) {
				return maximoBagagens;

			} else {

				return 0;

			}

		}
		return 0;
	}

	@Override
	public String toString() {
		return "Economica [classeEconomica=" + classeEconomica + ", bagagemClasseEconomica=" + bagagemClasseEconomica
				+ ", companhiaAerea=" + companhiaAerea + ", destino=" + destino + "]";
	}

}
