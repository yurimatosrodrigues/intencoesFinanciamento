package br.gov.sp.etec.intencaoFinanciamento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.intencaoFinanciamento.dto.TipoFinanciamento;
import br.gov.sp.etec.intencaoFinanciamento.entity.TipoFinanciamentoEntity;
import br.gov.sp.etec.intencaoFinanciamento.repository.TipoFinanciamentoRepository;
import br.gov.sp.etec.intencaoFinanciamento.service.TipoFinanciamentoService;

@Service
public class TipoFinanciamentoServiceImpl implements TipoFinanciamentoService {
	@Autowired
	private TipoFinanciamentoRepository repository;
		
	@Override
	public List<TipoFinanciamento> listaTipoFinanciamento() {
		List<TipoFinanciamentoEntity> tipoFinanciamentoEntity = repository.findAll();
		
		List<TipoFinanciamento> tiposFinanciamento = toFromTipoFinanciamento(tipoFinanciamentoEntity);
		
		return tiposFinanciamento;
	}	


	private List<TipoFinanciamento> toFromTipoFinanciamento(List<TipoFinanciamentoEntity> tipoFinanciamentoEntity) {
		List<TipoFinanciamento> listaTipos = new ArrayList<>();
		for(TipoFinanciamentoEntity entity : tipoFinanciamentoEntity) {
			TipoFinanciamento tipo = new TipoFinanciamento();
			tipo.setIdTipoFinanciamento(entity.getIdTipoFinanciamento());
			tipo.setTipoFinanciamento(entity.getTipoFinanciamento());
			listaTipos.add(tipo);	
		}
		return listaTipos;
	}
}
