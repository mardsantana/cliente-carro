package br.com.m7detail.clientecarro.carro.application.api;

import br.com.m7detail.clientecarro.carro.domain.Porte;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class CarroRequest {
	@NotBlank
	private String modeloCarro;	
	private Porte porte;
	private Integer placaCarro;

}
