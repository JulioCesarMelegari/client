package com.jcm.clientes.dtos;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomError {
	
	private Instant timestamp;
	private Integer status;
	private String error;
	private String path;
	
}
