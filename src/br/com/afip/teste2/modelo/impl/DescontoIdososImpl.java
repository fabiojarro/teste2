package br.com.afip.teste2.modelo.impl;

import br.com.afip.teste2.modelo.IDesconto;
import br.com.afip.teste2.regras.DescontoIdosos;

public class DescontoIdososImpl implements IDesconto {

	private DescontoIdosos descontoIdosos;

	public float getDescontoSegunda() {
		descontoIdosos = DescontoIdosos.SEGUNDA;
		return descontoIdosos.getDesconto();
	}

	public float getDescontoTerca() {
		descontoIdosos = DescontoIdosos.TERCA;
		return descontoIdosos.getDesconto();
	}


	public float getDescontoQuarta() {
		descontoIdosos = DescontoIdosos.QUARTA;
		return descontoIdosos.getDesconto();
	}

	public float getDescontoQuinta() {
		descontoIdosos = DescontoIdosos.QUINTA;
		return descontoIdosos.getDesconto();
	}

	public float getDescontoSexta() {
		descontoIdosos = DescontoIdosos.SEXTA;
		return descontoIdosos.getDesconto();
	}

	public float getDescontoSabadoDomingoFeriado() {
		descontoIdosos = DescontoIdosos.DOMINGOS_SABADO_FERIADOS;
		return descontoIdosos.getDesconto();
	}
	
}
