package com.jcm.clientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcm.clientes.dtos.ClientDto;
import com.jcm.clientes.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
    @GetMapping
    public ResponseEntity<Page<ClientDto>> findAll(Pageable pageable){
    	Page<ClientDto> dto = clientService.findAll(pageable);
    	return ResponseEntity.ok(dto);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDto> findById(@PathVariable("id") Long id){
    	ClientDto dto =  clientService.findById(id);
    	return ResponseEntity.ok(dto);
    }

}
