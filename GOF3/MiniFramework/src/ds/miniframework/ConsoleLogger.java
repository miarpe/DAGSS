package ds.miniframework;

public class ConsoleLogger extends Logger {
	
	public ConsoleLogger(Logger l,int u){
		super(l,u);
	}
	public void _log(String msg) {
		System.out.println(msg);
	}

}
