package br.com.afip.teste2.regras;

public enum DescontoCrianca {
	SEGUNDA(0.9F),
	TERCA(0.85F),
	QUARTA(0.7F),
	QUINTA(1F),
	SEXTA(0.89F),
	DOMINGOS_SABADO_FERIADOS(1F);
	
	private float desconto; 
	
	DescontoCrianca(float desconto) {
		this.desconto = desconto;
	}
	public float getDesconto() {
		return desconto;
	}	
}
