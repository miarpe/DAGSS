package programa;

public class ProgramaE implements Runnable{

	public void run() {
		try {
			System.out.println("[INICIO] ProgramaE");
			Thread.sleep(100);
			System.out.println("[FIN] ProgramE");
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
