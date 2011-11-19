package br.ufpb.aps.mariana.exercicio4;

import java.util.LinkedList;

public class ListaEncadeadaConcreta implements ListaEncadeada {
	LinkedList <Object>lista = new LinkedList <Object>();

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		lista.add(o);
		
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		
		return new IteratroConcreto(lista);
	}

}
