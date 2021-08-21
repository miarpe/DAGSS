package trabajo;

public class TrabajoSerie extends Trabajo implements Runnable{
	
	public void run() {
		
		Thread miThread;
		
		for (Runnable runnable : this.trabajos) {
			try {
				miThread = new Thread(runnable);
				miThread.start();
				miThread.join();				
			}catch (InterruptedException e) {
				System.err.println("Interrupted Exception: " + e.getLocalizedMessage());
			}
		}
	}

}
