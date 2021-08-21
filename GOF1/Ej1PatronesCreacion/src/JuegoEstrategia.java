

public class JuegoEstrategia {

	public static void main(String[] args) {
		Jugador maquina = new JugadorMaquina(new Harkonen());
		
		//podriamos pedir el equipo al jugador
		Jugador humano = new JugadorHumano(new Atreides());
				
		while(true){
			System.out.println("JUEGA MAQUINA");
			maquina.jugar();
			System.out.println("JUEGA HUMANO");
			humano.jugar();
		}
	}

}
