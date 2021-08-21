package Salario;

public class Sexenio extends Complemento{
	
	public Sexenio(Salario s) {
		super (s);
	}

	@Override
	public double calcularSalario() {
		return salario.calcularSalario() + 50;
	}
}
