package viagemLP;

import java.time.LocalDate;

public abstract class Bilhete {

	private long id;
	private int numero;
	private String assento;
	private LocalDate reservaEfetuada;
	private LocalDate reservaCancelada;
	private TipoBilhete tipoBilhete;

	public Bilhete(long id, int numero, String assento) {

		this.id = id;
		this.numero = numero;
		this.assento = assento;

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

	public LocalDate getReservaCancelada() {
		return reservaCancelada;
	}

	public void setReservacancelada(LocalDate reservaCancelada) {
		this.reservaCancelada = reservaCancelada;
	}

	public TipoBilhete getTipoBilhete() {
		return tipoBilhete;
	}

	public void setTipoBilhete(TipoBilhete tipoBilhete) {
		this.tipoBilhete = tipoBilhete;
	}

	public void reservar(Passageiro p) {

		if (p.idade() > 18) {
			System.out.println("Bilhete reservado!");
			this.reservaEfetuada = LocalDate.now();
		} else {
			System.out.println("Ops,não foi possível reservar o bilhete!");
		}
	}

	public void comprar(Passageiro p) throws RunTimeException {

		if (p.possuiReserva() == false) {
			throw new RunTimeException("Comprada inválida!");
		}
		if (p.possuiReserva() == true && p.idade() >= 18) {
			System.out.println("Compra efetuada!");
		}
		if(p.possuiReserva()== true && TipoBilhete.ECONOMICA==tipoBilhete) {
			getTipoBilhete();
		}
		if(p.possuiReserva()== true && TipoBilhete.PRIMEIRACLASSE==tipoBilhete) {
			getTipoBilhete();
		}
		if(p.possuiReserva()==false && p.idade()>=18 && getTipoBilhete()==tipoBilhete && 
			) {get
			System.out.println("Tentativa de compra sem sucesso, você não possui reserva!");
		}

	}

	public void cancelarReserva(Passageiro p) {

		if (p.possuiReserva() == true) {
			this.reservaCancelada = LocalDate.now();
			System.out.println("Reserva cancelada!");
		} else {
			System.out.println("Você não possui reserva!");
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
