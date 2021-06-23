package br.gov.sp.etec.intencaoFinanciamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.etec.intencaoFinanciamento.entity.TipoFinanciamentoEntity;


public interface TipoFinanciamentoRepository  extends JpaRepository<TipoFinanciamentoEntity, Long>{
	List<TipoFinanciamentoEntity> findAll();	
}
