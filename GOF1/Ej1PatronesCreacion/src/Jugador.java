

import java.util.LinkedList;
import java.util.List;

public abstract class Jugador {

	protected List<Artillero> artilleros = new LinkedList<Artillero>();
	protected List<Zapador> zapadores = new LinkedList<Zapador>();
	protected FactoryFamilia familia;
	public Jugador(FactoryFamilia f){
		this.familia = f;
		
		//creamos el ejercito inicial (todos de la misma raza, no se pueden mezclar!)
		
		//[PUNTO DE REFACTORIZACION]
		artilleros.add(familia.crearArtillero());
		artilleros.add(familia.crearArtillero());
		zapadores.add(familia.crearZapador());
		zapadores.add(familia.crearZapador());

	}
	public abstract void jugar();
}
