package br.gov.sp.etec.intencaoFinanciamento.dto;


public class Estado {	
	private Long id;
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
