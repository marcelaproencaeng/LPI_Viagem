package viagemLP;

import java.time.LocalDate;

public class PrimeiraClasse extends Bilhete {

	public String passagemPrimeiraClasse;
	public int bagagemPrimeiraClasse;
	public String aeroportoDestino;

	public PrimeiraClasse(long id, int numero, String assento, LocalDate reservaEfetuada, String passagemPrimeiraClasse,
			int bagagemPrimeiraClasse, String aeroportoDestino) {
		super(id, numero, assento, reservaEfetuada);
		this.passagemPrimeiraClasse = passagemPrimeiraClasse;
		this.bagagemPrimeiraClasse = bagagemPrimeiraClasse;
		this.aeroportoDestino = aeroportoDestino;

	}

	public String getPassagemPrimeiraClasse() {
		return passagemPrimeiraClasse;
	}

	public void setPassagemPrimeiraClasse(String passagemPrimeiraClasse) {
		this.passagemPrimeiraClasse = passagemPrimeiraClasse;
	}

	public int getBagagemPrimeiraClasse() {
		return bagagemPrimeiraClasse;
	}

	public void setBagagemPrimeiraClasse(int bagagemPrimeiraClasse) {
		this.bagagemPrimeiraClasse = bagagemPrimeiraClasse;
	}

	public String getAeroportoDestino() {
		return aeroportoDestino;
	}

	public void setAeroportoDestino(String aeroportoDestino) {
		this.aeroportoDestino = aeroportoDestino;
	}

	@Override
	public double getValor() {
		double valorBilhete = 100;
		return (valorBilhete + (0.5 * valorBilhete));
	}

	@Override
	public int getMaximoBagagens() {
		int numeroDigitado = 0;
		int maximoBagagens = 0;

		for (int i = 0; i <= numeroDigitado; i++) {
			maximoBagagens = maximoBagagens + i;

			if (maximoBagagens == 3) {

				return maximoBagagens;

			} else {
				return 0;
			}

		}
		return 0;

	}

	@Override
	public String toString() {
		return "PrimeiraClasse [passagemPrimeiraClasse=" + passagemPrimeiraClasse + ", bagagemPrimeiraClasse="
				+ bagagemPrimeiraClasse + ", aeroportoDestino=" + aeroportoDestino + "]";
	}

}
