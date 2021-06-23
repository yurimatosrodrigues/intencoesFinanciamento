package br.gov.sp.etec.intencaoFinanciamento.service;

import java.util.List;

import br.gov.sp.etec.intencaoFinanciamento.dto.IntencaoFinanciamento;

public interface IntencaoFinanciamentoService {
	List<IntencaoFinanciamento> listaIntencoes();
	IntencaoFinanciamento salvarIntencao(IntencaoFinanciamento intencao);
}
