package br.ufpb.aps.mariana.exercicio4;

public class ClienteTeste {
	public static void main(String args[]) {
		ListaEncadeada lista = new ListaEncadeadaConcreta();
		
		lista.add(new Elemento (1));
		lista.add(new Elemento (2));
		lista.add(new Elemento (3));
		lista.add(new Elemento (4));
		
		Cliente cli = new Cliente (lista);
		
		cli.printElemento();
		
	}
}
