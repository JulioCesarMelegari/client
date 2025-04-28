package com.jcm.clientes.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jcm.clientes.dtos.ClientDto;
import com.jcm.clientes.services.ClientService;

import jakarta.validation.Valid;

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
    
    @PostMapping
    public ResponseEntity<ClientDto> insert(@Valid @RequestBody ClientDto dto){
    	dto = clientService.insert(dto);
    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    				.buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
    
    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientDto> update(@PathVariable("id") Long id, @Valid @RequestBody ClientDto dto){
    	dto =  clientService.update(id,dto);
    	return ResponseEntity.ok(dto);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
    	clientService.delete(id);
    	return ResponseEntity.noContent().build();
    }

}
