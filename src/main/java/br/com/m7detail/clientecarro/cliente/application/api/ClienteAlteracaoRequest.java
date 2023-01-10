package br.com.m7detail.clientecarro.cliente.application.api;

import br.com.m7detail.clientecarro.cliente.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	private Sexo sexo;
	;

}
