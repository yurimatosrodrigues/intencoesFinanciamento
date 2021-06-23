package br.gov.sp.etec.intencaoFinanciamento.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "tb_tipo_financiamento")
public class TipoFinanciamentoEntity {
	
	@Id
	@Column(name = "ID_TIPO_FINANCIAMENTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEG_TIPO_FINANCIAMENTO")
	@SequenceGenerator(name = "SEG_TIPO_FINANCIAMENTO", sequenceName = "SEG_TIPO_FINANCIAMENTO",allocationSize = 1)
	private Long idTipoFinanciamento;
	
	@OneToMany(mappedBy = "tipoFinanciamento")
	private List<IntencaoFinanciamentoEntity> intencao;
	
	
	public List<IntencaoFinanciamentoEntity> getIntencao() {
		return intencao;
	}
	public void setIntencao(List<IntencaoFinanciamentoEntity> intencao) {
		this.intencao = intencao;
	}
	private String tipoFinanciamento;
	
	public Long getIdTipoFinanciamento() {
		return idTipoFinanciamento;
	}
	public void setIdTipoFinanciamento(Long idTipoFinanciamento) {
		this.idTipoFinanciamento = idTipoFinanciamento;
	}
	public String getTipoFinanciamento() {
		return tipoFinanciamento;
	}
	public void setTipoFinanciamento(String tipoFinanciamento) {
		this.tipoFinanciamento = tipoFinanciamento;
	}
}
