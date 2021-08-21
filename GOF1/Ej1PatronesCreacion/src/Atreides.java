
public class Atreides implements FactoryFamilia {

	public Atreides() {
	}
	
	public ArtilleroAtreides crearArtillero() {
		return new ArtilleroAtreides();	
	}
	public ZapadorAtreides crearZapador() {
		return new ZapadorAtreides();
	}
}
