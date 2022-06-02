package com.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")


public class Produto {

	@Id
	@GeneratedValue
	private Long idProduto;
	
	@NotBlank
	@Size(min=5, max=100)
	private String nomeProduto;
	
	@NotBlank
	private Double valorProduto;
	
	@NotBlank
	private Double valorCompraProduto;
	
	@NotBlank
	private Integer qtdProduto;
	
	@ManyToOne
	@JsonIgnoreProperties("oProduto")
	private Categoria oCategoria;

	public Categoria getoCategoria() {
		return oCategoria;
	}

	public void setoCategoria(Categoria oCategoria) {
		this.oCategoria = oCategoria;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Double getValorCompraProduto() {
		return valorCompraProduto;
	}

	public void setValorCompraProduto(Double valorCompraProduto) {
		this.valorCompraProduto = valorCompraProduto;
	}

	public Integer getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(Integer qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public Categoria getIdCategoria() {
		return oCategoria;
	}

	public void setIdCategoria(Categoria oCategoria) {
		this.oCategoria = oCategoria;
	}
	
}