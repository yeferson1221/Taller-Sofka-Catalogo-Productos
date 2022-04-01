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
@Table(name = "usuario")

public class User {
	
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
		@Column(name = "usu_username", length = 12, nullable = false)
		private String usu_username;
		/**
		 * se define el la columna de la tabla  @column
		 *
		 */
		@Column(name = "usu_password", length = 50, nullable = false)
		private Long  usu_password;
		
		public User() {

		}

		/**
		 * tenemos el constructor 
		 *
		 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
		 *
		 * @since [1.0.0]
		 *
		 */

		public User(Long id, String usu_username, Long usu_password) {
			super();
			this.id = id;
			this.usu_username = usu_username;
			this.usu_password = usu_password;
			
		}

		


		/**
		 * getter y setter
		 *
		 * @author [Yeferson Valencia, alejandro.yandd@gmail.com.
		 *
		 * @since [1.0.0]
		 *
		 */

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsu_username() {
			return usu_username;
		}

		public void setUsu_username(String usu_username) {
			this.usu_username = usu_username;
		}

		public Long getUsu_password() {
			return usu_password;
		}

		public void setUsu_password(Long usu_password) {
			this.usu_password = usu_password;
		}


	}

