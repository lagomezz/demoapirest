package com.bolsadeideas.spring.boot.bakend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.spring.boot.bakend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.spring.boot.bakend.apirest.models.entyty.Cliente;

@RestController
@RequestMapping("/api")
public class ClienterestContrller {
	
	@Autowired
	private IClienteDao clientedao;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		
		return (List<Cliente>) clientedao.findAll();
		
	}
}
