package br.ufpb.aps.mariana.exercicio3;

public class ValidadorSenha implements Validador {
	private int max = 100;
	private int min = 8;

	@Override
	public void validar(String valor) throws ValorInvalidoException {
		if (valor.length() > max || valor.length() < min)
			throw new ValorInvalidoException("O tamanho maximo da senha e: "
					+ min + "\n e o tamanho maximo eh " + max);

		int contNumeros = 0;
		for (char a : valor.toCharArray()) {
			if (Character.isDigit(a)) {
				contNumeros++;

			}

		}
		if (contNumeros < 3) {
			throw new ValorInvalidoException("Não pode ter menos que 3 numeros");
		}

	}

}
