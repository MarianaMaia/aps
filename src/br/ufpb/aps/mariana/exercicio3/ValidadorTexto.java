package br.ufpb.aps.mariana.exercicio3;

public class ValidadorTexto implements Validador {

	public void validar(String valor) throws ValorInvalidoException {
		for (int i = 0; i < valor.length(); i++) {
			if (Character.isDigit(valor.charAt(i))) {
				throw new ValorInvalidoException(
						"e um campo texto nao pode ter numero");
			}
		}
	}

}
