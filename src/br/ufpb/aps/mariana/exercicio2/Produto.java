package br.ufpb.aps.mariana.exercicio2;


public class Produto implements CalculadorCusto {
	
	private String nome;
	public Double valor;
	
	
	public Produto(String nome) {
		this.nome=nome;
	}

	
	public Double getPreco(){
		return 15.0;
	}

	@Override
	public String getTipo() {
		
		return "";
	}
		
	}
