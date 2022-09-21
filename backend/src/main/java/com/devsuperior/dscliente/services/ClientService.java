package com.devsuperior.dscliente.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscliente.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository repository;

}
