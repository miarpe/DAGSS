package ds.calculator;

import ds.miniframework.*;
import java.util.LinkedList;
import java.util.List;

public class Suma extends Operation {
	
	public String getName() {
		return "Suma";
	}
	public List<String> getParameters(){
		List<String> parametros= new LinkedList<String>();
		parametros.add("Operando 1");
		parametros.add("Operando 2");
		return parametros;
	}
	public String execute(List<String> operandos) {
		try {
		notifyObservers("La operacion lleva el 25%");
		int sumando_1= Integer.parseInt(operandos.get(0));
		notifyObservers("La operacion lleva el 50%");
		int sumando_2= Integer.parseInt(operandos.get(1));
		notifyObservers("La operacion lleva el 75%");
		int suma= sumando_1+sumando_2;
		notifyObservers("La operacion lleva el 100%");
		String resultado= Integer.toString(suma);
		return "La suma es "+resultado;
        } catch (NumberFormatException excepcion) {
            return "Formato de datos incorrecto";
        }
	}

}
