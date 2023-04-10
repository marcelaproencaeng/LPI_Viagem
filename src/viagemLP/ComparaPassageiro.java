package viagemLP;

import java.util.Comparator;

public class ComparaPassageiro implements Comparator<Passageiro> {
	@Override
	public int compare(Passageiro p, Passageiro p1) {
		return p.getDataNascimento().compareTo(p1.getDataNascimento());

	}
}
