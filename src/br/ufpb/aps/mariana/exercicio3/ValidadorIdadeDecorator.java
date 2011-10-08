package br.ufpb.aps.mariana.exercicio3;

public class ValidadorIdadeDecorator extends ValidadorDecorator {

	public ValidadorIdadeDecorator(Validador validador) {
		super(validador);
	}

	private int min = 0;
	private int max = 150;

	public void validar(String valor) throws ValorInvalidoException {
		validador.validar(valor);
		int v = Integer.parseInt(valor);
		if (v < min) {
			throw new ValorInvalidoException("valor minimo de idade e:" + min);
		}

		if (v > max) {
			throw new ValorInvalidoException("valor maximo de idade e:" + max);
		}
	}

}
