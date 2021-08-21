package trabajo;

public class TrabajoSerie extends Trabajo implements Runnable{
	
	public void run() {
		
		Thread miThread;
		
		for (Runnable runnable : this.trabajos) {
			try {
				miThread = new Thread(runnable);
				miThread.start();
				this.creados++;
				this.notifyObservers();
				miThread.join();
				this.creados--;
				this.notifyObservers();
			}catch (InterruptedException e) {
				System.err.println("Interrupted Exception: " + e.getLocalizedMessage());
			}
		}
	}

}
