package com.productos.categoria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/**
 * se define el nombre de la tabla con el @Table
 *
 */
@Table(name = "producto")

public class Product {
	/**
	 * se define el id  @id 
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	/**
	 * se define el la columna de la tabla  @column
	 *
	 */
	@Id
	@Column(name = "name", length = 12, nullable = false)
	private String name;
	
	
	public Product() {

	}

	/**
	 * tenemos el constructor 
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */

	public Product(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		
	}

	


	/**
	 * getter y setter
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */

	
}
