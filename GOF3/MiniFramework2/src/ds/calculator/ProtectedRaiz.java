package ds.calculator;


import java.util.List;

import ds.miniframework.Operation;

public class ProtectedRaiz extends Operation {
	private Raiz raiz;

	public ProtectedRaiz(Raiz r) {
		raiz = r;
	}

	public String getName() {
		return this.raiz.getName();
	}

	public List<String> getParameters() {
		return this.raiz.getParameters();
	}

	public String execute(List<String> operandos) {
		if (LicenseManager.checkIsFullVersion()) {
			return this.raiz.execute(operandos);
		} else {
			return "No disponible";
		}
	}
}
