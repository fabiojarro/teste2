package br.com.afip.teste2.modelo.impl;

import br.com.afip.teste2.modelo.IDesconto;
import br.com.afip.teste2.regras.DescontoEstudantes;

public class DescontoEstudantesImpl implements IDesconto {

	private DescontoEstudantes descontoEstudantes;

	public float getDescontoSegunda() {
		descontoEstudantes = DescontoEstudantes.SEGUNDA;
		return descontoEstudantes.getDesconto();
	}

	public float getDescontoTerca() {
		descontoEstudantes = DescontoEstudantes.TERCA;
		return descontoEstudantes.getDesconto();
	}


	public float getDescontoQuarta() {
		descontoEstudantes = DescontoEstudantes.QUARTA;
		return descontoEstudantes.getDesconto();
	}

	public float getDescontoQuinta() {
		descontoEstudantes = DescontoEstudantes.QUINTA;
		return descontoEstudantes.getDesconto();
	}

	public float getDescontoSexta() {
		descontoEstudantes = DescontoEstudantes.SEXTA;
		return descontoEstudantes.getDesconto();
	}

	public float getDescontoSabadoDomingoFeriado() {
		descontoEstudantes = DescontoEstudantes.DOMINGOS_SABADO_FERIADOS;
		return descontoEstudantes.getDesconto();
	}
}
