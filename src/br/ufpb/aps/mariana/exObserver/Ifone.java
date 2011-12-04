package br.ufpb.aps.mariana.exObserver;
public class Ifone implements CTlistner{
	
	
	public Ifone() {
		
	}
	public void EventoChamadaRecebida(Evento e){	
		if(e.getSinal().getTipo().equals("sinalVoz"))
			Tocar();		
	}
	public void Tocar(){
		
		 System.out.print("tocar");
	}
}
