package br.gov.sp.etec.intencaoFinanciamento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.intencaoFinanciamento.dto.Estado;
import br.gov.sp.etec.intencaoFinanciamento.entity.EstadoEntity;
import br.gov.sp.etec.intencaoFinanciamento.repository.EstadoRepository;
import br.gov.sp.etec.intencaoFinanciamento.service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService {
	@Autowired
	private EstadoRepository repository;
		
	@Override
	public List<Estado> listaEstados() {
		List<EstadoEntity> estadoEntity = repository.findAll();
		
		List<Estado> estados = toFromEstado(estadoEntity);
		
		return estados;
	}	


	private List<Estado> toFromEstado(List<EstadoEntity> estadoEntity) {
		List<Estado> listaEstados = new ArrayList<>();
		for(EstadoEntity entity : estadoEntity) {
			Estado estado = new Estado();
			estado.setId(entity.getId());
			estado.setUF(entity.getUF());
			estado.setNome(entity.getNome());
			listaEstados.add(estado);	
		}
		return listaEstados;
	}
}
