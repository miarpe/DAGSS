package Salario;

public class Trienio extends Complemento{
	
	public Trienio(Salario s) {
		super (s);
	}

	@Override
	public double calcularSalario() {
		return salario.calcularSalario() + 10;
	}
}
