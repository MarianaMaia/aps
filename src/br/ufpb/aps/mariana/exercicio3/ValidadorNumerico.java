package br.ufpb.aps.mariana.exercicio3;

public class ValidadorNumerico implements Validador {

	public void validar(String valor) throws ValorInvalidoException {

		for (int i = 0; i < valor.length(); i++) {
			if (Character.isLetter(valor.charAt(i))) {
				throw new ValorInvalidoException("Digite um numero");
			}
		}
	}

}
