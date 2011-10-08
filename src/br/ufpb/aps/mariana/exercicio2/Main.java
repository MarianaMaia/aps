package br.ufpb.aps.mariana.exercicio2;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Produto file = new Produto("File");
		
		
		CustoAquisicaoDecorator custoBase = new CustoAquisicaoDecorator(file);
		custoBase.setTipo("File");
		custoBase.setPreco(15.0);
		
		CustoFuncionarioDecorator func = new CustoFuncionarioDecorator(custoBase);
		func.setTipo("moscou");
		func.setPreco(10.0);
		
		CustoIngredienteDecorator sal = new CustoIngredienteDecorator(func);
		sal.setTipo("Sal");
		sal.setPreco(0.30);
		
		CustoIngredienteDecorator oleo = new CustoIngredienteDecorator(sal);
		oleo.setTipo("Oleo");
		oleo.setPreco(5.0);
		
		CustoIngredienteDecorator cebola = new CustoIngredienteDecorator(oleo);
		cebola.setTipo("Cebola");
		cebola.setPreco(0.75);
		
	
		imprimirValor(cebola);
		
		
	}		
		private static void imprimirValor(CalculadorCusto v){
			System.out.println("Preco do produto "+v.getTipo()+":"+ v.getPreco());
		}
}