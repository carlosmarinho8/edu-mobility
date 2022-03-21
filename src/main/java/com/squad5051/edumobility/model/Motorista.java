package com.squad5051.edumobility.model;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "motorista")
public class Motorista {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "data_de_nascimento")
	private Date dataDeNascimento;
	@Column(name = "modelo_do_veiculo")
	private String modeloDoVeiculo;
	@Column(name = "placa_do_veiculo")
	private String placaDoveiculo;
	@Column(name = "CNH")
	private Long cnh;
	@Column(name = "area_de_atuacao")
	private String areaDeAtuacao;
	@Column(name = "estado")
	private String estado;
	@Column(name = "cidade")
	private String cidade;
	@Column(name = "rua")
	private String rua;
	@Column(name = "complemento")
	private String complemento;
	@Column(name = "cep")
	private Long cep;
	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Motorista(Long id, String nome, Date dataDeNascimento, String modeloDoVeiculo, String placaDoVeiculo,
			Long cnh, String areaDeAtuacao, String estado, String cidade, String rua, String complemento, Long cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.modeloDoVeiculo = modeloDoVeiculo;
		this.placaDoveiculo = placaDoVeiculo;
		this.cnh = cnh;
		this.areaDeAtuacao = areaDeAtuacao;
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.complemento = complemento;
		this.cep = cep;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getModeloDoVeiculo() {
		return modeloDoVeiculo;
	}
	public void setModeloDoVeiculo(String modeloDoVeiculo) {
		this.modeloDoVeiculo = modeloDoVeiculo;
	}
	public String getPlacaDoVeiculo() {
		return placaDoveiculo;
	}
	public void setPlacaDoVeiculo(String placaDoVeiculo) {
		this.placaDoveiculo = placaDoVeiculo;
	}
	public Long getCnh() {
		return cnh;
	}
	public void setCnh(Long cnh) {
		this.cnh = cnh;
	}
	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}
	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	@Override
	public int hashCode() {
		return Objects.hash(areaDeAtuacao, cep, cidade, cnh, complemento, dataDeNascimento, estado, id, modeloDoVeiculo,
				nome, placaDoveiculo, rua);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorista other = (Motorista) obj;
		return Objects.equals(areaDeAtuacao, other.areaDeAtuacao) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(cnh, other.cnh)
				&& Objects.equals(complemento, other.complemento)
				&& Objects.equals(dataDeNascimento, other.dataDeNascimento) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(modeloDoVeiculo, other.modeloDoVeiculo)
				&& Objects.equals(nome, other.nome) && Objects.equals(placaDoveiculo, other.placaDoveiculo)
				&& Objects.equals(rua, other.rua);
	}
	@Override
	public String toString() {
		return "Motorista [id=" + id + ", nome=" + nome + ", dataDeNascimento=" + dataDeNascimento
				+ ", modeloDoVeiculo=" + modeloDoVeiculo + ", placaDoVeiculo=" + placaDoveiculo + ", cnh=" + cnh
				+ ", areaDeAtuacao=" + areaDeAtuacao + ", estado=" + estado + ", cidade=" + cidade + ", rua=" + rua
				+ ", complemento=" + complemento + ", cep=" + cep + "]";
	}
	
	
	
}
