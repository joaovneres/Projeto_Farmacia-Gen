package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@NotBlank
	@Size(min=5, max=100)
	private String nomeCategoria;
	
	@NotBlank
	@Size(min=1, max=20)
	private String setorCategoria;

	@OneToMany(mappedBy = "oCategoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("oCategoria")
	private List<Produto> oProduto;
	
	public List<Produto> getoProduto() {
		return oProduto;
	}

	public void setoProduto(List<Produto> oProduto) {
		this.oProduto = oProduto;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getSetorCategoria() {
		return setorCategoria;
	}

	public void setSetorCategoria(String setorCategoria) {
		this.setorCategoria = setorCategoria;
	}
	
}
