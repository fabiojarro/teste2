package br.com.afip.teste2.regras;

public enum DescontoIdosos {
	SEGUNDA(0.9F),
	TERCA(0.85F),
	QUARTA(0.6F),
	QUINTA(0.7F),
	SEXTA(1F),
	DOMINGOS_SABADO_FERIADOS(0.95F);
	
	private float desconto; 
	
	DescontoIdosos(float desconto) {
		this.desconto = desconto;
	}
	public float getDesconto() {
		return desconto;
	}
}
