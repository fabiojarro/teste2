package br.com.afip.teste2.modelo.impl;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import br.com.afip.teste2.regras.DescontoCrianca;

public class DescontoCriancasImplTest {

	@Test
	public void testDescontosCrianca() {
		DescontoCrianca segunda = DescontoCrianca.SEGUNDA;
		DescontoCrianca terca = DescontoCrianca.TERCA;
		DescontoCrianca quarta = DescontoCrianca.QUARTA;
		DescontoCrianca quinta = DescontoCrianca.QUINTA;
		DescontoCrianca sexta = DescontoCrianca.SEXTA;
		DescontoCrianca domingosabadoferiado = DescontoCrianca.DOMINGOS_SABADO_FERIADOS;
		
		DescontoCriancasImpl impl = new DescontoCriancasImpl();
		
		Assert.assertEquals(segunda.getDesconto(),impl.getDescontoSegunda());
		Assert.assertEquals(terca.getDesconto(),impl.getDescontoTerca());
		Assert.assertEquals(quarta.getDesconto(),impl.getDescontoQuarta());
		Assert.assertEquals(quinta.getDesconto(),impl.getDescontoQuinta());
		Assert.assertEquals(sexta.getDesconto(),impl.getDescontoSexta());
		Assert.assertEquals(domingosabadoferiado.getDesconto(),impl.getDescontoSabadoDomingoFeriado());
	}

}
