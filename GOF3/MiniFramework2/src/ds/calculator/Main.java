package ds.calculator;

import ds.miniframework.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Operation> lista_operaciones = new LinkedList<>();
		lista_operaciones.add(new Suma());
		lista_operaciones.add(new Divide());
		lista_operaciones.add(new ProtectedRaiz(new Raiz()));
		
		Aplicacion ap = new Aplicacion(lista_operaciones);
		ap.run();

	}

}
