package programa;

public class ProgramaA implements Runnable{

	public void run() {
		try {
			System.out.println("[INICIO] ProgramaA");
			Thread.sleep(100);
			System.out.println("[FIN] ProgramA");
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
