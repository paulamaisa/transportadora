package com.transportadora.transporte.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table
public class Pacote implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private String dataPostagem;
	@NotNull
	private String origem;
	
	@NotNull 
	private String destino;

	@NotNull
	private Long codRastreio;

	@Enumerated(EnumType.STRING)
	private StatusPacote statusPacote;
		
	@OneToOne( cascade = CascadeType.ALL)
	private HistoricoPacote historico = new HistoricoPacote();
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(String dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public StatusPacote getStatusPacote() {
		return statusPacote;
	}

	public void setStatusPacote(StatusPacote statusPacote) {
		this.statusPacote = statusPacote;
	}

	public HistoricoPacote getHistorico() {
		return historico;
	}

	public void setHistorico(HistoricoPacote historico) {
		this.historico = historico;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Long getCodRastreio() {
		return codRastreio;
	}

	public void setCodRastreio(Long codRastreio) {
		this.codRastreio = codRastreio;
	}

}