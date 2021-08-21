package Biblioteca;

public class Libro {
	private String isbn;
	private Autor autor;
	private String nombre;
	
	public Libro(String nombre,String libro,Autor autor){
		this.isbn=libro;
		this.autor=autor;
		this.nombre=nombre;
	}
	public String getISBN() {
		return this.isbn;
	}
	public Autor getAutor() {
		return this.autor;
	}
	public String getNombre() {
		return this.nombre;
	}
	@Override
	public String toString() {
		StringBuilder bl= new StringBuilder();
		bl.append("Libro :");
		bl.append(this.nombre);
		bl.append("\n");
		bl.append("Autor :");
		bl.append(this.autor.getNombre());
		bl.append("\n");
		bl.append("ISBN :");
		bl.append(this.isbn);
		bl.append("\n");
		return bl.toString();
	}
}
