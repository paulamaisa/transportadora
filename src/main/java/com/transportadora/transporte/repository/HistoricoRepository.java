package com.transportadora.transporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transportadora.transporte.model.HistoricoPacote;

public interface HistoricoRepository extends JpaRepository<HistoricoPacote, Long>{

}
