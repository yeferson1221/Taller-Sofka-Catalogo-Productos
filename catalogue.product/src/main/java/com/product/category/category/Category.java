package com.product.category.category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", length = 14, nullable = false)
	private String name;
	

    
	/**
	 * tenemos el constructor Category vacío
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */
	public Category() {
		super();
	}

	
	/**
	 * tenemos el constructor Category solo con id
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */
	public Category(Integer id) {
		super();
		this.id = id;
		
	}
	
	
	/**
	 * tenemos el constructor Category solo con el nombre
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */
	public Category(String name) {
		super();
		
		this.name = name;
	}
	
	/**
	 * tenemos el constructor Category vacío
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */
	public Category(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	/**
	 * tenemos los getter y setter
	 *
	 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
	 *
	 * @since [1.0.0]
	 *
	 */
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
