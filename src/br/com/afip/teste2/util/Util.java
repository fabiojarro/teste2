package br.com.afip.teste2.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.afip.teste2.regras.Feriados;

public final class Util {
	public static Calendar formataData(String data){
		Calendar cal = Calendar.getInstance();;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");			
		try {
			cal.setTime(sdf.parse(data));
		} catch (ParseException e) {
			System.out.println("Data no formato incorreto");
		}
		
		return cal;
	}
	
	public static Calendar formataDataFeriado(String data){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");			
		try {
			cal.setTime(sdf.parse(data));
		} catch (ParseException e) {
			System.out.println("Data no formato incorreto");
		}
		
		return cal;
	}
	
	public static boolean isFeriado(Calendar cal) {
		for (Feriados feriado : Feriados.values() ){
			if(cal.get(Calendar.MONTH)==feriado.getData().get(Calendar.MONTH) &&
			   cal.get(Calendar.DAY_OF_MONTH)==feriado.getData().get(Calendar.DAY_OF_MONTH)){
				return true;
			}
		}
		return false;
	}
}
