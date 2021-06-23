package br.gov.sp.etec.intencaoFinanciamento.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.etec.intencaoFinanciamento.entity.IntencaoFinanciamentoEntity;

public interface IntencaoFinanciamentoRepository extends JpaRepository<IntencaoFinanciamentoEntity, Long>{	
}