package br.ufpb.aps.mariana.exercicio3;

public class ValidadorEmail implements Validador {

	private int max = 200;

	@Override
	public void validar(String valor) throws ValorInvalidoException {
		if (valor.length() > max)
			throw new ValorInvalidoException("O tamanho maximo do e-mail e: "
					+ max);

		if (!valor.contains(valor))
			throw new ValorInvalidoException("E-mail invalido");

		int cont = 0;

		for (int i = 0; i < valor.length(); i++) {
			if ('@' == (valor.charAt(i))) {
				cont++;
			}
		}
		if (cont == 0) {

			throw new ValorInvalidoException("tem q ter um @");

		}
		if (cont > 1) {

			throw new ValorInvalidoException("Não pode ter mais de uma  @");

		}
		if ('@' == (valor.charAt(0))) {
			throw new ValorInvalidoException("@ nao pode no inicio ");
		}
		if ('@' == (valor.charAt(valor.length() - 1))) {
			throw new ValorInvalidoException("@ nao pode no fim ");
		}

	}

}
