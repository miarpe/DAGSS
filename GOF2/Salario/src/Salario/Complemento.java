package Salario;

public abstract class Complemento implements Salario{
	protected Salario salario;
	
	public Complemento(Salario s) {
		this.salario = s;
	}
}
