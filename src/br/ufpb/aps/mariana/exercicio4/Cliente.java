package br.ufpb.aps.mariana.exercicio4;

import java.util.LinkedList;


public class Cliente {
	private ListaEncadeada listaEnc;
	
	public Cliente(ListaEncadeada lista) {
			this.listaEnc = lista;
	}

	public void printElemento() {
		Iterator itEncadead = listaEnc.getIterator();
		System.out.println("-----o Elementos o-----\n");
		printElemento(itEncadead);
	}

	public void printElemento(Iterator it) {
		while (it.temProximo()) {
			Elemento e = (Elemento) it.proximo();
			System.out.println(e.getO());
		}
	}

}
