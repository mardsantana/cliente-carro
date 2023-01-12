package br.com.m7detail.clientecarro.carro.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class CarroController implements CarroAPI {

	@Override
	public CarroResponse postCarro(UUID idCliente, @Valid CarroRequest carroRequest) {
		log.info("[inicia] CarroController - postCarro");
		log.info("[idCliente] {}", idCliente);
		log.info("[finaliza] CarroController - postCarro");
		return null;
	}

}
