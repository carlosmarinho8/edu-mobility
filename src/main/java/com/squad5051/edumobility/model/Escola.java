package com.squad5051.edumobility.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "escola")

public class Escola {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "matricula_escola")
	private Long matriculaEscola;
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
	public Escola() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Escola(Long id, String nome, Long matriculaEscola, String estado, String cidade, String rua,
			String complemento, Long cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.matriculaEscola = matriculaEscola;
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
	public Long getMatriculaEscola() {
		return matriculaEscola;
	}
	public void setMatriculaEscola(Long matriculaEscola) {
		this.matriculaEscola = matriculaEscola;
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
		return Objects.hash(cep, cidade, complemento, estado, id, matriculaEscola, nome, rua);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escola other = (Escola) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(complemento, other.complemento) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(matriculaEscola, other.matriculaEscola)
				&& Objects.equals(nome, other.nome) && Objects.equals(rua, other.rua);
	}
	@Override
	public String toString() {
		return "Escola [id=" + id + ", nome=" + nome + ", matriculaEscola=" + matriculaEscola + ", estado=" + estado
				+ ", cidade=" + cidade + ", rua=" + rua + ", complemento=" + complemento + ", cep=" + cep + "]";
	}
	
	
}
