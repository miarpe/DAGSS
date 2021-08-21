package Builder;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Biblioteca.Autor;
import Biblioteca.Biblioteca;
import Biblioteca.Libro;

public class ConcreteBuilderBiblioteca implements Builder {
	private Biblioteca b;
	private File file;
	Scanner leer;
	public ConcreteBuilderBiblioteca(File f) throws FileNotFoundException {
		this.file=f;
		this.b=new Biblioteca();
		this.leer= new Scanner(f);
	}

	public void BuildProduct1() {
		while(leer.hasNextLine()) {
			String[] contenido=leer.nextLine().split("\t");
			addLibro(contenido[0],contenido[1],contenido[2]);
		}
	}
	private void addLibro(String libro,String isbn,String autor) {
		Libro l= new Libro(libro,isbn,new Autor(autor));
		b.addLibro(l);
	}
	public Biblioteca getResultObject() {
		return this.b;	
	}

}
