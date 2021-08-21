
public class Harkonen implements FactoryFamilia {
	public Harkonen() {
	}
	
	public ArtilleroHarkonen crearArtillero() {
		return new ArtilleroHarkonen();
	}
	public ZapadorHarkonen crearZapador() {
		return new ZapadorHarkonen();
	}

}
