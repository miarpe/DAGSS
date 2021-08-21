package ds.miniframework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileLogger extends Logger {
	File fichero_salida;
	StringBuilder sb = new StringBuilder();
	public FileLogger(File f,Logger l,int u){
		super(l,u);
		this.fichero_salida=f;
	}
	public void _log(String msg) {
		try(PrintWriter f= new PrintWriter(this.fichero_salida)) {
			sb.append(msg);
			sb.append("\n");
			f.write(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


}
