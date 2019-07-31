package com.bolsadeideas.spring.boot.bakend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.spring.boot.bakend.apirest.models.entyty.Cliente;



public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
