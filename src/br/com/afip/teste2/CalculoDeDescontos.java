package br.com.afip.teste2;

import java.util.Calendar;

import br.com.afip.teste2.modelo.IDesconto;
import br.com.afip.teste2.modelo.Ingresso;
import br.com.afip.teste2.modelo.impl.DescontoCriancasImpl;
import br.com.afip.teste2.modelo.impl.DescontoEstudantesImpl;
import br.com.afip.teste2.modelo.impl.DescontoIdososImpl;
import br.com.afip.teste2.regras.DescontoComDocumentos;
import br.com.afip.teste2.regras.TipoIngresso;
import br.com.afip.teste2.util.Util;

public final class CalculoDeDescontos{
	
	Ingresso ingresso;
	
	public static void calculadesconto(Ingresso ingresso) {
		
		int diaDaSemana = ingresso.getData().get(Calendar.DAY_OF_WEEK);
		
		if (diaDaSemana != 1 && diaDaSemana != 7 && ingresso.isCarteirinha()){
			
			ingresso.setValorcobrado(calculoCarteirinha());		
			
		}else{
			
			String tipo = ingresso.getTipo().name();
			IDesconto desconto = null;
			
			if(tipo.equals(TipoIngresso.CRIANCAS.name())){			
				desconto = new DescontoCriancasImpl();
			}
			
			if(tipo.equals(TipoIngresso.ESTUDANTES.name())){			
				desconto = new DescontoEstudantesImpl();
			}		
			
			if(tipo.equals(TipoIngresso.IDOSOS.name())){
				desconto = new DescontoIdososImpl();			
			}
			
			if(desconto == null){
				System.out.println("Não foi possível identificar o tipo de Ingresso");
			}else{
				ingresso.setValorcobrado(calculo(ingresso,desconto));
			}			
		}

	}
	
	private static float calculo(Ingresso ingresso,IDesconto desconto){
		
		int diadasemana = ingresso.getData().get(Calendar.DAY_OF_WEEK);
		float valorDoIngresso = ingresso.getTipo().getValor();
		//Feriado
		if(Util.isFeriado(ingresso.getData())){
			return  valorDoIngresso * desconto.getDescontoSabadoDomingoFeriado() ;
		}
		//Sabado e Domingo
		if(diadasemana==7 || diadasemana==1 ){
			return valorDoIngresso * desconto.getDescontoSabadoDomingoFeriado() ;
		}
		//Segunda-Feira
		if(diadasemana==2){
			return valorDoIngresso * desconto.getDescontoSegunda();
		}
		//Terca-Feira
		if(diadasemana==3){
			return valorDoIngresso * desconto.getDescontoTerca();
		}
		//Quarta-feira
		if(diadasemana==4){
			return valorDoIngresso * desconto.getDescontoQuarta();
		}
		//Quinta-feira
		if(diadasemana==5){
			return valorDoIngresso * desconto.getDescontoQuinta();
		}
		//Sexta-feira
		if(diadasemana==6){
			return valorDoIngresso * desconto.getDescontoSexta() ;
		}
		
		return ingresso.getTipo().getValor();
	}
	
	private static float calculoCarteirinha(){
		DescontoComDocumentos descontoComDocumentos = DescontoComDocumentos.ESTUDANTE;
		TipoIngresso tipo = TipoIngresso.ESTUDANTES;
		return descontoComDocumentos.getDesconto() * tipo.getValor();		
	}
}
