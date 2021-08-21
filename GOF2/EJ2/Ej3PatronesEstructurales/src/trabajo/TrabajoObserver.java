package trabajo;

public class TrabajoObserver implements Observer {
	public int b;


	@Override
	public void update(Observable o) {
		int num= ((Trabajo) o).getCreados();
		if(b<num) {
		System.out.println("Se ha creado un programa,actualmente hay"+num+"en curso"+((Trabajo) o).toString());
		this.b=num;
		}else {
			System.out.println("Se ha eliminado un programa,actualmente hay"+num+"en curso"+((Trabajo) o).toString());
			this.b=num;
		}
		
		
	}

}
