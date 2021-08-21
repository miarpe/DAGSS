package Biblioteca;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
	private List<Libro> biblioteca;
	
	public Biblioteca(){
		biblioteca= new LinkedList<>();
	}
	public List<Libro> getLibros(){
		return this.biblioteca;
	}
	public void addLibro(Libro l) {
		this.biblioteca.add(l);
	}
	

}
