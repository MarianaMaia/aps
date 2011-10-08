package br.ufpb.aps.mariana.exercicio3;

public class ValidadorSenhaTextoDecorator extends ValidadorDecorator {

	public ValidadorSenhaTextoDecorator(Validador validador) {
		super(validador);

	}

	public void validar(String valor) throws ValorInvalidoException {
		validador.validar(valor);

	}

}
