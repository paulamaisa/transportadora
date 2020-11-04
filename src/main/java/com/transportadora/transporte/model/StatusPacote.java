package com.transportadora.transporte.model;

public enum StatusPacote {

POSTADO("POSTADO"),
EM_TRANSITO("EM_TRANSITO"),
NAO_ENTREGUE("NAO_ENTREGUE"), 
ENTREGUE("ENTREGUE");

	public String situacao;
	
	StatusPacote(String situacao) {
		this.situacao = situacao;
	}

}
