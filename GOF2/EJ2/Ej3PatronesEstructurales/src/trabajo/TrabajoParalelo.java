package trabajo;

import java.util.LinkedList;
import java.util.List;

public class TrabajoParalelo extends Trabajo implements Runnable{
	
	public void run() {
		
		List<Thread> threadList = new LinkedList<>();
		
		for (Runnable runnable : this.trabajos) {
			threadList.add(new Thread(runnable));			
		}
		
		for(Thread thread : threadList) {
			thread.start();
			this.creados++;
			notifyObservers();

		}
		
		for(Thread thread : threadList) {
			try {
				thread.join();
				this.creados--;
				notifyObservers();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
