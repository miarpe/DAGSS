package ds.miniframework;

import java.util.LinkedList;
import java.util.List;

public class Observable {
	List<Observer> observer= new LinkedList<>();
	
	public void addObserver(Observer o) {
		this.observer.add(o);
	}
	public void removeObserver(Observer o) {
		this.observer.remove(o);
	}
	protected void notifyObservers(String msg) {
		for(Observer o:observer) {
			o.update(msg);
		}
	}

}
