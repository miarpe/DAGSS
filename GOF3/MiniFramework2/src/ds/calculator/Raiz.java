package ds.calculator;

import ds.miniframework.*;
import java.util.LinkedList;
import java.util.List;

public class Raiz extends Operation {
	public String getName() {
		return "Raiz";
	}

	public List<String> getParameters() {
		List<String> parametros = new LinkedList<String>();
		parametros.add("Operando 1");
		return parametros;
	}

	public String execute(List<String> operandos) {
		try {
			notifyObservers("La operacion lleva el 33%");
			int operando = Integer.parseInt(operandos.get(0));
			notifyObservers("La operacion lleva el 66%");
			double raiz = Math.sqrt(operando);
			notifyObservers("La operacion lleva el 100%");
			String resultado = Double.toString(raiz);
			return "La raiz es " + resultado;
		} catch (NumberFormatException excepcion) {
			return "Formato de datos incorrecto";
		}
	}

}
