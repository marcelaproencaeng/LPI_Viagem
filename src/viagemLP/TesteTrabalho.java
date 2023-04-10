package viagemLP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteTrabalho {

	public static void main(String[] args) throws RunTimeException {

		List<Passageiro> lista = new ArrayList<>();

		Passageiro p = new Passageiro("Maria Sampaio", "Rua José de Alencar 1000 Menino Deus Porto Alegre-RS",
				LocalDate.of(1995, 10, 20));
		Passageiro p1 = new Passageiro("Pedro Neves", "Rua Dona Laura 156 Moinhos de Vento Porto Alegre-RS",
				LocalDate.of(1990, 11, 15));
		p.documentoPadrao();
		p1.documentoPadrao();
		lista.add(p);
		lista.add(p1);
		System.out.println(lista);
		Collections.sort(lista);

		System.out.println(lista);

		ComparaPassageiro pp1 = new ComparaPassageiro();
		Collections.sort(lista, pp1);
		System.out.println(lista);

		List<Economica> listaE = new ArrayList<>();
		Economica econ = new Economica(52l, 33, "18C", LocalDate.of(2022, 12, 9), 
				"Classe econômica", 1, "Azul","Rio de Janeiro");

		econ.comprar(p);
		listaE.add(econ);
		System.out.println(listaE);

		List<PrimeiraClasse> listaP = new ArrayList<>();
		PrimeiraClasse pClass = new PrimeiraClasse(78l, 54, "22F", LocalDate.of(2022,11, 10),
				"Passagem Primeira Classe", 3, "Galeão-RJ");

		pClass.comprar(p1);
		listaP.add(pClass);
		System.out.println(listaP);

	}

}