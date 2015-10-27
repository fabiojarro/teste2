package br.com.afip.teste2.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.afip.teste2.regras.TipoIngresso;

public class Ingresso {	
	private Calendar data = new GregorianCalendar();
	private TipoIngresso tipo;
	private float valorcobrado;
	private	boolean carteirinha = false;
	
	public boolean isCarteirinha() {
		return carteirinha;
	}
	public void setCarteirinha(boolean carteirinha) {
		this.carteirinha = carteirinha;
	}	
	public TipoIngresso getTipo() {
		return tipo;
	}
	public void setTipo(TipoIngresso tipo) {
		this.tipo = tipo;
	}
	public float getValorcobrado() {
		return valorcobrado;
	}
	public void setValorcobrado(float valorcobrado) {
		this.valorcobrado = valorcobrado;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	
	
}
