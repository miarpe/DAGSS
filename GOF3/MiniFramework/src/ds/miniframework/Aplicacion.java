package ds.miniframework;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {
	List<Operation> lista_operaciones;
	Scanner input = new Scanner(System.in);

	public Aplicacion(List<Operation> l) {

		this.lista_operaciones = l;
	}

	public void run() {
		Logger logger = new FileLogger(new File("log.txt"), new ConsoleLogger(null, 0), 1);
		while (true) {
			int op = this.ShowMenu();
			if (op == -1) {
				System.out.println("Programa finalizado correctamente");
				break;
			}
			if (op != -2) {
				Operation op_select = this.selectOperation(op);
				LoggerObserver ob = new LoggerObserver(logger);
				op_select.addObserver(ob);
				System.out.println(op_select.execute(this.getParametros(op_select)));
				System.out.println("Operación completada con éxito");
			}
		}

	}

	private int ShowMenu() {
		Iterator itr = this.lista_operaciones.iterator();
		int i = 0;
		while (itr.hasNext()) {
			Operation op = (Operation) itr.next();
			System.out.println("Opción " + i + ": " + op.getName());
			i++;
		}
		System.out.println("Opción -1 para salir de la aplicación");
		try {
			int opcion = Integer.parseInt(input.nextLine());
			if (this.lista_operaciones.size() < opcion | opcion < -1)
				System.out.println("Introduce la opcion correcta");
			else if (opcion == -1)
				return -1;
			else
				return opcion;

		} catch (NumberFormatException excepcion) {
			System.out.println("Introduce los datos correctamente");
		}
		return -2;
	}

	private Operation selectOperation(int op) {
		return this.lista_operaciones.get(op);

	}

	private List<String> getParametros(Operation p) {
		Iterator itr = p.getParameters().iterator();
		List<String> l = new LinkedList<String>();
		while (itr.hasNext()) {
			String op = (String) itr.next();
			System.out.println("Dame un " + op);
			String opcion = input.nextLine();
			l.add(opcion);
		}
		return l;
	}
}
