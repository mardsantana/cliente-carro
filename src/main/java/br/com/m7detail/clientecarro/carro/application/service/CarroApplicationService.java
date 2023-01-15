package br.com.m7detail.clientecarro.carro.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.m7detail.clientecarro.carro.application.api.CarroRequest;
import br.com.m7detail.clientecarro.carro.application.api.CarroResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CarroApplicationService implements CarroService {

	@Override
	public CarroResponse criaCarro(UUID idCliente, @Valid CarroRequest carroRequest) {
		log.info("[start] CarroApplicationService - criaCarro");
		
		log.info("[finish] CarroApplicationService - criaCarro");
		return null;
	}

}
