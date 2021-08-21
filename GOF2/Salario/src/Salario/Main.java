package Salario;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;


public class Main {

	public static void main(String[] args) {

		System.out.println("Dame el archivo: ");
		Scanner in = new Scanner(System.in);
		String fichero = in.nextLine();

		try(Scanner scanner = new Scanner(new File(fichero))){
			
			String nombre;
			Salario escala;
			Salario anhos;
			Salario gestion;
			
			while(scanner.hasNextLine()) {
				String linea = scanner.nextLine();
				String[] tokens = linea.split("\t");
				nombre = tokens[0];
				escala = escalaTrabajador(tokens[1]);
				anhos = anhosTrabajados(tokens[2],escala);
				gestion = gestionTrabajador(tokens[3],anhos);
				
				System.out.println(nombre + "\t" + gestion.calcularSalario());
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	private static Salario escalaTrabajador(String escala) {
		
		switch(escala) {
		case "A":
			return new EscalaA();
		case "B":
			return new EscalaB();
		case "C":
			return new EscalaC();
		default:
			throw new NoSuchElementException("Error en la escala");
		}
	}
	
	private static Salario anhosTrabajados(String anhos,Salario salario) {
		
		int anho = Integer.parseInt(anhos);
		int trienio = anho/3;
		int quinquenio = anho/5;
		int sexenio = anho/6;
		for(int i=0;i<trienio;i++) {
			salario = new Trienio(salario);
		}
		for(int i=0;i<quinquenio;i++) {
			salario = new Quinquenio(salario);
		}
		for(int i=0;i<sexenio;i++) {
			salario = new Sexenio(salario);
		}
		
		return salario;
	}
	
	private static Salario gestionTrabajador(String gestion,Salario salario) {
		
		if(gestion.equals("SI")) {
			return new Gestion(salario);
		}else {
			return salario;
		}
	}

}
