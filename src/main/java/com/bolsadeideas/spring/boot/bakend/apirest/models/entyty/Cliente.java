package com.bolsadeideas.spring.boot.bakend.apirest.models.entyty;

import java.util.Date;

public class Cliente {

	private Long id;

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
	private Date Creacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
