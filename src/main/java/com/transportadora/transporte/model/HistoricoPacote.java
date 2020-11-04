package com.transportadora.transporte.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table
public class HistoricoPacote implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String origem;
	@NotNull
	private String localizacaoAtual;
	
	@NotNull
	private Date dataHrAtual;
	@NotNull
	private String destino;
	
	@OneToOne
	@JoinColumn(name = "pacote_id", nullable=true)
	private Pacote pacote;
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getLocalizacaoAtual() {
		return localizacaoAtual;
	}
	public void setLocalizacaoAtual(String localizacaoAtual) {
		this.localizacaoAtual = localizacaoAtual;
	}
	public Date getDataHrAtual() {
		return dataHrAtual;
	}
	public void setDataHrAtual(Date dataHrAtual) {
		this.dataHrAtual = dataHrAtual;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Pacote getPacote() {
		return pacote;
	}
	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public long getId() { 
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
