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
@Table(name = "aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "nis")
	private Long nis;
	@Column(name = "data_de_nascimento")
	private Date dataDeNascimento;
	@Column(name = "escola_matriculada")
	private String escolaMatriculada;
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
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(Long id, String nome, Long nis, Date dataDeNascimento, String escolaMatriculada, String estado,
			String cidade, String rua, String complemento, Long cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.nis = nis;
		this.dataDeNascimento = dataDeNascimento;
		this.escolaMatriculada = escolaMatriculada;
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

	public Long getNis() {
		return nis;
	}

	public void setNis(Long nis) {
		this.nis = nis;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEscolaMatriculada() {
		return escolaMatriculada;
	}

	public void setEscolaMatriculada(String escolaMatriculada) {
		this.escolaMatriculada = escolaMatriculada;
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
		return Objects.hash(cep, cidade, complemento, dataDeNascimento, escolaMatriculada, estado, id, nis, nome, rua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(complemento, other.complemento)
				&& Objects.equals(dataDeNascimento, other.dataDeNascimento)
				&& Objects.equals(escolaMatriculada, other.escolaMatriculada) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id) && Objects.equals(nis, other.nis) && Objects.equals(nome, other.nome)
				&& Objects.equals(rua, other.rua);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", nis=" + nis + ", dataDeNascimento=" + dataDeNascimento
				+ ", escolaMatriculada=" + escolaMatriculada + ", estado=" + estado + ", cidade=" + cidade + ", rua="
				+ rua + ", complemento=" + complemento + ", cep=" + cep + "]";
	}
	
	
	
	
}