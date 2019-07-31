package com.bolsadeideas.spring.boot.bakend.apirest.models.entyty;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// se crea annotaciones para la creacion de ñla tabla clientes 
@Entity
@Table(name="clientes")
public class Cliente  implements Serializable{

	// anotacion para la generacion de la llave primario en la tabla de clientes 
	// con la notacion IDENTITY es para generar llaves auto incrementables 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
 // Get and Set para las propiedades 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreacion() {
		return Creacion;
	}

	public void setCreacion(Date creacion) {
		Creacion = creacion;
	}

	private String nombre;
	private String apellido;
	private String email;
	
	@Column(name="creacion")
	@Temporal(TemporalType.DATE)
	private Date Creacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
// se crea valor serializable debido a que se implemoento Serializable para la parte de 
	private static final long serialVersionUID = 1L;
}
