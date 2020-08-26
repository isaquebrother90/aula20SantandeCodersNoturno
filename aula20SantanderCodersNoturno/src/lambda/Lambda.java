package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		List<Pessoa> nomes = new ArrayList<>();
		nomes.addAll(Arrays.asList(new Pessoa ("Franklin", 27)));
		nomes.addAll(Arrays.asList(new Pessoa ("Isaque", 30)));
		nomes.addAll(Arrays.asList(new Pessoa ("Zara", 8)));
		nomes.addAll(Arrays.asList(new Pessoa ("Mariane", 50)));
		nomes.addAll(Arrays.asList(new Pessoa ("Irazelma", 17)));
		
		nomes.sort((nome1, nome2) -> Integer.compare(((CharSequence) nome1).length(), ((CharSequence) nome2).length()));
		//(nomes1,nomes2) -> System.outprint(nomes));
		//
		//listaNome.sort((nome1, nome2) -> Integer.compare(nome1.length(), nome2.length()));

		
		for (Pessoa nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println(nomes);
		
			
		
		//nomes.sort((nome1, nome2) -> Integer.compare(nome1.length(), nome2.length()));
		
		nomes.forEach((t) -> {System.out.println(t);});
		
		//nomes.forEach(System.out::println); Outra forma de imprimir

	}

}
