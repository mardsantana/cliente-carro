package br.com.m7detail.clientecarro.carro.application.service;

import java.util.UUID;

import br.com.m7detail.clientecarro.carro.application.api.CarroRequest;
import br.com.m7detail.clientecarro.carro.application.api.CarroResponse;
import jakarta.validation.Valid;

public interface CarroService {
	CarroResponse criaCarro(UUID idCliente, @Valid CarroRequest carroRequest);

}
