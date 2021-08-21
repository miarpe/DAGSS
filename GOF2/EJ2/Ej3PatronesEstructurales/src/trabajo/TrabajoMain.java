package trabajo;
import programa.ProgramaA;
import programa.ProgramaB;
import programa.ProgramaC;
import programa.ProgramaD;
import programa.ProgramaE;
import programa.ProgramaF;

public class TrabajoMain {

	public static void main(String[] args) {
		Trabajo a = new TrabajoSerie();
		a.addTrabajo(new ProgramaA());
		Trabajo d_f = new TrabajoSerie();
		d_f.addTrabajo(new ProgramaD());
		d_f.addTrabajo(new ProgramaF());
		Trabajo b_c_d_f = new TrabajoParalelo();
		b_c_d_f.addTrabajo(new ProgramaB());
		b_c_d_f.addTrabajo(new ProgramaC());
		b_c_d_f.addTrabajo(d_f);
		Trabajo e= new TrabajoSerie();
		e.addTrabajo(new ProgramaE());
		Trabajo t = new TrabajoSerie();
		TrabajoObserver o=new TrabajoObserver();
		t.addObserver(o);
		t.addTrabajo(a);
		t.addTrabajo(b_c_d_f);
		t.addTrabajo(e);
		t.run();
	}

}
