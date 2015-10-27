package br.com.afip.teste2.modelo.impl;

import br.com.afip.teste2.modelo.IDesconto;
import br.com.afip.teste2.regras.DescontoCrianca;

public class DescontoCriancasImpl implements IDesconto {
	
	private DescontoCrianca descontoCrianca;

	public float getDescontoSegunda() {
		descontoCrianca = DescontoCrianca.SEGUNDA;
		return descontoCrianca.getDesconto();
	}

	public float getDescontoTerca() {
		descontoCrianca = DescontoCrianca.TERCA;
		return descontoCrianca.getDesconto();
	}


	public float getDescontoQuarta() {
		descontoCrianca = DescontoCrianca.QUARTA;
		return descontoCrianca.getDesconto();
	}

	public float getDescontoQuinta() {
		descontoCrianca = DescontoCrianca.QUINTA;
		return descontoCrianca.getDesconto();
	}

	public float getDescontoSexta() {
		descontoCrianca = DescontoCrianca.SEXTA;
		return descontoCrianca.getDesconto();
	}

	public float getDescontoSabadoDomingoFeriado() {
		descontoCrianca = DescontoCrianca.DOMINGOS_SABADO_FERIADOS;
		return descontoCrianca.getDesconto();
	}
}
