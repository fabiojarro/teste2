package br.com.afip.teste2.modelo.impl;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import br.com.afip.teste2.regras.DescontoCrianca;
import br.com.afip.teste2.regras.DescontoEstudantes;

public class DescontoEstudantesImplTest {

	
	@Test
	public void testDescontosEstundante() {
		DescontoEstudantes segunda = DescontoEstudantes.SEGUNDA;
		DescontoEstudantes terca = DescontoEstudantes.TERCA;
		DescontoEstudantes quarta = DescontoEstudantes.QUARTA;
		DescontoEstudantes quinta = DescontoEstudantes.QUINTA;
		DescontoEstudantes sexta = DescontoEstudantes.SEXTA;
		DescontoEstudantes domingosabadoferiado = DescontoEstudantes.DOMINGOS_SABADO_FERIADOS;
		
		DescontoEstudantesImpl impl = new DescontoEstudantesImpl();
		
		Assert.assertEquals(segunda.getDesconto(),impl.getDescontoSegunda());
		Assert.assertEquals(terca.getDesconto(),impl.getDescontoTerca());
		Assert.assertEquals(quarta.getDesconto(),impl.getDescontoQuarta());
		Assert.assertEquals(quinta.getDesconto(),impl.getDescontoQuinta());
		Assert.assertEquals(sexta.getDesconto(),impl.getDescontoSexta());
		Assert.assertEquals(domingosabadoferiado.getDesconto(),impl.getDescontoSabadoDomingoFeriado());
	}

}
