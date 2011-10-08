package br.ufpb.aps.mariana.exercicio3;

public class validadorLoginDecorator extends ValidadorDecorator {
	private int max = 20;
	private int min = 0;

	public validadorLoginDecorator(Validador validador) {
		super(validador);
	}

	public void validar(String valor) throws ValorInvalidoException {
		validador.validar(valor);
		if (valor.length() > max || valor.length() == min)
			throw new ValorInvalidoException("O tamanho maximo do login e: "
					+ max + "\n O tamanho minimo do login e:" + min);
	}

}
