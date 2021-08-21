import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Builder.ConcreteBuilderBiblioteca;
import Builder.ConcreteBuilderXML;
import Builder.Director;

public class Main {

	public static void main(String[] args) {
		//PRUEBAS
		System.out.println("Introduce el fichero");
		Scanner in = new Scanner(System.in);
		String fichero=in.nextLine();
		File archivo= new File(fichero);
		try {
			ConcreteBuilderXML xml= new ConcreteBuilderXML(archivo);
			ConcreteBuilderBiblioteca objeto= new ConcreteBuilderBiblioteca(archivo);
			Director d= new Director(xml);
			Director d2= new Director(objeto);
			d.buildProduct();
			d2.buildProduct();
			System.out.println("Resultado:"+xml.getResultObject());
			System.out.println("Resultado:"+objeto.getResultObject().getLibros().toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
