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
@Table(name = "tb_estado")
public class EstadoEntity {	
	
	@Id
	@Column(name = "id_estado")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEG_ESTADO")
	@SequenceGenerator(name = "SEG_ESTADO", sequenceName = "SEG_ESTADO",allocationSize = 1)
	private Long id;
	
	@OneToMany(mappedBy = "enderecoEstado")
	private List<IntencaoFinanciamentoEntity> intencao;	
	
		
	public List<IntencaoFinanciamentoEntity> getIntencao() {
		return intencao;
	}	
	public void setIntencao(List<IntencaoFinanciamentoEntity> intencao) {
		this.intencao = intencao;
	}
	private String UF;
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUF() {
		return UF;
	}
	public void setUF(String uf) {
		UF = uf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
