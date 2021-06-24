package br.gov.sp.etec.intencaoFinanciamento.dto;

import java.io.Serializable;
import java.util.Date;

public class IntencaoFinanciamento implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nomeCliente;
	private String enderecoLogradouro;
	private int enderecoNumero;
	private String enderecoCidade;
	private Estado enderecoEstado;
	private String enderecoCEP;
	private String cpfCliente;
	private String rgCliente;
	private Date dataNascimento;
	private String contatoEmail;
	private String contatoTelefone;
	private String contatoCelular;
	private TipoFinanciamento tipoFinanciamento;
	private int qtdParcelas;
	private Double valorIntencao;
	private Double salarioCliente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoLogradouro() {
		return enderecoLogradouro;
	}
	public void setEnderecoLogradouro(String enderecoLogradouro) {
		this.enderecoLogradouro = enderecoLogradouro;
	}
	public int getEnderecoNumero() {
		return enderecoNumero;
	}
	public void setEnderecoNumero(int enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}
	public String getEnderecoCidade() {
		return enderecoCidade;
	}
	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}
	public Estado getEnderecoEstado() {
		return enderecoEstado;
	}	
	public void setEnderecoEstado(Estado enderecoEstado) {
		this.enderecoEstado = enderecoEstado;
	}
	
	public String getEnderecoCEP() {
		return enderecoCEP;
	}
	public void setEnderecoCEP(String enderecoCEP) {
		this.enderecoCEP = enderecoCEP;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getRgCliente() {
		return rgCliente;
	}
	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getContatoEmail() {
		return contatoEmail;
	}
	public void setContatoEmail(String contatoEmail) {
		this.contatoEmail = contatoEmail;
	}
	public String getContatoTelefone() {
		return contatoTelefone;
	}
	public void setContatoTelefone(String contatoTelefone) {
		this.contatoTelefone = contatoTelefone;
	}
	public String getContatoCelular() {
		return contatoCelular;
	}
	public void setContatoCelular(String contatoCelular) {
		this.contatoCelular = contatoCelular;
	}
	public TipoFinanciamento getTipoFinanciamento() {
		return tipoFinanciamento;
	}
	public void setTipoFinanciamento(TipoFinanciamento tipoFinanciamento) {
		this.tipoFinanciamento = tipoFinanciamento;
	}
	public int getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	public Double getValorIntencao() {
		return valorIntencao;
	}
	public void setValorIntencao(Double valorIntencao) {
		this.valorIntencao = valorIntencao;
	}
	public Double getSalarioCliente() {
		return salarioCliente;
	}
	public void setSalarioCliente(Double salarioCliente) {
		this.salarioCliente = salarioCliente;
	}
	
	
}
