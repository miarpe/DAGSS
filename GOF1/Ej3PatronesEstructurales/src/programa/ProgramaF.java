package programa;

public class ProgramaF implements Runnable{

	public void run() {
		try {
			System.out.println("[INICIO] ProgramaF");
			Thread.sleep(10);
			System.out.println("[FIN] ProgramF");
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
