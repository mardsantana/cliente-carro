package br.com.m7detail.clientecarro.cliente.application.api;

import org.hibernate.validator.constraints.br.CPF;

import br.com.m7detail.clientecarro.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private Sexo sexo;
	@CPF
	private String cpf;

}
