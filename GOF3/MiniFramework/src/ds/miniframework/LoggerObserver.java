package ds.miniframework;


public class LoggerObserver implements Observer {
	Logger log;
	public LoggerObserver(Logger l) {
		this.log=l;
	}
	@Override
	public void update(String msg) {
		this.log.log(msg,this.log.INFO);
	}

}