package br.com.afip.teste2.regras;

public enum DescontoComDocumentos {
	ESTUDANTE(0.65F);
	private float desconto;
	
	DescontoComDocumentos(float desconto){
		this.desconto = desconto;
	}

	public float getDesconto() {
		return desconto;
	}
	

}
