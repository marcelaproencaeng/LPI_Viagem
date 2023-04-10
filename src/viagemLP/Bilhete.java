package viagemLP;

import java.time.LocalDate;

public abstract class Bilhete {

	public long id;
	public int numero;
	public String assento;
	public LocalDate reservaEfetuada;
	private TipoBilhete tipoBilhete;

	public Bilhete(long id, int numero, String assento, LocalDate reservaEfetuada) {

		this.id = id;
		this.numero = numero;
		this.assento = assento;
		this.reservaEfetuada = reservaEfetuada;
		

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public LocalDate getReservaEfetuada() {
		return reservaEfetuada;
	}

	public void setReservaEfetuada(LocalDate reservaEfetuada) {
		this.reservaEfetuada = reservaEfetuada;
	}

	public TipoBilhete getTipoBilhete() {
		return tipoBilhete;
	}

	public void setTipoBilhete(TipoBilhete tipoBilhete) {
		this.tipoBilhete = tipoBilhete;
	}

	public void reservar(Passageiro p) throws RunTimeException {

		if (p.possuiReserva() == true) {
			throw new RunTimeException("Ops,não foi possível reservar o bilhete!Reserva inválida!");

		}

		if (p.idade() >= 18 && p.possuiReserva() == false) {
			System.out.println("Bilhete reservado!");
			this.reservaEfetuada = LocalDate.now();

		}
	}

	public void comprar(Passageiro p) throws RunTimeException {

		if (p.possuiReserva() == false) {
			throw new RunTimeException("Comprada inválida!");
		}
		if (p.possuiReserva() == true) {
			System.out.println("Compra efetuada!");
		}
		if (p.possuiReserva() == false && p.idade() < 18) {
			System.out.println("Compra não efetuada!");
		}
		if (p.possuiReserva() == true && TipoBilhete.ECONOMICA == tipoBilhete) {
			getTipoBilhete();
		}
		if (p.possuiReserva() == true && TipoBilhete.PRIMEIRACLASSE == tipoBilhete) {
			getTipoBilhete();
		}

	}

	public void cancelarReserva(Passageiro p) throws RunTimeException {
		if (p.possuiReserva() == false) {
			throw new RunTimeException("Você não possui reserva!");
		}
		if (p.possuiReserva() == true) {
			this.reservaCancelada = LocalDate.now();
			System.out.println("Reserva cancelada!");

		}

	}

	public abstract double getValor();

	public abstract int getMaximoBagagens();

	@Override
	public String toString() {
		return "Bilhete [id=" + id + ", numero=" + numero + ", assento=" + assento + ", reservaEfetuada="
				+ reservaEfetuada + ", reservaCancelada=" + reservaCancelada + "]";
	}

}
