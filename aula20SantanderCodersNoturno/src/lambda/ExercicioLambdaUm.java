package lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lambda.Pessoa;

public class ExercicioLambdaUm {

	public static void main(String[] args) {
		
		/*
		List<Pessoa> listaNomeTeste = Arrays.asList(
				new Pessoa("Marcos", 19),
				new Pessoa("Jerbas", 20),
				new Pessoa("Paco", 50),
				new Pessoa("Maria", 7)
				);
		
		listaNomeTeste.sort(Comparator.comparing(s -> ));
		*/
		
		
		
		/*
		List<Pessoa> listaPessoa = Arrays.asList(
				new Pessoa("Jeremy", 10),
				new Pessoa("Marian", 40),
				new Pessoa("Terbas", 7),
				new Pessoa("Cacau", 19)
				);
		
		System.out.println("Ordenando por nome:");
		listaPessoa.sort(new Comparator<Pessoa> () {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				listaPessoa.sort(o1, o2) -> o
				return 0;
			}
			
		*/
		
	
		
		
		
		
		
		
		/*
		List<String> listaNome = new ArrayList<>();
		listaNome.addAll(Arrays.asList("Isaque", "Mariane", "Joana", "Rafael"));
		
        listaNome.sort((nome1, nome2) -> Integer.compare(nome1.length(), nome2.length()));
		
        System.out.println("Ordenando pessoas pelo nome:");
		listaNome.forEach((auxiliarNome) -> {System.out.println(auxiliarNome);});
		
		List<Integer> listaIdade = new ArrayList<>();
		listaIdade.addAll(Arrays.asList(10, 9, 7, 50));
		
		System.out.println("Ordenando pessoas pela idade:");
        listaIdade.sort((idade1, idade2) -> Integer.compare(idade1, idade2));
		
        System.out.println();
		listaIdade.forEach((auxiliarIdade) -> {System.out.println(auxiliarIdade);});
		
	    System.out.println();
	    System.out.println("Imprimindo pessoas com idade:");
	    System.out.println(listaNome.get(0) + ", " + listaIdade.get(1) + "\n" + listaNome.get(1) + ", " + listaIdade.get(0) +
	    		"\n" + listaNome.get(2) + ", " + listaIdade.get(2) + "\n" + listaNome.get(3) + ", " + listaIdade.get(3));
		*/

	}

}
