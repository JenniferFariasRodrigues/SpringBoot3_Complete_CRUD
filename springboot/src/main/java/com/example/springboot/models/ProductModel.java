package com.example.springboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


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

@Entity
@Table(name = "tb_usuarios")
public class ProductModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(unique = true, name = "email")
    private String email;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}