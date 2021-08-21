package Builder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import Biblioteca.Autor;
import Biblioteca.Biblioteca;
import Biblioteca.Libro;

public class ConcreteBuilderXML implements Builder{
	private Biblioteca b;
	private File file;
	Scanner leer;
	private String fichero;
	public ConcreteBuilderXML(File f) throws FileNotFoundException {
		this.file=f;
		this.b=new Biblioteca();
		this.leer= new Scanner(f);
	}

	public void BuildProduct1() {
		this.fichero="<libros>\n";
		while(leer.hasNextLine()) {
			String[] contenido=leer.nextLine().split("\t");
			addLibro(contenido[0],contenido[1],contenido[2]);
		}
		this.fichero+="</libros>";
	}
	private void addLibro(String libro,String isbn,String autor) {
		this.fichero+="<libro>\n";
		this.fichero+="<titulo>"+libro+"</titulo>\n";
		this.fichero+="<autor>"+autor+"</autor>\n";
		this.fichero+="<isbn>"+isbn+"</isbn>\n";
		this.fichero+="</libro>\n";
	}
	public String getResultObject() throws FileNotFoundException {
		PrintStream out= new PrintStream(new FileOutputStream("PRUEBAS.xml"));
		out.print(this.fichero);
		out.close();
		return this.fichero;	
	}
}
