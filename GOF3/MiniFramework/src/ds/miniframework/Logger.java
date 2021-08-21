package ds.miniframework;

public abstract class Logger {
	public final int DEBUG=0;
	public final int INFO=1;
	public final int ERROR=2;
	protected int umbral;
	protected Logger sucesor;
	
	public Logger(Logger l ,int u) {
		this.sucesor=l;
		this.umbral=u;
	}
	public void log(String msg,int p) {
		
		if(p>=umbral) {
			this._log(msg);
		}
		if(sucesor!=null) {
			sucesor.log(msg,p);
		}
	}
	public abstract void _log(String msg);

}
