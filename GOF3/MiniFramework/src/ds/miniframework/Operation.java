package ds.miniframework;

import java.util.List;

public abstract class Operation extends Observable  {
	
	public abstract String getName();
	public  abstract List<String> getParameters();
	public  abstract String execute(List<String> parametros);

}
