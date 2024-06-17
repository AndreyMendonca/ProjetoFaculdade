package com.andrey.sistema.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrey.sistema.domain.entity.Client;
import com.andrey.sistema.domain.repository.ClientRepository;
import com.andrey.sistema.domain.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository repository;
	
	@Override
	public Client save(Client client) {
		return repository.save(client);
	}

	@Override
	public Optional<Client> findById(Long id) {
		return repository.findById(id);
		
	}

	@Override
	public List<Client> findAll() {
		return repository.findAll();
	}

	@Override
	public Void delete(Long id) {
		repository.deleteById(id);;
		return null;
	}

	@Override
	public Client update(Client client, Long id) {
		Optional<Client> obj = repository.findById(id);
		client.setId(obj.get().getId());
		return repository.save(client);
	}

}
