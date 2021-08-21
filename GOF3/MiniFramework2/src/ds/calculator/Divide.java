package ds.calculator;

import ds.miniframework.*;
import java.util.LinkedList;
import java.util.List;

public class Divide extends Operation {
	public String getName() {
		return "Divide";
	}

	public List<String> getParameters() {
		List<String> parametros = new LinkedList<String>();
		parametros.add("Operando 1");
		parametros.add("Operando 2");
		return parametros;
	}

	public String execute(List<String> operandos) {
		try {
			notifyObservers("La operacion lleva el 25%");
			int dividendo = Integer.parseInt(operandos.get(0));
			notifyObservers("La operacion lleva el 50%");
			int divisor = Integer.parseInt(operandos.get(1));
			notifyObservers("La operacion lleva el 75%");
			int division = Math.abs(dividendo) / Math.abs(divisor);
			notifyObservers("La operacion lleva el 100%");
			String resultado = Integer.toString(division);
			return "La division es " + resultado;
		} catch (NumberFormatException excepcion) {
			return "Formato de datos incorrecto";
		} catch (ArithmeticException ex) {
			return "El divisor es 0";
		}
	}

}
