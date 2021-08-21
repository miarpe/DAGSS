package programa;

public class ProgramaD implements Runnable{

	public void run() {
		try {
			System.out.println("[INICIO] ProgramaD");
			Thread.sleep(100);
			System.out.println("[FIN] ProgramD");
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
