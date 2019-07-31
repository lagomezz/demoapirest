package com.bolsadeideas.spring.boot.bakend.apirest.models.service;

import java.util.List;

import com.bolsadeideas.spring.boot.bakend.apirest.models.entyty.Cliente;

public interface IClienteServices {
	
	public List<Cliente> findAll();
}