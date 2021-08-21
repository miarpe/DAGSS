package programa;

public class ProgramaC implements Runnable{

	public void run() {
		try {
			System.out.println("[INICIO] ProgramaC");
			Thread.sleep(100);
			System.out.println("[FIN] ProgramC");
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
