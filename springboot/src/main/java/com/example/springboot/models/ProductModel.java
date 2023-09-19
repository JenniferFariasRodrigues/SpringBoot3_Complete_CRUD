package com.example.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_products")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")	
	private UUID id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "valor")
	private BigDecimal valor;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}


// **** Original code *******//
// @Entity
// @Table(name = "tb_products")
// public class ProductModel extends RepresentationModel<ProductModel> implements Serializable{
// 	private static final long serialVersionUID = 1L;

// 	@Id
// 	@GeneratedValue(strategy=GenerationType.AUTO)
// 	private UUID idProduct;
// 	private String name;
// 	private BigDecimal value;

// 	public UUID getIdProduct() {
// 		return idProduct;
// 	}

// 	public void setIdProduct(UUID idProduct) {
// 		this.idProduct = idProduct;
// 	}

// 	public String getName() {
// 		return name;
// 	}

// 	public void setName(String name) {
// 		this.name = name;
// 	}

// 	public BigDecimal getValue() {
// 		return value;
// 	}

// 	public void setValue(BigDecimal value) {
// 		this.value = value;
// 	}
// }

// **** withouth UUID *****//
// @Entity
// @Table(name = "tb_products")
// public class ProductModel {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id")
//     private Long id;

//     @Column(name = "nome")
//     private String nome;

//     @Column( name = "valor")
//     private BigDecimal valor;

// 	public Long getId() {
// 		return this.id;
// 	}

// 	public void setId(Long id) {
// 		this.id = id;
// 	}

// 	public String getNome() {
// 		return this.nome;
// 	}

// 	public void setNome(String nome) {
// 		this.nome = nome;
// 	}

// 	public BigDecimal getValor() {
// 		return valor;
// 	}

// 	public void setValor(BigDecimal valor) {
// 		this.valor= valor;
// 	}
// }

