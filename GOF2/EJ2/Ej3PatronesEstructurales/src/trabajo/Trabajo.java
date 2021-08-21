package trabajo;

import java.util.LinkedList;
import java.util.List;

public abstract class Trabajo extends Observable implements Runnable{
	
	protected List<Runnable> trabajos = new LinkedList<>();
	protected int creados;
	
	public void addTrabajo(Runnable subtrabajo) {
		this.trabajos.add(subtrabajo);
	}
	public int getCreados() {
		return creados;
	}

	public abstract void run();
}
