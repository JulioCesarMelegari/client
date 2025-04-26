package com.jcm.clientes.dtos;

import java.time.LocalDate;

import com.jcm.clientes.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientDto {
	
	private Long id;
	
	@NotBlank(message = "Campo requerido")
	private String name;
	
	private String cpf;
	
	private Double income;
	
	@PastOrPresent(message = "não pode ser data futura")
	private LocalDate birthDate;
	
	private Integer children;

	public ClientDto(Client entity) {
		id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birthDate = entity.getBirthDate();
		this.children = entity.getChildren();
	}
}
