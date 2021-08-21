

public class JugadorMaquina extends Jugador {
	
	public JugadorMaquina(FactoryFamilia f) {
		super(f);
	}

	@Override
	public void jugar() {
		//disparamos!
		for (Artillero artillero : artilleros){
			artillero.disparar();
		}
		
		//ponemos bombas!
		for (Zapador zapador: zapadores){
			zapador.ponerBomba();
		}

	}

}
