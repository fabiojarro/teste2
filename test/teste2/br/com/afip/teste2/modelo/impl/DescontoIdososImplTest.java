package br.com.afip.teste2.modelo.impl;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import br.com.afip.teste2.regras.DescontoEstudantes;
import br.com.afip.teste2.regras.DescontoIdosos;

public class DescontoIdososImplTest {

	@Test
	public void testDescontosEstundante() {
		DescontoIdosos segunda = DescontoIdosos.SEGUNDA;
		DescontoIdosos terca = DescontoIdosos.TERCA;
		DescontoIdosos quarta = DescontoIdosos.QUARTA;
		DescontoIdosos quinta = DescontoIdosos.QUINTA;
		DescontoIdosos sexta = DescontoIdosos.SEXTA;
		DescontoIdosos domingosabadoferiado = DescontoIdosos.DOMINGOS_SABADO_FERIADOS;
		
		DescontoIdososImpl impl = new DescontoIdososImpl();
		
		Assert.assertEquals(segunda.getDesconto(),impl.getDescontoSegunda());
		Assert.assertEquals(terca.getDesconto(),impl.getDescontoTerca());
		Assert.assertEquals(quarta.getDesconto(),impl.getDescontoQuarta());
		Assert.assertEquals(quinta.getDesconto(),impl.getDescontoQuinta());
		Assert.assertEquals(sexta.getDesconto(),impl.getDescontoSexta());
		Assert.assertEquals(domingosabadoferiado.getDesconto(),impl.getDescontoSabadoDomingoFeriado());
	}

}
