package br.com.afip.teste2.regras;

import java.util.Calendar;

import br.com.afip.teste2.util.Util;

public enum Feriados {
	
	/**Aqui os feriados pode ser cadastrados,
	 * pois alguns feriados podem mudar de data ou podem ser criados
	 */
	DIA_DO_TRABALHO("01/05"),
	FINADOS("02/11"),
	NATAL("25/12");
	
	private Calendar data = Calendar.getInstance();;
	
	Feriados(String data){
		this.data = Util.formataDataFeriado(data);
	}
	
	public Calendar getData() {
		return data;
	}
}
