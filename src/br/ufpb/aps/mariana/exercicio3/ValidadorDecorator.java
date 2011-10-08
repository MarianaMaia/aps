package br.ufpb.aps.mariana.exercicio3;

public class ValidadorDecorator implements Validador {

	public Validador validador;

	public ValidadorDecorator(Validador validador) {
		this.validador = validador;
	}

	public void validar(String valor) throws ValorInvalidoException {
		this.validador.validar(valor);
	}

}
