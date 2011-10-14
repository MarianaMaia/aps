package br.ufpb.aps.mariana.exercicio3;

public class FormularioFacade {

Formulario form = new Formulario();
	
	public void addCampo(Campo campo){
		form.addCampo(campo);
	}	 
	
	public void listarItens(){
		form.listarItens();
	}
}
