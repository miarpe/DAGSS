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
		}
		
		for(Thread thread : threadList) {
			try {
				thread.join();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
