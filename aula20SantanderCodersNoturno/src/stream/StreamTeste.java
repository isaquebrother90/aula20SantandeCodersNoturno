package stream;

import java.util.ArrayList;
import java.util.List;


public class StreamTeste {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Java", 150));
		cursos.add(new Curso("PHP", 120));
		cursos.add(new Curso("JavaScript", 200));
		
		cursos.stream().filter(c -> c.getNome().startsWith("Java"));
		
	}

}
