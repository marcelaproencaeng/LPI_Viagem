package viagemLP;

import java.time.LocalDate;
import java.util.Objects;

public class Passageiro implements Pessoa, Comparable<Passageiro> {
	public String nome;
	public String endereco;
	public LocalDate dataNascimento;

	public Passageiro(String nome, String endereco, LocalDate dataNascimento) {

		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean possuiReserva() throws RunTimeException {
		int anoDeNascimento = dataNascimento.getYear();
		int anoAtual = LocalDate.now().getYear();

		if (anoAtual - anoDeNascimento >= 18) {
			return true;

		} else {
			return false;
		}
	}

	public int idade() {
		int anoDeNascimento = dataNascimento.getYear();
		int anoAtual = LocalDate.now().getYear();
		return anoAtual - anoDeNascimento;
	}
	@Override
	public String documentoPadrao() {
		return "Passageiro";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		Passageiro passageiro = (Passageiro) o;
		return Objects.equals(nome, passageiro.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override

	public int compareTo(Passageiro passageiro) {
		return this.dataNascimento.compareTo(passageiro.getDataNascimento());
	}

	@Override
	public String toString() {
		return "Passageiro [nome=" + nome + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + "]";
	}

}
