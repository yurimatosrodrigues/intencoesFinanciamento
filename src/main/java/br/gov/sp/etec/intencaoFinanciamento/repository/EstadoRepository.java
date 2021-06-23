package br.gov.sp.etec.intencaoFinanciamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.etec.intencaoFinanciamento.entity.EstadoEntity;

public interface EstadoRepository  extends JpaRepository<EstadoEntity, Long> {
	List<EstadoEntity> findAll();
}
