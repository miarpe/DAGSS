package trabajo;

import java.util.LinkedList;
import java.util.List;

public abstract class Trabajo implements Runnable{
	
	protected List<Runnable> trabajos = new LinkedList<>();
	
	public void addTrabajo(Runnable subtrabajo) {
		this.trabajos.add(subtrabajo);
	}

	public abstract void run();
}
