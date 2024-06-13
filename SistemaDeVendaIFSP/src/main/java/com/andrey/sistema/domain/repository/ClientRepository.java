package com.andrey.sistema.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrey.sistema.domain.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
