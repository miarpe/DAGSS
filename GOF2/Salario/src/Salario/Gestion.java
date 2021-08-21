package Salario;

public class Gestion extends Complemento{
	
	public Gestion(Salario s) {
		super (s);
	}

	@Override
	public double calcularSalario() {
		return salario.calcularSalario() + 15;
	}
}
