package com.jcm.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcm.clientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
