package br.ufpb.aps.mariana.exercicio4;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class IteratroConcreto implements Iterator{
	LinkedList lista ;
	int position = 0;
	public IteratroConcreto(LinkedList lista2) {
		this.lista = new LinkedList();
		this.lista.addAll(lista2);
	}

	@Override
	public boolean temProximo() {
			return position < lista.size();
	}

	@Override
	public Object proximo() {
		position++;
		try {
		return lista.get(position-1);
		
		}catch(NoSuchElementException e){
			return null;
		}catch (Exception e2){
			return null;
		}
	}
		
}
