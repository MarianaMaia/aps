package br.ufpb.aps.mariana.exercicio3;

public class ValidadorNomeDecorator extends ValidadorDecorator {

	public ValidadorNomeDecorator(Validador validador) {
		super(validador);
	}

	private int max = 30;
	private int min = 5;

	@Override
	public void validar(String valor) throws ValorInvalidoException {
		validador.validar(valor);

		if (valor.length() > max || valor.length() < min) {
			throw new ValorInvalidoException(
					"O tamanho maximo de caracteres e:" + max
							+ "\nE o tamanho minimimo e:" + min);

		}

	}

}
