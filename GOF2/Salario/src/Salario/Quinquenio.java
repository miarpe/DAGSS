package Salario;

public class Quinquenio extends Complemento{
	
	public Quinquenio(Salario s) {
		super (s);
	}

	@Override
	public double calcularSalario() {
		return salario.calcularSalario() + 20;
	}
}
