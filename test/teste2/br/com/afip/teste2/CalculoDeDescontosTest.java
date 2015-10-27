package br.com.afip.teste2;

import static org.junit.Assert.*;

import java.util.Calendar;

import junit.framework.Assert;

import org.junit.Test;

import br.com.afip.teste2.modelo.Ingresso;
import br.com.afip.teste2.regras.TipoIngresso;
import br.com.afip.teste2.util.Util;

public class CalculoDeDescontosTest {

	@Test
	public void testDescontoSegundaFeiraSemCarteirinha(){
		boolean carteirinha = false;//Sem carteirinha		
		String data="26/10/2015"; 	//Segunda-feira
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste de Segunda-feira sem Carteirinha e com 10% de Desconto", 7.2, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Segunda-feira sem Carteirinha e com 10% de Desconto", 5.4, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Segunda-feira sem Carteirinha e com 10% de Desconto", 4.95, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoTercaFeiraSemCarteirinha(){
		boolean carteirinha = false;//Sem carteirinha		
		String data="27/10/2015"; 	//Terca-feira
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste de Terca-feira sem Carteirinha e com 5% de Desconto", 7.6, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Terca-feira sem Carteirinha e com 15% de Desconto", 5.1, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Terca-feira sem Carteirinha e com 15% de Desconto", 4.675, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoQuartaFeiraSemCarteirinha(){
		boolean carteirinha = false;//Sem carteirinha		
		String data="28/10/2015"; 	//Quarta-feira
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste de Quarta-feira sem Carteirinha e com 50% de Desconto", 4.0, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Quarta-feira sem Carteirinha e com 40% de Desconto", 3.6, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Quarta-feira sem Carteirinha e com 30% de Desconto", 3.85, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoQuintaFeiraSemCarteirinha(){
		boolean carteirinha = false;//Sem carteirinha		
		String data="29/10/2015"; 	//Quinta-feira
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste de Quinta-feira sem Carteirinha e com 30% de Desconto", 5.6, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Quinta-feira sem Carteirinha e com 30% de Desconto", 4.2, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Quinta-feira sem Carteirinha e sem Desconto", 5.5, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoSextaFeiraSemCarteirinha(){
		boolean carteirinha = false;//Sem carteirinha		
		String data="30/10/2015"; 	//Sexta-feira
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste de Sexta-feira sem Carteirinha e sem Desconto", 8.0, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Sexta-feira sem Carteirinha e sem Desconto", 6.0, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Sexta-feira sem Carteirinha e com 11% de Desconto", 4.895, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoSabadoSemCarteirinha(){
		boolean carteirinha = false;//Sem carteirinha		
		String data="31/10/2015"; 	//Sabado
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste de Sabado sem Carteirinha e com 50% de Desconto", 8.0, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Sabado sem Carteirinha e com 40% de Desconto", 5.7, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Sabado sem Carteirinha e com 30% de Desconto", 5.5, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoDomingoSemCarteirinha(){
		boolean carteirinha = false;//Sem carteirinha		
		String data="01/11/2015"; 	//Domingo
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste de Domingo sem Carteirinha e com 50% de Desconto", 8.0, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Domingo sem Carteirinha e com 40% de Desconto", 5.7, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste de Domingo sem Carteirinha e com 30% de Desconto", 5.5, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoFeriadoSemCarteirinha(){
		boolean carteirinha = false;//Sem carteirinha		
		String data="02/11/2015"; 	//Feriado Finados
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste Feriado sem Carteirinha e com 50% de Desconto", 8.0, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste Feriado sem Carteirinha e com 40% de Desconto", 5.7, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste Feriado sem Carteirinha e com 30% de Desconto", 5.5, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoComCarteirinhaDiaDaSemana(){
		boolean carteirinha = true;//Com carteirinha		
		String data="27/10/2015"; 	//Terca-feira
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste Desconto com Carteirinha Dia da Semana", 5.2, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste Desconto com Carteirinha Dia da Semana", 5.2, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste Desconto com Carteirinha Dia da Semana", 5.2, crianca.getValorcobrado(), 0.00001);		
	}
	
	@Test
	public void testDescontoComCarteirinhaSabadoDomingo(){
		boolean carteirinha = true;//Com carteirinha		
		String data="25/10/2015"; 	//Domingo
		
		Ingresso estudante = new Ingresso();
		Ingresso idoso = new Ingresso();
		Ingresso crianca = new Ingresso();
		
		CalculoDeDescontos.calculadesconto(getIngressoCrianca(crianca,data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoIdoso(idoso, data, carteirinha));
		CalculoDeDescontos.calculadesconto(getIngressoEstudante(estudante, data, carteirinha));
		
		Assert.assertEquals("Teste Desconto com Carteira de Estudante Fim de Semana", 8.0, estudante.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste Desconto com Carteira de Estudante Fim de Semana", 5.7, idoso.getValorcobrado(), 0.00001);
		Assert.assertEquals("Teste Desconto com Carteira de Estudante Fim de Semana", 5.5, crianca.getValorcobrado(), 0.00001);		
	}
	
	private Ingresso getIngressoEstudante(Ingresso estudante,String data, boolean carteirinha){		
		estudante.setData(Util.formataData(data));		
		estudante.setTipo(TipoIngresso.ESTUDANTES); 
		estudante.setCarteirinha(carteirinha);
		return estudante;
	}	
	private Ingresso getIngressoIdoso(Ingresso idoso,String data, boolean carteirinha){
		idoso.setData(Util.formataData(data));		
		idoso.setTipo(TipoIngresso.IDOSOS); 
		idoso.setCarteirinha(carteirinha);
		return idoso;
	}
	private Ingresso getIngressoCrianca(Ingresso crianca,String data, boolean carteirinha){
		crianca.setData(Util.formataData(data));		
		crianca.setTipo(TipoIngresso.CRIANCAS); 
		crianca.setCarteirinha(carteirinha);
		return crianca;
	}
}
