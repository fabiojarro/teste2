package br.com.afip.teste2.regras;

public enum DescontoEstudantes {
	SEGUNDA(0.9F),
	TERCA(0.95F),
	QUARTA(0.5F),
	QUINTA(0.7F),
	SEXTA(1F),
	DOMINGOS_SABADO_FERIADOS(1F);
	
	private float desconto; 
	
	DescontoEstudantes(float desconto) {
		this.desconto = desconto;
	}
	public float getDesconto() {
		return desconto;
	}
}
