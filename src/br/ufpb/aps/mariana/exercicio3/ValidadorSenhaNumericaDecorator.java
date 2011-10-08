package br.ufpb.aps.mariana.exercicio3;

public class ValidadorSenhaNumericaDecorator extends ValidadorDecorator {

	private int max = 100;
	private int min = 8;

	public ValidadorSenhaNumericaDecorator(Validador validador) {
		super(validador);
	}

	public void validar(String valor) throws ValorInvalidoException {
		validador.validar(valor);

		int cont = 0;
		char aux = valor.charAt(0);
		for (char a : valor.toCharArray()) {
			if (aux == a) {
				aux = a;
				cont++;
			}
		}
		/*
		 * System.out.println("tamanho do cvontador:" + cont +
		 * "tamanho do array:" + valor.length());
		 */
		if (cont == valor.length())
			throw new ValorInvalidoException("Digite numeros diferentes");
		if (valor.length() > max || valor.length() < min)
			throw new ValorInvalidoException("O tamanho minimo da senha e: "
					+ min + "\ne o tamanho maximo eh " + max);

	}

}
