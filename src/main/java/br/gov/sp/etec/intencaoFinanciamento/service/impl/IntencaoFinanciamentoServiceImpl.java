package br.gov.sp.etec.intencaoFinanciamento.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.intencaoFinanciamento.dto.IntencaoFinanciamento;
import br.gov.sp.etec.intencaoFinanciamento.entity.EstadoEntity;
import br.gov.sp.etec.intencaoFinanciamento.entity.IntencaoFinanciamentoEntity;
import br.gov.sp.etec.intencaoFinanciamento.entity.TipoFinanciamentoEntity;
import br.gov.sp.etec.intencaoFinanciamento.repository.EstadoRepository;
import br.gov.sp.etec.intencaoFinanciamento.repository.IntencaoFinanciamentoRepository;
import br.gov.sp.etec.intencaoFinanciamento.repository.TipoFinanciamentoRepository;
import br.gov.sp.etec.intencaoFinanciamento.service.IntencaoFinanciamentoService;

@Service
public class IntencaoFinanciamentoServiceImpl implements IntencaoFinanciamentoService {

	@Autowired
	private IntencaoFinanciamentoRepository repository;
	
	@Autowired
	EstadoRepository estadoRepository;
	
	@Autowired
	TipoFinanciamentoRepository tipoFinanciamentoRepository;

	@Override
	public List<IntencaoFinanciamento> listaIntencoes() {		
		List<IntencaoFinanciamentoEntity> lista = repository.findAll();
		List<IntencaoFinanciamento> intencoes = fromTo(lista);
		return intencoes;
	}

	@Override
	public IntencaoFinanciamento salvarIntencao(IntencaoFinanciamento intencao) {
		TipoFinanciamentoEntity tipoFinanciamentoEntity = tipoFinanciamentoRepository.findById(intencao.getTipoFinanciamento().getIdTipoFinanciamento()).get();
		
		IntencaoFinanciamentoEntity entity = fromTo(intencao); 
		entity.setTipoFinanciamento(tipoFinanciamentoEntity);		
		
		EstadoEntity estadoEntity = estadoRepository.findById(intencao.getEnderecoEstado().getId()).get();
		entity.setEstado(estadoEntity);
		
		entity = repository.save(entity);
		
		IntencaoFinanciamento intencaoRetorno = fromTo(entity);
		return intencaoRetorno;
	}

	@Override
	public IntencaoFinanciamento editarIntencao(Long id) {
		IntencaoFinanciamentoEntity entity = repository.findById(id).get();		
		return fromTo(entity);
	}
	
	@Override
	public void excluirIntencao(Long id) {
		repository.deleteById(id);		
	}
	
	private List<IntencaoFinanciamento> fromTo(List<IntencaoFinanciamentoEntity> lista){
		List<IntencaoFinanciamento> listaDto = new ArrayList<>();
		for (IntencaoFinanciamentoEntity intencaoFinanciamentoEntity : lista) {
			
			IntencaoFinanciamento dto = new IntencaoFinanciamento();
			dto.setId(intencaoFinanciamentoEntity.getId());
			dto.setNomeCliente(intencaoFinanciamentoEntity.getNomeCliente());
			dto.setEnderecoLogradouro(intencaoFinanciamentoEntity.getEnderecoLogradouro());
			dto.setEnderecoNumero(intencaoFinanciamentoEntity.getEnderecoNumero());
			dto.setEnderecoCidade(intencaoFinanciamentoEntity.getEnderecoCidade());
			dto.setEnderecoCEP(intencaoFinanciamentoEntity.getEnderecoCEP());
			dto.setEnderecoNumero(intencaoFinanciamentoEntity.getEnderecoNumero());
			dto.setCpfCliente(intencaoFinanciamentoEntity.getCpfCliente());
			dto.setRgCliente(intencaoFinanciamentoEntity.getRgCliente());
			dto.setDataNascimento(intencaoFinanciamentoEntity.getDataNascimento());
			dto.setContatoEmail(intencaoFinanciamentoEntity.getContatoEmail());
			dto.setContatoTelefone(intencaoFinanciamentoEntity.getContatoTelefone());
			dto.setContatoCelular(intencaoFinanciamentoEntity.getContatoCelular());
			dto.setQtdParcelas(intencaoFinanciamentoEntity.getQtdParcelas());
			dto.setValorIntencao(intencaoFinanciamentoEntity.getValorIntencao());
			dto.setSalarioCliente(intencaoFinanciamentoEntity.getSalarioCliente());
			
			listaDto.add(dto);
		}
		return listaDto;
	}
	
	private IntencaoFinanciamentoEntity fromTo(IntencaoFinanciamento intencao){
		IntencaoFinanciamentoEntity entity =  new IntencaoFinanciamentoEntity();
		entity.setId(intencao.getId());
		entity.setNomeCliente(intencao.getNomeCliente());
		entity.setEnderecoLogradouro(intencao.getEnderecoLogradouro());
		entity.setEnderecoNumero(intencao.getEnderecoNumero());
		entity.setEnderecoCidade(intencao.getEnderecoCidade());		
		entity.setEnderecoCEP(intencao.getEnderecoCEP());
		entity.setCpfCliente(intencao.getCpfCliente());
		entity.setRgCliente(intencao.getRgCliente());
		entity.setDataNascimento(intencao.getDataNascimento());
		entity.setContatoEmail(intencao.getContatoEmail());
		entity.setContatoTelefone(intencao.getContatoTelefone());
		entity.setContatoCelular(intencao.getContatoCelular());
		entity.setQtdParcelas(intencao.getQtdParcelas());
		entity.setValorIntencao(intencao.getValorIntencao());
		entity.setSalarioCliente(intencao.getSalarioCliente());		
		return entity;
	}
	
	private IntencaoFinanciamento fromTo(IntencaoFinanciamentoEntity entity){
		IntencaoFinanciamento intencaoFinanciamento =  new IntencaoFinanciamento();
		intencaoFinanciamento.setId(entity.getId());
		intencaoFinanciamento.setNomeCliente(entity.getNomeCliente());
		intencaoFinanciamento.setEnderecoLogradouro(entity.getEnderecoLogradouro());
		intencaoFinanciamento.setEnderecoNumero(entity.getEnderecoNumero());
		intencaoFinanciamento.setEnderecoCidade(entity.getEnderecoCidade());
		intencaoFinanciamento.setEnderecoCEP(entity.getEnderecoCEP());
		intencaoFinanciamento.setCpfCliente(entity.getCpfCliente());
		intencaoFinanciamento.setRgCliente(entity.getRgCliente());
		intencaoFinanciamento.setDataNascimento(entity.getDataNascimento());
		intencaoFinanciamento.setContatoEmail(entity.getContatoEmail());
		intencaoFinanciamento.setContatoTelefone(entity.getContatoTelefone());
		intencaoFinanciamento.setContatoCelular(entity.getContatoCelular());
		intencaoFinanciamento.setQtdParcelas(entity.getQtdParcelas());
		intencaoFinanciamento.setValorIntencao(entity.getValorIntencao());
		intencaoFinanciamento.setSalarioCliente(entity.getSalarioCliente());		
		return intencaoFinanciamento;
	}


}
