package com.bolsadeideas.spring.boot.bakend.apirest.models.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.spring.boot.bakend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.spring.boot.bakend.apirest.models.entyty.Cliente;

@Service
public class ClienteServisesImpl implements IClienteServices {
	@Autowired
	private IClienteDao clientedao;
	@Override
    public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clientedao.findAll();
	}

}
