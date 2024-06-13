package com.andrey.sistema.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.andrey.sistema.domain.entity.Client;

@Service
public interface ClientService {
	Client save(Client client);
	Client findById(Long id);
	List<Client> findAll();
	Void delete(Long id);
	Client update(Client cliente, Long id);
}
