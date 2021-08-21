package trabajo;

import java.util.LinkedList;
import java.util.List;

public class Observable {
	List<Observer> observer= new LinkedList<>();
	
	public void addObserver(Observer o) {
		this.observer.add(o);
	}
	public void removeObserver(Observer o) {
		this.observer.add(o);
	}
	protected void notifyObservers() {
		for(Observer o:observer) {
			o.update(this);
		}
	}

}
