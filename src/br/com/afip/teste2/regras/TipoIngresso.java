package br.com.afip.teste2.regras;

public enum TipoIngresso {
	
	/** 
	 * Aqui podemos adicionar mais tipo de ingressos como NORMAL, MULHERES, FUNCIONARIOS, etc e o 
	 * respectivo valor do ingresso sem desconto. 
	 */
	
	CRIANCAS(5.5F),
	ESTUDANTES(8F),
	IDOSOS(6F);
	
	private float valor;
	
	TipoIngresso(float valor){ 
		this.valor = valor;
    }
	
	public float getValor() {
		return this.valor;
	}
}
