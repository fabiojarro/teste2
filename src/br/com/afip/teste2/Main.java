package br.com.afip.teste2;


import br.com.afip.teste2.modelo.Ingresso;

import br.com.afip.teste2.regras.TipoIngresso;
import br.com.afip.teste2.util.Util;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**Definindo a Data do Ingresso**/
		String data="27/10/2015";
		
		/**Definindo se existe a apresentacao da Carteirinha,
		 * neste caso a Tipo de Ingresso é desconsiderado e o cálculo ocorre sobre o valor do
		 * ingresso do Estudante.
		 */
		boolean carteirinha = false;
		
		/**Definindo o Tipo de Ingresso é possível colocar Idosos,Crianças e Estudantes**/	
		TipoIngresso tipo = TipoIngresso.CRIANCAS;
		
		/**Criando o ingresso**/		
		Ingresso ingresso = new Ingresso();		
		ingresso.setData(Util.formataData(data));		
		ingresso.setTipo(tipo); 
		ingresso.setCarteirinha(carteirinha);
		
		/** Calculando o valor do ingresso**/
		CalculoDeDescontos.calculadesconto(ingresso);
		
		System.out.println(ingresso.getValorcobrado());
		
	}

}
