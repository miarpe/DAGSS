package programa;

public class ProgramaD implements Runnable{

	public void run() {
		try {
			System.out.println("[INICIO] ProgramaD");
			Thread.sleep(10);
			System.out.println("[FIN] ProgramD");
		}catch(InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	

}
